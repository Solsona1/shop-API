package com.example.InstrumentosAPI.presentation.rest.impl;

import com.example.InstrumentosAPI.business.services.impl.UsuarioServiceImpl;
import com.example.InstrumentosAPI.domain.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl>{

    @GetMapping("/getUser")
    public ResponseEntity<Optional<Usuario>> getUser(@RequestParam String username, @RequestParam String password){
        Optional<Usuario> existingUsuario = servicio.getUserByNameAndPassword(username, password);
        return ResponseEntity.ok().body(existingUsuario);
    }

}
