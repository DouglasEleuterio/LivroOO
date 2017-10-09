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
public class LivroFisico extends Livro {
    
    private double taxaImpressao = 0.05;
    
    public LivroFisico (Autor autor){
        super(autor);
    }
    
    public double getTaxaImpressao(){
        return this.getValor() * taxaImpressao;
    }
    
}
