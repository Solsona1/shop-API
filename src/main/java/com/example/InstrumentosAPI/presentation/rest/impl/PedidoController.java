package com.example.InstrumentosAPI.presentation.rest.impl;

import com.example.InstrumentosAPI.business.services.impl.PedidoServiceImpl;
import com.example.InstrumentosAPI.domain.entities.Pedido;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
}
