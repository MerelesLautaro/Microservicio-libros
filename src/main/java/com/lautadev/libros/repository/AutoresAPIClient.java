package com.lautadev.libros.repository;

import com.lautadev.libros.dto.AutoresDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="autorapi",url="http://localhost:9001/autores")
public interface AutoresAPIClient {
    
    @GetMapping("/traer/autor/{libro}")
    public List<AutoresDTO> getAutoresByLibro(@PathVariable ("libro") String libro);
}
