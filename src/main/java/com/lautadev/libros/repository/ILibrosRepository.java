package com.lautadev.libros.repository;

import com.lautadev.libros.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibrosRepository extends JpaRepository<Libros,Long>{
    
}
