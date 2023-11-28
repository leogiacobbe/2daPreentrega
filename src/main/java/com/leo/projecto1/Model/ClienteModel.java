package com.leo.projecto1.Model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name="clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;

    @Column(name="numero_documento")
    private String numeroDocumento;
}
