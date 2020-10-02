public class ListaObj<T> {

    private T[] vetor;
    private int nroElem;

    public ListaObj(int vetor) {
        this.vetor = (T[]) new Object[vetor];
        this.nroElem = 0;
    }

    public boolean adiciona(T valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
            return false;
        }
        else {
            vetor[nroElem++] = valor;
            return true;
        }
    }

    public void exibe() {
        System.out.println("\nExibindo elementos da lista:");
        for (int i=0; i< nroElem; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        else {
            return vetor[indice];
        }
    }
    public int busca(T valor) {
        for (int i=0; i < nroElem; i++) {
            if (vetor[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false;
        }
        else {
            for (int i=indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            nroElem--;
            return true;
        }
    }

    public void limpa() {
        nroElem = 0;
    }

    public boolean removeElemento(T valor) {
        return removePeloIndice(busca(valor));
    }

}