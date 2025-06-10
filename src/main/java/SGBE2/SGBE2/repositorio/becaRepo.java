package SGBE2.SGBE2.repositorio;

import SGBE2.SGBE2.modelo.beca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;



public interface becaRepo extends JpaRepository<beca, Long>{
     Optional<beca> findByNombreBeca(String nombreBeca);
}
