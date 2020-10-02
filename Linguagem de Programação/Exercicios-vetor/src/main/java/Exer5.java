import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner modelo = new Scanner(System.in);
        Scanner combustivel = new Scanner(System.in);
        String posicao = null;
        Integer combu = 0;

        String vetorCarro[] = new String[5];
        Integer vetorCombu[] = new Integer[5];

        for (int i = 0; i < vetorCarro.length; i++){
            System.out.println("Digite o nome da marca: ");
            vetorCarro[i] = modelo.nextLine();
            System.out.println("Digite quantos km faz 1 litro: ");
            vetorCombu[i] = combustivel.nextInt();
            combu = vetorCombu[i];
        }

        for (int i = 0 ; i < vetorCombu.length ; i++){
            if (combu < vetorCombu[i] ){
                combu = vetorCombu[i];
                posicao = vetorCarro[i];
            }
        }

        System.out.println(String.format("O carro mais ecomico é %s", posicao));

    }
}
