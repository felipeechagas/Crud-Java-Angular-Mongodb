package com.example.demo.Repository;

import com.example.demo.Documents.Clientes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientesRepository extends MongoRepository<Clientes, String> {

}
