package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.response;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EditorialResponse {

    private Integer id;

    private String nombre;

    private String direccion;

    private List<LibroDTO> libros;

}
