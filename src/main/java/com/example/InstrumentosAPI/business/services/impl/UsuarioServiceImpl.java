package com.example.InstrumentosAPI.business.services.impl;

import com.example.InstrumentosAPI.business.services.UsuarioService;
import com.example.InstrumentosAPI.domain.Encriptacion;
import com.example.InstrumentosAPI.domain.entities.Usuario;
import com.example.InstrumentosAPI.repositories.BaseRepository;
import com.example.InstrumentosAPI.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    @Transactional
    public Optional<Usuario> getUserByNameAndPassword(String nombre, String clave) {
        String claveEncriptada = Encriptacion.sha1(clave);
        return usuarioRepository.findByNombreUsuarioAndClave(nombre, claveEncriptada);
        //return usuarioRepository.obtenerUsuario(nombre, clave);
    }

    @Override
    @Transactional
    public Usuario create(Usuario entity) throws Exception {
        try{
            String encriptada = Encriptacion.sha1(entity.getClave());
            entity.setClave(encriptada);
            entity = baseRepository.save(entity);
            return entity;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
