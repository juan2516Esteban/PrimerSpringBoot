package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LibroDTO {

    private Integer id;

    private String nombre;

    private String autor;

    private String editorial;

}
