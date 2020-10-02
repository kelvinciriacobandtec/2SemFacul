import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer dia;
        Integer mes;
        Integer vetorDias[];
        Integer vetormes[];
        Integer soma = 0;

        vetorDias = new  Integer[]{31,28,31,30,31,30,31,31,30,31,30,31};
        vetormes = new  Integer[]{1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("Digite um Dia: ");
        Integer diaDigitado = in.nextInt();
        System.out.println("Digite o numero do mês");
        mes = in.nextInt();
        if (diaDigitado < 1 || diaDigitado > 28){
            if (diaDigitado > 31) {
                System.out.println("Quantidade de numero errado");
            }
            if (mes==2) {
                System.out.println("Quantidade de dias está errado para esse mês");
             return;
            }
        }
        soma = diaDigitado;
        for (int i = 0 ; i < mes-1; i++){
                soma +=vetorDias[i];
        }

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano", diaDigitado,mes,soma));

    }
    // STOPSHIP: 17/09/2020  
}
