package com.lautadev.libros.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibrosDTO {
    private String titulo;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_publicacion;
    private String descripcion;
}
