import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double resultado = 0.0;
        int vetor[] = new int[10];


        for (int i = 0 ; i < vetor.length ; i ++ ){
            System.out.println("digite um numero: ");
            vetor[i] = in.nextInt();
            resultado += vetor[i];
        }
        resultado = resultado / vetor.length;
        System.out.println("\nMédia: " +resultado);
        for (int i = 0 ; i < vetor.length ; i++){
            if (resultado < vetor[i]){
                System.out.print(vetor[i] + ", ");
            }
        }
        System.out.print("finalizado.");
    }
}
