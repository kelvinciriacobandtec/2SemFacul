import java.util.Scanner;

public class CalculadoraPizza {
    public static void main(String [] args){
        String saborPizza;
        Double qntRacha, maxRacha , valorpizza , result , maximo;
        
        Scanner leitor = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da pizza: ");
        valorpizza = leitor.nextDouble();
        
        System.out.println("Qual o sabor da pizza? ");
        saborPizza = in.nextLine();
        
        System.out.println("Quantas pessoas ira rachar a conta? ");
        qntRacha = leitor.nextDouble();

        System.out.println("valor maximo para cada parça? ");
        maxRacha = leitor.nextDouble();
        
        result = valorpizza / qntRacha;
        maximo = qntRacha * maxRacha;
        
        if (result <= maxRacha) {
            System.out.println(String.format("a pizza de %s será dividida entre %f pessoas. R$ %f p/ cada", saborPizza, qntRacha , result ));
        } else {
            System.out.println(String.format("Deu ruim no racha. A pizza deveria custar no máximo %f ", maximo));
        }
        
//     a pizza de SABOR será dividida entre X pessoas. R$VALOR p/ cada;;;
        
        
    }
}