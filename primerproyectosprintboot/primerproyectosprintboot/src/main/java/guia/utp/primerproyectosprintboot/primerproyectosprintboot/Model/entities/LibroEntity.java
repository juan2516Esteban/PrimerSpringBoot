package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "libro")
@Entity

public class LibroEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_libro")
    private String nombre;

    @Column(name = "autor_libro")
    private String autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Editorial")
    private EditorialEntity editorial;

}
