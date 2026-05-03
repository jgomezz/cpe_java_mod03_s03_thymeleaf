package pe.edu.tecsup.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Directamente responde al browser
 */
@RestController
public class HomeRestController {

    @GetMapping("/rest")
    public String index() {
        return "Hello World";
    }

}
