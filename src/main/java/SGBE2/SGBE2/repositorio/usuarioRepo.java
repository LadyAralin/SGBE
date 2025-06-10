package SGBE2.SGBE2.repositorio;

import SGBE2.SGBE2.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface usuarioRepo extends JpaRepository<usuario, Long> {
    Optional<usuario> findByEmail(String email);
}
