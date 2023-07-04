package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<LibroEntity,Integer> {

    @Query(value = "SELECT * FROM LIBRO li  JOIN EDITORIAL edi ON li.ID_EDITORIAL = edi.ID WHERE edi.ID = :editorial"
            ,nativeQuery = true)
    Optional<List<LibroEntity>> findAllByeditorial(String editorial);

}
