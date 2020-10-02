import java.util.Scanner;

public class exer1 {

    public static void exibeVetor ( int[] v ) {
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();

        for (int i = 7 ; i > 0 ; i--){
            System.out.print(v[i-1] + "\t");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[] = new int[7];


        for (int i = 0 ; i < vetor.length ; i ++ ){
            System.out.println("digite um numero: ");
           vetor[i] = in.nextInt();


        }

            exibeVetor(vetor);

    }
}
