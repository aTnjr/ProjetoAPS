/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author wilker
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private double id;
    private String telefone;
    
    
    public void pessoa(String nome, String cpf, double id, String telefone){
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    

    
}
