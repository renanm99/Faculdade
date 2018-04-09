/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class TestePilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha(3);

        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        System.out.println(p.Size());
        
        try {
            p.push(10);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        System.out.println(p.Size());
        System.out.println(p.top());
    }

}
