package com.leo.projecto1.Controller;

import com.leo.projecto1.DTO.ClienteDTO;
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
    public ClienteDTO getClienteById(@PathVariable Integer id) {
        ClienteModel clienteModel = clienteService.getClienteById(id);
        return convertToDto(clienteModel);
    }

    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO) {
        ClienteModel clienteModel = convertToEntity(clienteDTO);
        ClienteModel createdCliente = clienteService.createCliente(clienteModel);
        return convertToDto(createdCliente);
    }

    @PutMapping("/{id}")
    public ClienteDTO updateCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        ClienteModel clienteModel = convertToEntity(clienteDTO);
        ClienteModel updatedCliente = clienteService.updateCliente(id, clienteModel);
        return convertToDto(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
    }

    private ClienteDTO convertToDto(ClienteModel clienteModel) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setNombre(clienteModel.getNombre());
        clienteDTO.setApellido(clienteModel.getApellido());
        // No incluimos el número de documento en la respuesta
        return clienteDTO;
    }

    private ClienteModel convertToEntity(ClienteDTO clienteDTO) {
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNombre(clienteDTO.getNombre());
        clienteModel.setApellido(clienteDTO.getApellido());
        clienteModel.setNumeroDocumento(clienteDTO.getNumeroDocumento());
        return clienteModel;
    }
}
