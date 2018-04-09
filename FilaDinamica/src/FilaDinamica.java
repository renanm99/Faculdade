
public class FilaDinamica {

    private Node inicio, fim;
    private int quantidade;

    public FilaDinamica() {
        inicio = fim = null;
        quantidade = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return quantidade;
    }

    public void enqueue(int elemento) {
        Node novo = new Node(elemento);
        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.proximo = novo;
        }
        fim = novo;
        quantidade++;
    }

    public int dequeue() {
        if (!isEmpty()) {
            Node aux = inicio;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            aux.proximo = null;
            quantidade--;
            return aux.elemento;
        }
        return -1;
    }

    public int front() {
        if (!isEmpty()) {
            return inicio.elemento;
        }
        return -1;
    }
}
