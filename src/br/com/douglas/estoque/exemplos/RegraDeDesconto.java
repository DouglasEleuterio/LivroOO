/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.estoque.exemplos;

import br.com.douglas.model.Livro;

/**
 *
 * @author douglas-pc
 */
public class RegraDeDesconto {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setValor(59.90);

        System.out.println("Valor atual do Livro: R$ " + livro.getValor());
        if (!livro.aplicarDescontoDe(0.8)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: R$ " + livro.getValor());
        }
    }
}
