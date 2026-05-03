package pe.edu.tecsup.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  Trabaja con plantilla HTML  : Thymeleaf
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home";  // Espera un archivo home.html en src/main/resources/templates
    }

}
