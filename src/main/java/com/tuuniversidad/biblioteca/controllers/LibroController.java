package com.tuuniversidad.biblioteca.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.service.LibroService;
import com.tuuniversidad.biblioteca.exception.LibroException;

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
    public ResponseEntity<Libro> getLibroById(@PathVariable("id_libro") Long id) {
        Optional<Libro> optionalLibro = libroService.getLibroById(id);
        if (optionalLibro.isEmpty()) {
            throw new LibroException("Libro no encontrado con el ID: " + id);
        }
        return new ResponseEntity<>(optionalLibro.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addLibro(@RequestBody Libro libro) {
        libroService.addLibro(libro);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}