package com.veterinaria;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Moni
 */
@Controller 
public class PaginaController {
    
    @GetMapping("/informacion")
    public String informacion() {
        return "informacion";  // Este nombre debe coincidir con el archivo informacion.html en templates
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos"; // Archivo productos.html
    }
    
    @GetMapping("/profesionales")
    public String profesionales() {
        return "profesionales"; // Archivo profesionales.html
    }
    
    @GetMapping("/adopta")
    public String adopta() {
        return "adopta"; // Archivo historia.html
    }

    @GetMapping("/ubicacion")
    public String ubicacion() {
        return "ubicacion"; // Archivo ubicacion.html
    }

    @GetMapping("/denuncias")
    public String denuncias() {
        return "denuncias"; // Archivo denuncias.html
    }
}
    
