package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(1L, "Sigue Mi Voz", "Ariana Godoy", "Montena", 2022));
        libros.add(new Libro(2L, "Ciudades de Humo", "Joana Marcus", "Crossbooks", 2022));
        libros.add(new Libro(3L, "Mil Veces Hasta Siempre", "John Green", "Nube de Tinta", 2017));
        libros.add(new Libro(4L, "Los Juegos del Hambre", "Suzanne Collins", "Scholastic Press", 2008));
    }
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
