/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.model;

/**
 *
 * @author douglas-pc
 */
public abstract class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

  
    public Livro(Autor autor){
        this();
        this.autor = autor;
        this.impresso = true;
    }
    
    public Livro(double valor){
        this();
        this.valor = valor;
    }
    
    public Livro (){
        this.isbn = "000-00-00000-00-0";
    }
    
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do Livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

     boolean temAutor(){
        return this.autor != null;
    }
    
    /**
     * @param Porcetagem 10% = 0.1 | 25% = 0.25
     */
     public abstract boolean aplicarDescontoDe(double porcentagem);
//    public boolean aplicarDescontoDe(double porcentagem) {
//        if(porcentagem > 0.3){
//            return false;
//        } else {
//            System.out.println("Desconto de Livro Fisico Aplicado R$ :"+porcentagem * this.getValor());
//        this.valor -= this.valor * porcentagem;
//        return true;
//        }
//    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
  
    
}
