
public class PilhaDinamica {

    private Node topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    public void push(int elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
    }

    public int pop() {
        if (!isEmpty()) {
            Node pop = topo;
            topo = topo.proximo;
            pop.proximo = null;
            return pop.elemento;
        }
        return -1;
    }

    public int top() {
        return topo.elemento;
    }

    public int size() {
        int cont = 0;
        Node aux = topo;
        while (aux != null) {
            aux = aux.proximo;
            cont++;
        }
        return cont;
    }

    public boolean isEmpty() {
        return (topo == null);
    }
}
