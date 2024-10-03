package com.example.InstrumentosAPI.business.services.impl;

import com.example.InstrumentosAPI.business.services.IInstrumentoService;
import com.example.InstrumentosAPI.domain.entities.Instrumento;
import com.example.InstrumentosAPI.repositories.BaseRepository;
import com.example.InstrumentosAPI.repositories.InstrumentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements IInstrumentoService {

//    @Autowired
    private InstrumentoRepository instrumentoRepository;

    public InstrumentoServiceImpl(BaseRepository<Instrumento, Long> baseRepository, InstrumentoRepository instrumentoRepository){
        super(baseRepository);
        this.instrumentoRepository = instrumentoRepository;
    }

    @Override
    @Transactional
    public List<Instrumento> findByCategoria(Long id) throws Exception {
        try{
            List<Instrumento> entities = instrumentoRepository.findByCategoria(id);
            return entities;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
