package SGBE2.SGBE2.modelo;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class beca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long becaId;
    private String nombreBeca;
    private String descripcion;
    private String fechaPostulacion;

    public static Optional<beca> map(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'map'");
    }
}
