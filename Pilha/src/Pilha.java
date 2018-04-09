/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class Pilha {

    private int[] pilha;
    private int topo;

    public Pilha(int tamanho) {
        pilha = new int[tamanho];
        topo = -1;
    }

    public Pilha() {
        pilha = new int[10];
        topo = -1;
    }

    public void push(int elemento) throws Exception {
        if (!isFull()) {
            if (elemento >= 0) {
                topo++;
                pilha[topo] = elemento;
            } else {
                throw new Exception("ELEMENTO INVÁLIDO");
            }
        } else {
            throw new Exception("PILHA CHEIA");
        }
    }

    public int pop() {
        int elem = -1;
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
