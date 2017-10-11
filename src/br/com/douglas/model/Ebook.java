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
public class Ebook extends Livro {
    private String waterMark;
    
    public Ebook (Autor autor){
       super(autor);
    }
    
    //Página 83
    @Override
    public boolean aplicarDescontoDe (double porcentagem){
        if(porcentagem > 0.15){
            return false;
        } else {
//        double desconto = this.getValor() * porcentagem;
//        this.setValor(this.getValor() - desconto);
//        return true;
        System.out.println("Aplicado desconto de Ebook: "+porcentagem * this.getValor());
        return super.aplicarDescontoDe(porcentagem);
        //Capitulo de Interfaces
        }
    }
    
    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    
}
