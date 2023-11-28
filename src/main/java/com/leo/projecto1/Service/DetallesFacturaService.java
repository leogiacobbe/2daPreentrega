package com.leo.projecto1.Service;

import com.leo.projecto1.Model.DetallesFacturaModel;
import com.leo.projecto1.Repository.DetallesFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesFacturaService {

    @Autowired
    private DetallesFacturaRepository detallesFacturaRepository;

    public List<DetallesFacturaModel> getAllDetallesFactura() {
        return detallesFacturaRepository.findAll();
    }

    public DetallesFacturaModel getDetallesFacturaById(Integer id) {
        Optional<DetallesFacturaModel> detallesFacturaOptional = detallesFacturaRepository.findById(id);
        return detallesFacturaOptional.orElse(null);
    }

    public DetallesFacturaModel createDetallesFactura(DetallesFacturaModel detallesFactura) {
        return detallesFacturaRepository.save(detallesFactura);
    }

    public DetallesFacturaModel updateDetallesFactura(Integer id, DetallesFacturaModel detallesFactura) {
        if (detallesFacturaRepository.existsById(id)) {
            detallesFactura.setId(id);
            return detallesFacturaRepository.save(detallesFactura);
        } else {
            return null;
        }
    }

    public void deleteDetallesFactura(Integer id) {
        detallesFacturaRepository.deleteById(id);
    }
}
