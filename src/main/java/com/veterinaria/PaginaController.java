package com.veterinaria;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Moni
 */
@Controller 
public class PaginaController {
    
    @GetMapping("/informacion")
    public String informacion() {
        return "informacion";  
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
        return "adopta"; // Archivo adopta.html
    }

    @GetMapping("/ubicacion")
    public String ubicacion() {
        return "ubicacion"; // Archivo ubicacion.html
    }

    @GetMapping("/denuncias")
    public String denuncias() {
        return "denuncias"; // Archivo denuncias.html
    }
    
     @GetMapping("/registrarse")
    public String registrarse() {
        return "registrarse"; // Archivo registrarse.html
    }
    
    @GetMapping("/iniciarsesion")
    public String iniciarsesion() {
        return "iniciarsesion"; // Archivo iniciarsesion.html
    }
    
    @PostMapping("/iniciarsesion")
    public String procesarLogin(@RequestParam String email,
                                @RequestParam String password,
                                Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a PAWS!");
        return "iniciarsesion";
    }
}
    
