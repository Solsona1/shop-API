package com.example.InstrumentosAPI.presentation.rest.impl;

import com.example.InstrumentosAPI.business.services.impl.CategoriaServiceImpl;
import com.example.InstrumentosAPI.domain.entities.Categoria;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl> {
}
