package com.leo.projecto1.Model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="factura")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="clientes_id")
    private ClienteModel cliente;

    @Column(name="fecha_creacion")
    private Date fecha_creacion;

    private double total;
}
