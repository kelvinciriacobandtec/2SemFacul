import java.util.Scanner;


public class Teste {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("digite um numero");
            Integer num = scan.nextInt();
            if (!(num % 2 == 0)) {
                num += 11;
                if (num % 2 == 0) {
                    num += 28;
                } else {
                    num-=10;
                }
            } else {
                num *= -1;
                if (num < 0) {
                    num += 31;
                }else{
                    num*=2;
                }
            }
            System.out.println(num);
        }
    }