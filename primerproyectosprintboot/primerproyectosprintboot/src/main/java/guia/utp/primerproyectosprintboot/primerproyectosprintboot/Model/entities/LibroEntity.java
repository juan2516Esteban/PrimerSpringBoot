package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Builder
@Table(name = "libro")
@Entity

public class LibroEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_libro")
    private String nombreLibro;

    @Column(name = "autor_libro")
    private String autor;

    @Column(name = "editorial_libro")
    private String editorial;

}
