/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author Renan
 */
public class MainNode {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(20);
        
        a.proximo = b;
        b.proximo = c;
        
        System.out.println(a.elemento);
        System.out.println(a.proximo.elemento);
        System.out.println(a.proximo.proximo.elemento);
        
    }
    
}
