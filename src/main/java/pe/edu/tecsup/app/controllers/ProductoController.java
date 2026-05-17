package pe.edu.tecsup.app.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.app.dto.ProductoResponse;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class ProductoController {


    @GetMapping("/productos")
    public String index(Model model) {

        log.info("Iniciando index");

        // ----
        String mensaje = "Lista de productos";
        // Se guarda el mensaje en el scope del modelo
        model.addAttribute("msg", mensaje);

        // ----
        Boolean estado = true;
        model.addAttribute("estado", estado);

        // ----
        List<ProductoResponse> productos = this.getProductos();
        model.addAttribute("productos", productos);

        return "productos/index";
    }


    private List<ProductoResponse> getProductos() {

        List<ProductoResponse> productos = new ArrayList<>();

        productos.add(ProductoResponse.builder()
                .id(1L)
                .nombre("iPhone")
                .descripcion("Equipo muy caro")
                .precio(3500.0)
                .build());

        productos.add(ProductoResponse.builder()
                .id(2L)
                .nombre("Galaxy")
                .descripcion("Equipo caro")
                .precio(3000.0)
                .build());

        productos.add(ProductoResponse.builder()
                .id(3L)
                .nombre("Xiaomi")
                .descripcion("Equipo accesible")
                .precio(1000.0)
                .build());

        return productos;
    }

}
