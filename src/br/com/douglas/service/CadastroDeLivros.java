/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.service;

import br.com.douglas.model.Autor;
import br.com.douglas.model.Livro;
import br.com.douglas.model.LivroFisico;
import br.com.douglas.model.Ebook;

/**
 *
 * @author douglas-pc
 */
public class CadastroDeLivros {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);
        
        //Outro Autor
        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");

        Livro outrolivro = new Ebook(outroAutor);
        outrolivro.setNome ("Lógica de Programaçãao");
        outrolivro.setDescricao("Crie seus primeiros programas");
        outrolivro.setValor(59.90);
        outrolivro.setIsbn("978-85-66250-22-0");
        outrolivro.setAutor(outroAutor);
        
        livro.mostrarDetalhes();
        outrolivro.mostrarDetalhes();
              
    }
}
