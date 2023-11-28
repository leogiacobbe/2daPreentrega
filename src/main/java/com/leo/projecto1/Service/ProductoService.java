package com.leo.projecto1.Service;

import com.leo.projecto1.Model.ProductoModel;
import com.leo.projecto1.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoModel> getAllProductos() {
        return productoRepository.findAll();
    }

    public ProductoModel getProductoById(Integer id) {
        Optional<ProductoModel> productoOptional = productoRepository.findById(id);
        return productoOptional.orElse(null);
    }

    public ProductoModel createProducto(ProductoModel producto) {
        return productoRepository.save(producto);
    }

    public ProductoModel updateProducto(Integer id, ProductoModel producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        } else {
            return null;
        }
    }

    public void deleteProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
