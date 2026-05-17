package pe.edu.tecsup.app.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
/**
 *  DTO : Data Transfer Object
 *  Es un objeto que se utiliza para transferir datos entre capas de una aplicación.
 */
public class ProductoResponse {

    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;

}
