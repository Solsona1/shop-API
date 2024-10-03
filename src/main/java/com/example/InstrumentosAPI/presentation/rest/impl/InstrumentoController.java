package com.example.InstrumentosAPI.presentation.rest.impl;

import com.example.InstrumentosAPI.business.services.impl.InstrumentoServiceImpl;
import com.example.InstrumentosAPI.domain.entities.Instrumento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/instrumentos")
public class InstrumentoController extends BaseControllerImpl<Instrumento, InstrumentoServiceImpl>{
    @GetMapping("/categoria/{id}")
    public ResponseEntity<?> getByCategoria(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByCategoria(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde \"}");
        }
    }
}
