package com.leo.projecto1.Service;

import com.leo.projecto1.Model.FacturaModel;
import com.leo.projecto1.Repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public FacturaModel getFacturaById(Integer id) {
        Optional<FacturaModel> facturaOptional = facturaRepository.findById(id);
        return facturaOptional.orElse(null);
    }

    public FacturaModel createFactura(FacturaModel factura) {
        return facturaRepository.save(factura);
    }

    public FacturaModel updateFactura(Integer id, FacturaModel factura) {
        if (facturaRepository.existsById(id)) {
            factura.setId(id);
            return facturaRepository.save(factura);
        } else {
            return null;
        }
    }

    public void deleteFactura(Integer id) {
        facturaRepository.deleteById(id);
    }
}
