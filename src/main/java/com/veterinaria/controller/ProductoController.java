package com.veterinaria.controller;

import com.veterinaria.model.Producto;
import com.veterinaria.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.data.domain.Sort;

@Controller
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/productos")
    public String obtenerProductos(Model model) {
        List<Producto> productos = productoRepository.findAll(Sort.by(Sort.Direction.DESC, "precio"));
        model.addAttribute("productos", productos);
        return "productos";
    }

    @GetMapping("/productos-ordenados-asc")
    public String obtenerProductosOrdenAsc(Model model) {
        List<Producto> productos = productoRepository.findAll(Sort.by(Sort.Direction.ASC, "precio"));
        model.addAttribute("productos", productos);
        return "productos";
    }

    @GetMapping("/productos-ordenados-desc")
    public String obtenerProductosOrdenDesc(Model model) {
        List<Producto> productos = productoRepository.findAll(Sort.by(Sort.Direction.DESC, "precio"));
        model.addAttribute("productos", productos);
        return "productos";
    }

    @GetMapping("/productos-filtro")
    public String obtenerProductosPorNombre(Model model) {
        List<Producto> productos = productoRepository.findByNombreContainingIgnoreCase("gato");
        model.addAttribute("productos", productos);
        return "productos";
    }

    @GetMapping("/buscar")
    public String buscarProductosPorNombre(Model model, String nombre) {
        List<Producto> productos = productoRepository.findByNombreContainingIgnoreCase(nombre);
        model.addAttribute("productos", productos);
        return "productos";
    }
}
