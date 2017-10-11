/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.service;

import br.com.douglas.model.Autor;
import br.com.douglas.model.Ebook;
import br.com.douglas.model.Livro;
import br.com.douglas.model.LivroFisico;
import br.com.douglas.model.MiniLivro;

/**
 *
 * @author douglas-pc
 */
public class RegrasDeDesconto {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);
        
        if(livro.aplicarDescontoDe(0.30)){
            System.out.println("Valor do livro com Desconto: "+livro.getValor());
        }else{
            System.out.println("Desconto não pode ser superior a 30%");
        }
    
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        if(ebook.aplicarDescontoDe(0.15)){
             System.out.println("Valor do livro com Desconto: "+ebook.getValor());
        } else {
            System.out.println("Desconto não pode ser superior a 15%");
        }
        
        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(39.90);
        if(miniLivro.aplicarDescontoDe(0.3)){
             System.out.println("Valor do livro com Desconto: "+miniLivro.getValor());
        } else {
            System.out.println("Desconto não pode ser superior a 15%");
        }
        
    }
}
