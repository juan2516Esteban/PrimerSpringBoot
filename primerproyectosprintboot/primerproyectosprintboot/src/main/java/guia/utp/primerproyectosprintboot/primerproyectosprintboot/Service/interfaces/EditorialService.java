package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.EditorialDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.EditorialResponse;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.LibroEditorialResponse;

import java.util.List;

public interface EditorialService {
    EditorialDTO crearEditorial(EditorialDTO editorialDTO);

    EditorialResponse obtenerEditorial(Integer id);
}
