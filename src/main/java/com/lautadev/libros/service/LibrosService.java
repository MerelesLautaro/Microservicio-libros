package com.lautadev.libros.service;

import com.lautadev.libros.dto.AutoresDTO;
import com.lautadev.libros.model.Libros;
import com.lautadev.libros.repository.AutoresAPIClient;
import com.lautadev.libros.repository.ILibrosRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrosService implements ILibrosService{
    @Autowired
    private ILibrosRepository libroRepo;
    
    @Autowired
    private AutoresAPIClient autorClient;
    
    @Override
    public void saveLibro(String titulo,LocalDate fecha_publicacion,String descripcion) {
        
        List<AutoresDTO> listaAutores = autorClient.getAutoresByLibro(titulo);
        List<String> lista_autores = new ArrayList<String>();
        
        for (AutoresDTO autor : listaAutores){
            lista_autores.add(autor.getNombre_completo());
        }
        
        Libros libro = new Libros();
        libro.setTitulo(titulo);
        libro.setFecha_publicacion(fecha_publicacion);
        libro.setFecha_publicacion(fecha_publicacion);
        libro.setLista_autores(lista_autores);
        
        libroRepo.save(libro);
    }

    @Override
    public List<Libros> getLibros() {
        return libroRepo.findAll();
    }

    @Override
    public Libros findLibro(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteLibro(Long id) {
        libroRepo.deleteById(id);
    }

    @Override
    public void editLibro(Long id,Libros libro) {
        Libros libroEdit = this.findLibro(id);
        
        libroEdit.setTitulo(libro.getTitulo());
        libroEdit.setDescripcion(libro.getDescripcion());
        libroEdit.setFecha_publicacion(libro.getFecha_publicacion());
        libroEdit.setLista_autores(libro.getLista_autores());
        
        libroRepo.save(libroEdit);
    }
}
