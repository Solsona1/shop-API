package com.example.InstrumentosAPI.repositories;


import com.example.InstrumentosAPI.domain.entities.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
}
