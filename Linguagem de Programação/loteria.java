import java.util.Random;
import java.util.Scanner;

public class loteria {
    public static void main(String args[]) {
        Random rand = new Random();
        Integer aleatorio = rand.nextInt(10);
        Integer acertos = 0, tentativa = 0;
        Scanner in = new Scanner(System.in);

        while (acertos < 1) {
            
            System.out.println("Digite um numero de 1 a 10 chefe");
            Integer n1 = in.nextInt();
            if (n1.equals(aleatorio)) {
                acertos++;
                tentativa++;
                if (tentativa <= 3) {
                    System.out.println("Você é muito sortudo\ntentativas "+tentativa+"\nnumero sorteado  "+aleatorio);
                } else if (tentativa >= 4 && tentativa <= 10) {
                    System.out.println("Você é sortudo\ntentativas "+tentativa+"\nnumero sorteado  "+aleatorio);
                } else {
                    System.out.println("Melhor ser trabalhador \ntentativas "+tentativa+"\nnumero sorteado  "+aleatorio);
                }
            } else {

                System.out.println("Numero digitado: " + n1 + " está errado.... >.< \n" );
            }
            tentativa++;
        }

        

    }
}