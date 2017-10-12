/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.livraria.produtos;
import br.com.douglas.livraria.Editora;

/**
 *
 * @author dougas
 */
public class Revista implements Produto, Promocional{
    
    private Editora editora;

    @Override
    public double getValor() {
        return this.getValor();
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
