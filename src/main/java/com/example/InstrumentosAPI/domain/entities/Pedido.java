package com.example.InstrumentosAPI.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "pedido")
public class Pedido extends Base {
    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "total")
    private double totalPedido;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<DetallePedido> detalles;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public void calcularTotalPedido(){
        double sum = 0;
        for(DetallePedido detalle : this.detalles){
            sum += detalle.calcularSubtotal();
        }
        setTotalPedido(sum);
    }
}
