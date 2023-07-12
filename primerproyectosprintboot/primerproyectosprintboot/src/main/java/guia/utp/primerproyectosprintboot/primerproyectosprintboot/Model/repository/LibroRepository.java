package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<LibroEntity,Integer> {
    Optional<List<LibroEntity>> findAllByEditorialId(Integer editorial);

}
