package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<LibroEntity,Integer> {
    Optional<List<LibroEntity>> findAllByEditorial(String editorial);
}
