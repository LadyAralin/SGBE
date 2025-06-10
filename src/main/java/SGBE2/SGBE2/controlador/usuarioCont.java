package SGBE2.SGBE2.controlador;

import SGBE2.SGBE2.modelo.usuario;
import SGBE2.SGBE2.servicio.usuarioServ;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
@CrossOrigin

public class usuarioCont {
    @Autowired
    private usuarioServ serv;
    @PostMapping("/registrar")
    public usuario registrar(@RequestBody usuario u) {
        return serv.registrar(u);
    }
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody usuario u) {
        Optional<usuario> user = serv.autenticar(u.getEmail(), u.getPassword());
        Map<String, String> response = new HashMap<>();
        if (user.isPresent()) {
            response.put("result", "OK");
            response.put("nombre", user.get().getNombre());
        } else {
            response.put("result", "Error");
        }
        return response;
    }
}
