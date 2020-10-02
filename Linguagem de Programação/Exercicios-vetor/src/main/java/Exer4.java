import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer vetor[] = new Integer[10];
        int cont = 0;

        for (int i = 0 ; i < vetor.length ; i ++ ){
            System.out.println("digite um numero: ");
            vetor[i] = in.nextInt();
        }

        System.out.println("Digite o numero apra a pesquisa: ");
        Integer numero = in.nextInt();

        for (int i = 0 ; i < vetor.length ; i++){
            if (numero.equals(vetor[i])){
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println(String.format("O numero %d foi digitado %d vezes", numero , cont));
        }else {
            System.out.println(String.format("O numero %d não foi digitado nenhuma vez ", numero));
        }
    }
}
