package pe.edu.tecsup.app.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ProductoController {


    @GetMapping("/productos")
    public String index( Model model) {

        return "productos/index";
    }


}
