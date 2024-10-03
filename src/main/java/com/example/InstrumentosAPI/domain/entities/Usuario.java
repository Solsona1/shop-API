package com.example.InstrumentosAPI.domain.entities;

import com.example.InstrumentosAPI.domain.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
Class Usuario {
id (long)
nombreUsuario (String)
clave (String Encriptado)
rol (String)
}
*/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "usuario")
public class Usuario extends Base {
    @Column(name = "nombre_usuario", nullable = false, unique = true)
    private String nombreUsuario;

    @Column(name = "clave", nullable = false)
    private String clave;

    @Column(name = "rol", nullable = false)
    private Roles rol;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Pedido> pedidos;
}
