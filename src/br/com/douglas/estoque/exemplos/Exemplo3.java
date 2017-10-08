/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.estoque.exemplos;

/**
 *
 * @author douglas-pc
 */
public class Exemplo3 {

    public static void main(String[] args) {
     /*
      *Trabalhando Loops
      */
    
     double soma = 0;
     int contador = 0;
     
//     for(contador = 0;contador < 35;contador++){
//             soma +=59;
//     }
     
     for(int i=0; i < 10;i++ ){
         if(i == 7 || i == 3){
            break;
         } 
         System.out.println(i);
     }
     
    //     while(contador < 35){
    //         double valorDoLivro = 59.90;
    //         soma += valorDoLivro;
    //         contador ++;
    //     }
    
       System.out.println("Valor do livro"+soma);
   }
}
