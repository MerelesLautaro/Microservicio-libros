package com.lautadev.libros.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libros {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long num_ISBN;
    private String titulo;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_publicacion;
    private String descripcion;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> lista_autores;
}
