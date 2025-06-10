package SGBE2.SGBE2.modelo;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitud_beca")

public class postulacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPostulacion;
    private beca becca;
    private Long idUsuario;
    private String estadoSolicitud;
    private String comentario;

    public static Optional<postulacion> map(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'map'");
    }
}
