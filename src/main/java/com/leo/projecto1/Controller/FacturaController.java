package com.leo.projecto1.Controller;

import com.leo.projecto1.Model.FacturaModel;
import com.leo.projecto1.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<FacturaModel> getAllFacturas() {
        return facturaService.getAllFacturas();
    }

    @GetMapping("/{id}")
    public FacturaModel getFacturaById(@PathVariable Integer id) {
        return facturaService.getFacturaById(id);
    }

    @PostMapping
    public FacturaModel createFactura(@RequestBody FacturaModel factura) {
        return facturaService.createFactura(factura);
    }

    @PutMapping("/{id}")
    public FacturaModel updateFactura(@PathVariable Integer id, @RequestBody FacturaModel factura) {
        return facturaService.updateFactura(id, factura);
    }

    @DeleteMapping("/{id}")
    public void deleteFactura(@PathVariable Integer id) {
        facturaService.deleteFactura(id);
    }
}
