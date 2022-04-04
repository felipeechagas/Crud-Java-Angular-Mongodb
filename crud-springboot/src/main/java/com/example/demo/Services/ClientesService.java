package com.example.demo.Services;

import com.example.demo.Documents.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {
    List<Clientes> listarTodos();
    Optional<Clientes> listarPorId(String id);
    Clientes cadastrar(Clientes clientes);
    Clientes atualizar(Clientes clientes);
    void deletar(String id);
}
