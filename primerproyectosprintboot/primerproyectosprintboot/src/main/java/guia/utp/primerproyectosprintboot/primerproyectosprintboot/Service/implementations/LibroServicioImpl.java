package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.implementations;

import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Service.interfaces.LibroServicio;
import guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.dto.LibroDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class LibroServicioImpl implements LibroServicio {

     List<LibroDTO> libroDTOS;
    @Override
    public LibroDTO crearLibro(LibroDTO libroDTO) {
        libroDTOS.add(libroDTO.getId(),libroDTO);
        return libroDTOS.get(libroDTO.getId());
    }

    @Override
    public LibroDTO obtenerLibro(Integer id){
        return libroDTOS.get(id);
    }

    @Override
    public String eliminarLibro(Integer id) {

       boolean estado = libroDTOS.remove(libroDTOS.get(id));

        if(estado == true){
            return "El libro fue eliminado exitosamente";
        }else{
            return "El libro no pudo ser eliminado exitosamente";
        }
    }

    @Override
    public String modificarLibro(Integer id ,LibroDTO libroDTO){
        libroDTOS.set(id ,libroDTO);
        return "el libro en la posición "+id+" fue modificado por "+libroDTO;
    }

}
