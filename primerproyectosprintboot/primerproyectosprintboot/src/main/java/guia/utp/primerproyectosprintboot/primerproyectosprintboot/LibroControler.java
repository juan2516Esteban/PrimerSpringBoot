package guia.utp.primerproyectosprintboot.primerproyectosprintboot;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-Libros/v1")
@AllArgsConstructor

public class LibroControler {

    private List<LibroDTO> libroDTOS;

    @PostMapping("crearLibro")

    public LibroDTO crearLibro(@RequestBody LibroDTO libroDTO){

        libroDTOS.add(libroDTO);

        return libroDTOS.get(libroDTO.getId());
    }

    @GetMapping("obtenerLibro")
    public LibroDTO obtenerLibro(@RequestParam Integer id){
        return libroDTOS.get(id);
    }


}
