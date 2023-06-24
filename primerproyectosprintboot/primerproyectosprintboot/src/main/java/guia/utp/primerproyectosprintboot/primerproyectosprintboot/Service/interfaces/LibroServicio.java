package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;

public interface LibroServicio {
    LibroDTO crearLibro(LibroDTO libroDTO);
    LibroDTO obtenerLibro(Integer id);

    String eliminarLibro(Integer id);
}
