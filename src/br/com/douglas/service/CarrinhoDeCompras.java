/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.service;

import br.com.douglas.model.Ebook;
import br.com.douglas.model.LivroFisico;
import br.com.douglas.model.Livro;


/**
 *
 * @author douglas-pc
 */


public class CarrinhoDeCompras {
    
    private double total;
    
    public void adiciona(Livro livro){
        System.out.println("Adicionado: "+livro);
        livro.aplicarDescontoDe(0.05);
        total += livro.getValor();
        
        
    }


    //Forma não orientada a Ojetos de Pensar.
    /*
    public void Adiciona(LivroFisico livro){
        System.out.println("Adicionado: "+livro);
    }
    
    public void Adiciona(Ebook livro){
        System.out.println("Adicionado: "+livro);
    }
    */

    public double getTotal() {
        return total;
    }
   
}
