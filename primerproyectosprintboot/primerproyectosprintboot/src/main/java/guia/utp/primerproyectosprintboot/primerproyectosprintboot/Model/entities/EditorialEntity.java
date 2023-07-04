package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "editorial")

public class EditorialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_editorial")
    private String nombre;

    @Column(name = "direccion_editorial")
    private String direccion;

    @OneToMany(fetch = FetchType.LAZY,
    orphanRemoval = true)
    private List<LibroEntity> libro;
}
