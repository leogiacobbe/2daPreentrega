package com.leo.projecto1.Repository;

import com.leo.projecto1.Model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoModel, Integer> {

}
