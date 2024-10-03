package com.example.InstrumentosAPI.business.services;

import com.example.InstrumentosAPI.domain.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public boolean deleteById(ID id) throws Exception;
    public E create(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
}
