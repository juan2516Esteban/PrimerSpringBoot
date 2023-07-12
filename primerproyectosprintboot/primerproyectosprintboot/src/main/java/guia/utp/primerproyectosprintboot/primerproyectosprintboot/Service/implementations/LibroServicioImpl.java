package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.implementations;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository.LibroRepository;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.LibroServicio;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.adaptaer.EditorialAdapter;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.LibroEditorialResponse;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class LibroServicioImpl implements LibroServicio {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EditorialAdapter editorialAdapter;
    @Override
    public LibroDTO crearLibro(LibroDTO libroDTO) {

        if(libroDTO.getNombre().isEmpty()) throw new BadRequestException("Los libros no pueden tener el nombre vacío");
        if(libroDTO.getEditorial().getId() == null)
            libroDTO.setEditorial(editorialAdapter.crearEditorial(libroDTO.getEditorial()));

        LibroEntity libroEntity = modelMapper.map(libroDTO,LibroEntity.class);


        libroEntity = libroRepository.save(libroEntity);

        return modelMapper.map(libroEntity,LibroDTO.class);
    }

    @Override
    public LibroDTO obtenerLibro(Integer id) {

        LibroEntity libroEntitY = libroRepository.findById(id).get();

        return modelMapper.map(libroEntitY,LibroDTO.class);
    }

    @Override
    public String eliminarLibro(Integer id) {
        return null;
    }

    @Override
    public String modificarLibro(Integer id, LibroDTO libroDTO) {
        return null;
    }

    @Override
    public List<LibroEditorialResponse> obtenerLibroPorEditorial(Integer edi) {

        List<LibroEntity> libroEntities = libroRepository.findAllByEditorialId(edi)
                .orElseThrow(()-> new BadRequestException("No existen libros bajo esta editorial" + edi));

        List<LibroEditorialResponse> responseList = libroEntities.stream()
                .map(libroEntity -> modelMapper.map(libroEntity, LibroEditorialResponse.class))
                .collect(Collectors.toList());

        return responseList;
    }

}
