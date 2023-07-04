package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.repository;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Model.entities.EditorialEntity;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.EditorialDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EditorialRepository extends JpaRepository<EditorialEntity, Integer> {



}
