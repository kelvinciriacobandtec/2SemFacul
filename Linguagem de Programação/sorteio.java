import java.util.Random;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class sorteio{
    public static void main(String[] args){
        Scanner in = new  Scanner (System.in);
        Random rand = new Random();

        Integer acertos = 0;

        System.out.println("Digite um numero");
        Integer numero =  in.nextInt();

        for(int i = 1 ; i <=200 ; i++){
        
            Integer sorteio = rand.nextInt(100);
          
            if (numero.equals(sorteio)){
                acertos+=1;
            }
        }

        System.out.println(String.format("O numero foi sorteado %d vezes irmão", acertos));
    }
}