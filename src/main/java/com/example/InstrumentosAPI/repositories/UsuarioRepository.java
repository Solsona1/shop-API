package com.example.InstrumentosAPI.repositories;

import com.example.InstrumentosAPI.domain.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {

    /*@Query(value = "SELECT * FROM usuario " +
            "WHERE nombre_usuario = ?1 AND " +
            "clave= ?2", nativeQuery = true)
    Usuario obtenerUsuario(String nombreUsuario, String clave);*/

    Optional<Usuario> findByNombreUsuarioAndClave(String nombreUsuario, String clave);

    //Optional<Usuario> findByNombreUsuario(String nombreU)
}
