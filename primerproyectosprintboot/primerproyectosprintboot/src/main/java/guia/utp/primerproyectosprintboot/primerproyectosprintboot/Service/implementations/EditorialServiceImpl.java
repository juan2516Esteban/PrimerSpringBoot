package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.implementations;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.EditorialEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository.EditorialRepository;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.EditorialService;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.adaptaer.EditorialAdapter;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.EditorialDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.EditorialResponse;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EditorialServiceImpl implements EditorialService , EditorialAdapter {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public EditorialDTO crearEditorial(EditorialDTO editorialDTO) {

        EditorialEntity editorialEntity = modelMapper.map(editorialDTO,EditorialEntity.class);

        editorialEntity = editorialRepository.save(editorialEntity);

        return modelMapper.map(editorialEntity,EditorialDTO.class);
    }

    @Override
    public EditorialResponse obtenerEditorial(Integer id) {

        EditorialEntity editorialEntitys = editorialRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("No existen editoriales bajo este ID: "+ id));

          editorialEntitys.getLibro().stream().map(editorialEntity -> modelMapper
                .map(editorialEntity,EditorialResponse.class))
                .collect(Collectors.toList());

        return modelMapper.map(editorialEntitys,EditorialResponse.class);
    }
}
