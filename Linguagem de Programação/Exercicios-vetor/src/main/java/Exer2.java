import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner tex = new Scanner(System.in);
        String vetor[] = new String[10];
        String nome;

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.println("digite um nome: ");
           vetor[i] = in.nextLine();
        }

        System.out.println("Digite um nome para pesquisa: ");
        nome = tex.nextLine();
        for (int i = 0 ; i < vetor.length ; i++ ){
            if (vetor[i].equals(nome.trim())){
                   System.out.println("nome encontrado: " + nome + " no indice: " + (i + 1));
            }

        }
        }
    }

