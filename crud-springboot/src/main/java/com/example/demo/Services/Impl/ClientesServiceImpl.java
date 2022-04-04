package com.example.demo.Services.Impl;

import com.example.demo.Documents.Clientes;
import com.example.demo.Repository.ClientesRepository;
import com.example.demo.Services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public List<Clientes> listarTodos() {
        return this.clientesRepository.findAll();
    }

    @Override
    public Optional<Clientes> listarPorId(String id) {
        return this.clientesRepository.findById(id);
    }

    @Override
    public Clientes cadastrar(Clientes clientes) {
        return this.clientesRepository.save(clientes);
    }

    @Override
    public Clientes atualizar(Clientes clientes) {
        return this.clientesRepository.save(clientes);
    }

    @Override
    public void deletar(String id) {
        this.clientesRepository.deleteById(id);
    }
}
