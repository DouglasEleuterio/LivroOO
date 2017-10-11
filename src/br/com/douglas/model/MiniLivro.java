/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.model;

/**
 *
 * @author dougas
 */
public class MiniLivro extends Livro{
    
    public MiniLivro (Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        return false;
    }
    
    
}
