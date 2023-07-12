package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.EditorialEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.EditorialDTO;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EditorialRepository extends JpaRepository<EditorialEntity, Integer> {

    @Query(value = "SELECT * FROM LIBRO WHERE ID_EDITORIAL = :id",
            nativeQuery = true)
    Optional<List<LibroEntity>> buscarLibros(Integer id);

}
