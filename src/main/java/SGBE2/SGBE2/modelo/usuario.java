package SGBE2.SGBE2.modelo;

import java.util.Optional;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String email;
    private String password;
    private String rol;

    public static Optional<usuario> map(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'map'");
    }
}
