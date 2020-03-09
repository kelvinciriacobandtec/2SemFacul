import java.util.Scanner;

public class acumulados{
    public static void main(String [] agrs){
        Scanner in = new Scanner(System.in);

        Integer soma = 0 , numero = 0;

        System.out.println("Digite um numero");
        numero = in.nextInt();

        soma+= numero;
       while (numero != 0) {
        System.out.println("Digite um numero");
        numero = in.nextInt();

        soma+= numero;
       }
       
        // do{
        //     System.out.println("Digite um numero");
        //     numero = in.nextInt();

        //     soma += numero;
        // }while(numero == 0);

        System.out.println(String.format("A soma de todos os numero deu %d",soma));

    }
}

// by:kelvao