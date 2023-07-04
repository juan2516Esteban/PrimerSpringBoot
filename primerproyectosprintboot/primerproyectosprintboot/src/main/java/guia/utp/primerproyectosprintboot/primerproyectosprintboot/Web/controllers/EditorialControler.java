package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.controllers;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.EditorialService;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.EditorialDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.EditorialResponse;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response.LibroEditorialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api-Editorial/v1")

public class EditorialControler {

    @Autowired

    private EditorialService editorialService;

    @PostMapping("crearEditorial")

    public ResponseEntity<EditorialDTO> crearEditorial(@RequestBody EditorialDTO editorialDTO){
        return new ResponseEntity<>(editorialService.crearEditorial(editorialDTO), HttpStatus.CREATED);
    }

    @GetMapping("obtenerEditorial")
    public ResponseEntity<EditorialResponse> obtenerLibro(@RequestParam("id") Integer id){
        return new ResponseEntity<>(editorialService.obtenerEditorial(id),HttpStatus.FOUND);
    }

}
