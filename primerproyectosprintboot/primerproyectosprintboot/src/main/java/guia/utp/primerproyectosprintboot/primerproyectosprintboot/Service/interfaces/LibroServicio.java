package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.LibroEditorialResponse;

import java.util.List;

public interface LibroServicio {
    LibroDTO crearLibro(LibroDTO libroDTO);
    LibroDTO obtenerLibro(Integer id);

    String eliminarLibro(Integer id);

    String modificarLibro(Integer id,LibroDTO libroDTO);

    List<LibroEditorialResponse> obtenerLibroPorEditorial(String edi);

}
