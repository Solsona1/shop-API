package com.example.InstrumentosAPI.business.services;

import com.example.InstrumentosAPI.domain.entities.Usuario;

import java.util.Optional;

public interface UsuarioService  extends BaseService<Usuario, Long>{
    public Optional<Usuario> getUserByNameAndPassword(String nombre, String clave);
}
