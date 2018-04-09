
public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        System.out.println(pilha.size());
        
        pilha.push(5);
        System.out.println(pilha.size());
        pilha.push(10);
        System.out.println(pilha.size());
        
        System.out.println("Elemento removido: "+pilha.pop());
        System.out.println(pilha.size());
        
        System.out.println("Elemento no topo: "+pilha.top());
    }
    
}
