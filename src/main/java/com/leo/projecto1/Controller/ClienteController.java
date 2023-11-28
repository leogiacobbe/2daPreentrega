package com.leo.projecto1.Controller;

import com.leo.projecto1.Model.ClienteModel;
import com.leo.projecto1.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ClienteModel getClienteById(@PathVariable Integer id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteModel createCliente(@RequestBody ClienteModel cliente) {
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{id}")
    public ClienteModel updateCliente(@PathVariable Integer id, @RequestBody ClienteModel cliente) {
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
    }
}
