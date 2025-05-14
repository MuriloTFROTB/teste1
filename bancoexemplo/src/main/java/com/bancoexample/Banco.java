package com.bancoexample;

import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    

}
