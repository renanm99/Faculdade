/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class Inversao {

    private char[] pilha;
    private int topo;
    
    public Inversao(int tamanho) {
        pilha = new char[tamanho];
        topo = -1;
    }

    public void push(char elemento) {
        if (!isFull()) {
            topo++;
            pilha[topo] = elemento;
        } else {
            //throw new Exception("PILHA CHEIA");
        }
    }

    public char pop() {
        char elem = ' ';
        if (!isEmpty()) {
            elem = pilha[topo];
            topo--;
        }
        return elem;
    }

    public int top() {
        if (!isEmpty()) {
            return pilha[topo];
        }
        return -1;
    }

    public String Inverter() {
        String inversao = "";
        for (int i = Size()-1; i >= 0; i--) {
            inversao += pilha[i];
        }
        return inversao;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == pilha.length - 1);
    }

    public int Size() {
        return topo + 1;
    }

}
