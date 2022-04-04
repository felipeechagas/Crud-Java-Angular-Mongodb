package com.example.demo.Responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response<T> {

    private T data;
    private List<String> erros;

    public Response(List<String> erros){
        this.erros = erros;
    }

}
