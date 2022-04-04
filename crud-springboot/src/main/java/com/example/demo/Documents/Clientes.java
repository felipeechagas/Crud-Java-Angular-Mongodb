package com.example.demo.Documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Document
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {

    @Id
    private String id;

    @NotEmpty(message = "Preencha o campo Nome.")
    private String position;

    @NotEmpty(message = "Preencha o campo Nome.")
    private String nome;
    @NotEmpty(message = "Preencha o campo Email.")
    @Email
    private String email;
    @NotEmpty(message = "Preencha o campo Telefone.")
    private String telefone;

}
