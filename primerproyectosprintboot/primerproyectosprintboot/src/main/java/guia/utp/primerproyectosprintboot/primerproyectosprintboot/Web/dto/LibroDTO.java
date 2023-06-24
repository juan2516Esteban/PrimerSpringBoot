package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class LibroDTO {

    private Integer id;

    private String nombre;

    private String autor;

    private String editorial;

}
