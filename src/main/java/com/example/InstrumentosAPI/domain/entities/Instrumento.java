package com.example.InstrumentosAPI.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "instrumento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Instrumento extends Base {
    @Column(name = "instrumento")
    private String instrumento;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio")
    private double precio;

    @Column(name = "costoEnvio")
    private String costoEnvio;

    @Column(name = "cantidadVendida")
    private int cantidadVendida;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "instrumento")
    @JsonIgnore
    private List<DetallePedido> detalles;
}
