public class ListaEstatica {

    private int inicio, fim;
    private int[] lista;

    public ListaEstatica(int tamanho) {
        lista = new int[tamanho];
        fim = -1;
    }

    public void add(int elem, int index) {
        if (index == fim + 1 && !isFull()) {
            lista[index] = elem;
            fim++;
        } else if (!isFull()) {
            for (int i = fim; i > -1; i--) {
                lista[i + 1] = i;
                fim++;
            }
            lista[index] = elem;
        }
    }

    public void add(int elem) {
        if (!isFull()) {
            lista[fim + 1] = elem;
            fim++;
        }
    }

    public int remove(int index) {
        if (index == fim) {
            lista[index] = 0;
            fim--;
        } else if (!isEmpty() && isInRange(index)) {
            int retorno = lista[index];
            for (int i = index; i <= fim; i++) {
                lista[i] = lista[i + 1];
                fim--;
            }
            return retorno;
        }
        return -1;
    }

    public int set(int elem, int index) {
        if (isInRange(index)) {
            int retorno = lista[index];
            lista[index] = elem;
            return retorno;
        }
        return -1;
    }

    public int get(int index) {
        if (isInRange(index)) {
            return lista[index];
        }
        return -1;
    }

    public int size() {
        return fim;
    }

    public boolean isEmpty() {
        return (fim == -1);
    }

    public boolean isFull() {
        return (fim == lista.length - 1);
    }

    private boolean isInRange(int index) {
        return (index >= 0 && index <= fim);
    }

}
