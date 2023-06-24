package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.controllers;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.LibroServicio;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api-Libros/v1")

public class LibroControler {
    @Autowired

    private LibroServicio libroServicio;
    @PostMapping("crearLibro")

    public LibroDTO crearLibro(@RequestBody LibroDTO libroDTO){

        return libroServicio.crearLibro(libroDTO);

    }

    @GetMapping("obtenerLibro")
    public LibroDTO obtenerLibro(@RequestParam Integer id){

        return libroServicio.obtenerLibro(id);

    }

    @DeleteMapping("eliminarLibro")
    public String eliminarLibro(@RequestParam Integer id){

        return libroServicio.eliminarLibro(id);

    }
}
