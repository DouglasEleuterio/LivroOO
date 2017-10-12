/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.livraria.teste;

import br.com.douglas.livraria.Autor;
import br.com.douglas.livraria.produtos.Ebook;
import br.com.douglas.livraria.produtos.LivroFisico;
import br.com.douglas.service.CarrinhoDeCompras;

/**
 *
 * @author douglas-pc
 */
public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Douglas Eleutério");
        
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Drive Development");
        fisico.setValor(59.90);
        if (fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é: R$"+fisico.getValor());
        }
        
        Ebook ebook = new Ebook(autor);
        fisico.setNome("Test-Drive Development");
        ebook.setValor(29.90);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        
        
        
        System.out.println("Total: "+carrinho.getTotal());
    } 
}
