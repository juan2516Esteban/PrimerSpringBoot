package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditorialDTO {

    private Integer id;

    private String nombre;

    private String direccion;

    private LibroDTO libro;
}
