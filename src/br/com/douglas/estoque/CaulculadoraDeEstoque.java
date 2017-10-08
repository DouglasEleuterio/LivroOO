/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.estoque;

/**
 *
 * @author douglas-pc
 */
public class CaulculadoraDeEstoque {
    public static void main(String[] args) {
        double livroJava8 = 59.90;;
        double livroTDD = 2559.90;;
        String aviso;
        double soma = livroJava8 + livroTDD;
        
        System.out.println("O valor dos livros é: "+soma);
                
        if (soma <150) {
            System.out.println("Seu estoque está muito baixo");
        }else if (soma >= 2000){ 
            System.out.println("Seu estoque está muito alto");
        }else {
            System.out.println("Seu estoque esta bom");
        }
        
            
        
        //Operador Ternario
        //aviso = (soma <= 150)? "Estoque Baixissimo" : "Estoque Ok" ;
        //System.out.println(aviso);
    }
}
