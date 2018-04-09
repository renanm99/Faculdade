package Ponto;
public class Aula1 {
    public static void main(String[] args) {
        
        Ponto A = new Ponto(5,5);
        Ponto B = new Ponto(10,10);
        Ponto C = new Ponto (15,15);
        
        System.out.println(B.calculaDistancia(A));

        System.out.println(A.alinhamento(B,C));
    }
    
}
