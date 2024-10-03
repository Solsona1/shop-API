package com.example.InstrumentosAPI.business.services.impl;

import com.example.InstrumentosAPI.business.services.PedidoService;
import com.example.InstrumentosAPI.domain.entities.DetallePedido;
import com.example.InstrumentosAPI.domain.entities.Pedido;
import com.example.InstrumentosAPI.repositories.BaseRepository;
import com.example.InstrumentosAPI.repositories.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository){
        super(baseRepository);
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    @Transactional
    public Pedido create(Pedido entity) throws Exception {
        try{
            entity.calcularTotalPedido();
            for(DetallePedido detalle : entity.getDetalles()){
                detalle.setPedido(entity);
            }
            entity = pedidoRepository.save(entity);
            return entity;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido update(Long id, Pedido entity) throws Exception {
        try{
            Optional<Pedido> entityOptional = pedidoRepository.findById(id);
            Pedido ent = entityOptional.get();
            entity.calcularTotalPedido();
            ent = pedidoRepository.save(entity);
            return ent;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
