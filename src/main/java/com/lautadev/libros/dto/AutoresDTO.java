package com.lautadev.libros.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutoresDTO {
    private Long id;
    private String nombre_completo;
    private String nacionalidad;
    private List<String> libros_escritos;
}
