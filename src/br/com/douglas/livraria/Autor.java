/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.livraria;

/**
 *
 * @author douglas-pc
 */
public class Autor {
    private String nome;
    private String email;
    private String cpf;
    
    public void mostrarDetalhes(){
         //Detalhes Autor
        System.out.println("Mostrando detalhes do Autor");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }

    public Autor (){
        
    }
    
    public Autor(String nome){
        this.nome = nome;
    }

    public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
