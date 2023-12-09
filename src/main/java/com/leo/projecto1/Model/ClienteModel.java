package com.leo.projecto1.Model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellido;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    public boolean isValid() {
        return Objects.nonNull(nombre) && !nombre.trim().isEmpty() &&
                Objects.nonNull(apellido) && !apellido.trim().isEmpty() &&
                Objects.nonNull(numeroDocumento) && !numeroDocumento.trim().isEmpty() &&
                (numeroDocumento.length() == 7 || numeroDocumento.length() == 8);
    }
}
