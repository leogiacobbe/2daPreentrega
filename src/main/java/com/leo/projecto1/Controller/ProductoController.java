package com.leo.projecto1.Controller;

import com.leo.projecto1.Model.ProductoModel;
import com.leo.projecto1.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoModel> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public ProductoModel getProductoById(@PathVariable Integer id) {
        return productoService.getProductoById(id);
    }

    @PostMapping
    public ProductoModel createProducto(@RequestBody ProductoModel producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public ProductoModel updateProducto(@PathVariable Integer id, @RequestBody ProductoModel producto) {
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Integer id) {
        productoService.deleteProducto(id);
    }
}
