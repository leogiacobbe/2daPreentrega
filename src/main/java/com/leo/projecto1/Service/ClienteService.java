package com.leo.projecto1.Service;

import com.leo.projecto1.Model.ClienteModel;
import com.leo.projecto1.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> getAllClientes() {
        return clienteRepository.findAll();
    }

    public ClienteModel getClienteById(Integer id) {
        Optional<ClienteModel> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.orElse(null);
    }

    public ClienteModel createCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteModel updateCliente(Integer id, ClienteModel cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        } else {
            return null;
        }
    }

    public void deleteCliente(Integer id) {
        clienteRepository.deleteById(id);
    }
}
