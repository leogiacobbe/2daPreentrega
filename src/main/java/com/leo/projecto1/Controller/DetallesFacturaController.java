package com.leo.projecto1.Controller;

import com.leo.projecto1.Model.DetallesFacturaModel;
import com.leo.projecto1.Service.DetallesFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallesFactura")
public class DetallesFacturaController {

    @Autowired
    private DetallesFacturaService detallesFacturaService;

    @GetMapping
    public List<DetallesFacturaModel> getAllDetallesFactura() {
        return detallesFacturaService.getAllDetallesFactura();
    }

    @GetMapping("/{id}")
    public DetallesFacturaModel getDetallesFacturaById(@PathVariable Integer id) {
        return detallesFacturaService.getDetallesFacturaById(id);
    }

    @PostMapping
    public DetallesFacturaModel createDetallesFactura(@RequestBody DetallesFacturaModel detallesFactura) {
        return detallesFacturaService.createDetallesFactura(detallesFactura);
    }

    @PutMapping("/{id}")
    public DetallesFacturaModel updateDetallesFactura(@PathVariable Integer id, @RequestBody DetallesFacturaModel detallesFactura) {
        return detallesFacturaService.updateDetallesFactura(id, detallesFactura);
    }

    @DeleteMapping("/{id}")
    public void deleteDetallesFactura(@PathVariable Integer id) {
        detallesFacturaService.deleteDetallesFactura(id);
    }
}
