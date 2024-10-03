package com.example.InstrumentosAPI.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "detalle_pedido")
public class DetallePedido extends Base{
    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne()
    @JoinColumn(name = "instrumento_id", nullable = false)
    private Instrumento instrumento;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pedido_id", nullable = false)
    @JsonIgnore
    private Pedido pedido;

    public double calcularSubtotal(){
        return this.cantidad * this.instrumento.getPrecio();
    }
}
