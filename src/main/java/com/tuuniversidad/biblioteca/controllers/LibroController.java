package com.tuuniversidad.biblioteca.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.service.LibroService;


@RestController
@RequestMapping("/libros")

public class LibroController {
    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id_libro}")
    public Optional<Libro> getLibroById(@PathVariable("id_libro") Long id) {
        return libroService.getLibroById(id);
    }

    @PostMapping
    public void addLibro(@RequestBody Libro libro) {
        libroService.addLibro(libro);
    }
}
