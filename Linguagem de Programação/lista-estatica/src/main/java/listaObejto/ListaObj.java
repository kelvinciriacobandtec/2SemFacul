package listaObejto;

public class ListaObj <T> {

    private T[] vetor;   // vetor onde será armazenado os elementos da lista
    private int nroElem;    // representa a quantidade de elementos da lista e tb
    // o índice do vetor onde será colocado o próximo elemento

    // Construtor
    // Recebe o tamanho máximo da lista
    public ListaObj(int tam) {
        vetor = (T[]) new Object[tam];   // Cria o vetor com o tamanho máximo recebido
        nroElem = 0;             // Zera o número de elementos
    }

    // Métodos

    // Método adiciona - recebe o valor a ser inserido na lista
    public boolean adiciona(T valor) {
        if (nroElem >= vetor.length) {          // Verifica se a lista está cheia
            System.out.println("Lista está cheia");
            return false;
        } else {
            vetor[nroElem++] = valor;           // Se não está, coloca o valor no vetor,
            // na posição nroElem e incrementa nroElem
            return true;
        }
    }

    public void exibe(){}
}