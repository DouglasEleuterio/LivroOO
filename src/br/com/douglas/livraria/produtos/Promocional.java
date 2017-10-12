/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.livraria.produtos;

/**
 *
 * @author dougas
 */
@FunctionalInterface
public interface Promocional {

    abstract boolean aplicarDescontoDe(double porcentagem);
    default boolean aplicaDescontoDe10Porcento() {
        return aplicarDescontoDe(0.1);
    }

}
