/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.livraria.teste;

import br.com.douglas.livraria.Autor;
import br.com.douglas.livraria.produtos.Ebook;
import br.com.douglas.livraria.produtos.LivroFisico;
import br.com.douglas.livraria.produtos.MiniLivro;
import br.com.douglas.livraria.produtos.Livro;



/**
 *
 * @author douglas-pc
 */
public class RegrasDeDesconto {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setValor(59.90);
        
        if(livroFisico.aplicarDescontoDe(0.30)){
            System.out.println("Valor do livro com Desconto: "+livroFisico.getValor());
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
        
        
    }
}
