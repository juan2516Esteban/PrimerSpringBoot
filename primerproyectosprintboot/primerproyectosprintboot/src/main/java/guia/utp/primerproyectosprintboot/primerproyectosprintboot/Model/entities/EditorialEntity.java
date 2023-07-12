package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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
    @JoinColumn(name = "Editorial_Id")
    private List<LibroEntity> libros;
}
