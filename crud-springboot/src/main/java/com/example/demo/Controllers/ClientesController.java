package com.example.demo.Controllers;

import com.example.demo.Documents.Clientes;
import com.example.demo.Responses.Response;
import com.example.demo.Services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public ResponseEntity<List<Clientes>> listarTodos(){
        return ResponseEntity.ok(this.clientesService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Clientes>> listarPorId(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(this.clientesService.listarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Response<Clientes>> cadastrar(@Valid @RequestBody Clientes clientes, BindingResult result){
        if(result.hasErrors()){
            List<String>erros = new ArrayList<String>();
            return ResponseEntity.badRequest().body(new Response<Clientes>(erros));
        }
        return ResponseEntity.ok(new Response<Clientes>((List<String>) this.clientesService.cadastrar(clientes)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response<Clientes>>atualizar(@PathVariable(name = "id") String id,@Valid @RequestBody Clientes clientes, BindingResult result){
        if(result.hasErrors()){
            List<String>erros = new ArrayList<String>();
            return ResponseEntity.badRequest().body(new Response<Clientes>(erros));
        }
        clientes.setId(id);
        return ResponseEntity.ok(new Response<Clientes>((List<String>) this.clientesService.atualizar(clientes)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer>remover(@PathVariable(name = "id") String id){
        this.clientesService.deletar(id);
        return ResponseEntity.ok(1);
    }

}
