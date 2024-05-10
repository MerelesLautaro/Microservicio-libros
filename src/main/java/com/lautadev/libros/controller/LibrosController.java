package com.lautadev.libros.controller;

import com.lautadev.libros.dto.LibrosDTO;
import com.lautadev.libros.model.Libros;
import com.lautadev.libros.service.ILibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibrosController {
    @Autowired
    private ILibrosService libroServ;
    
    //Endpoints
    @PostMapping("/crear")
    public String saveLibro(@RequestBody LibrosDTO libro){
        libroServ.saveLibro(libro.getTitulo(), libro.getFecha_publicacion(), libro.getDescripcion());
        return "Libro guardado";
    }
    
    @GetMapping("/traer")
    public List<Libros> getLibros(){
        return  libroServ.getLibros();
    }
    
    @GetMapping("/traer/{id}")
    public Libros findLibro(@PathVariable Long id){
        return libroServ.findLibro(id);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public String deleteLibro(@PathVariable Long id){
        libroServ.deleteLibro(id);
        return "libro eliminado";
    }
    
    @PutMapping("/editar")
    public Libros editLibro(@RequestBody Libros libro){
        libroServ.editLibro(libro.getNum_ISBN(),libro);
        return libroServ.findLibro(libro.getNum_ISBN());
    }

}
