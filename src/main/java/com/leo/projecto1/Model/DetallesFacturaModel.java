package com.leo.projecto1.Model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name= "detalles_factura")
public class DetallesFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="factura_id", nullable = false)
    private FacturaModel factura;

    @Column(name = "cantidad_productos")
    private int cantidadProductos;

    @ManyToOne
    @JoinColumn(name="productos_id", nullable = false)
    private ProductoModel producto;

    private double subtotal;
}
