package com.leo.projecto1.Model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private String codigo;
    private int stock;

    @Column(name="precio")
    private double precio;
}
