package com.example.InstrumentosAPI.business.services.impl;

import com.example.InstrumentosAPI.business.services.CategoriaService;
import com.example.InstrumentosAPI.domain.entities.Categoria;
import com.example.InstrumentosAPI.repositories.BaseRepository;
import com.example.InstrumentosAPI.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {

//    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository, CategoriaRepository categoriaRepository){
        super(baseRepository);
        this.categoriaRepository = categoriaRepository;
    }
}
