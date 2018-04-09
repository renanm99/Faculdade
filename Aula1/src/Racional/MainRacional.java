/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racional;

/**
 *
 * @author Renan
 */
public class MainRacional {
    
    public static void main(String[]args){
        Racional fracao1 = new Racional(2,2);
        Racional fracao2 = new Racional(1,1);
        Racional fracao3 = new Racional(1,1);
        
        System.out.println(fracao1.soma(fracao2).subtracao(fracao3).Apresentar());
        System.out.println(fracao1.subtracao(fracao2).Apresentar());
        System.out.println(fracao1.multiplicacao(fracao2).Apresentar());
        System.out.println(fracao1.divisao(fracao2).Apresentar());
    }
    
}
