package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.controllers;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.LibroServicio;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.LibroEditorialResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api-Libros/v1")

public class LibroControler {
    @Autowired

    private LibroServicio libroServicio;
    @PostMapping("crearLibro")

    public ResponseEntity<LibroDTO> crearLibro(@RequestBody LibroDTO libroDTO){

        return new ResponseEntity<>(libroServicio.crearLibro(libroDTO),HttpStatus.CREATED);

    }

    @GetMapping("obtenerLibro")
    public ResponseEntity<LibroDTO> obtenerLibro(@RequestParam("id") Integer id){

        return new ResponseEntity<>(libroServicio.obtenerLibro(id),HttpStatus.OK);

    }

    @DeleteMapping("eliminarLibro")
    public String eliminarLibro(@RequestParam("id") Integer id){

        return libroServicio.eliminarLibro(id);
    }

    @PutMapping("modificarLibro")
    public String modificarLibro(@RequestParam("id") Integer id,@RequestBody LibroDTO libroDTO ){
        return libroServicio.modificarLibro(id,libroDTO);
    }

    @GetMapping("obtenerLibroPorEditorial")
    public ResponseEntity<List<LibroEditorialResponse>> obtenerLibroPorEditorial
            (@RequestParam("editorial") Integer edi){

        return new ResponseEntity<>(libroServicio.obtenerLibroPorEditorial(edi),HttpStatus.FOUND);
    }
}
