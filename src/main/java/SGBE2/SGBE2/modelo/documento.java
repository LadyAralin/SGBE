package SGBE2.SGBE2.modelo;

import java.util.Optional;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data

public class documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDoc;
    private String tipoDoc;
    private String nombreDoc;

    public static Optional<documento> map(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'map'");
    }
}
