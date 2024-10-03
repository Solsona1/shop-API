package com.example.InstrumentosAPI.business.services;

import com.example.InstrumentosAPI.domain.entities.Instrumento;

import java.util.List;

public interface IInstrumentoService extends BaseService<Instrumento, Long>{
    public List<Instrumento> findByCategoria(Long id) throws Exception;
}
