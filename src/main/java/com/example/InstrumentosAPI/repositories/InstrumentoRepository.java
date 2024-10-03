package com.example.InstrumentosAPI.repositories;

import com.example.InstrumentosAPI.domain.entities.Categoria;
import com.example.InstrumentosAPI.domain.entities.Instrumento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrumentoRepository extends BaseRepository<Instrumento, Long>{
    @Query(nativeQuery = true, value = "SELECT * FROM instrumento WHERE categoria_id = ?1")
    public List<Instrumento> findByCategoria(Long id);
}
