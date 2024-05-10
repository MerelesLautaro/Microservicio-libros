package com.lautadev.libros.service;

import com.lautadev.libros.model.Libros;
import java.time.LocalDate;
import java.util.List;


public interface ILibrosService {
    
    public void saveLibro(String titulo,LocalDate fecha_publicacion,String descripcion);
    public List<Libros> getLibros();
    public Libros findLibro(Long id);
    public void deleteLibro(Long id);
    public void editLibro(Long id,Libros libro);
    
}
