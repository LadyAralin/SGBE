package SGBE2.SGBE2.servicio;

import SGBE2.SGBE2.modelo.usuario;
import SGBE2.SGBE2.repositorio.usuarioRepo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioServ {
    @Autowired
    private usuarioRepo repo;
    public usuario registrar(usuario u) {
        return repo.save(u);
    }
    public Optional<usuario> autenticar(String email, String password) {
        return repo.findByEmail(email).filter(u -> u.getPassword().equals(password));
    }
}
