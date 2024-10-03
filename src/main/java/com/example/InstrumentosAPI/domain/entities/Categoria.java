package com.example.InstrumentosAPI.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categoria extends Base{
    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private Set<Instrumento> instrumentos;
}
