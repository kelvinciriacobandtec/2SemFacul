    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer2;

/**
 *
 * @author kelvi_000
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro teste = new Termometro(29.00, 30.00, 21.00);
        
        System.out.println(String.format("Termperatura atual: %.2f \n Temperatura Max: %.2f  \n Temperatura Min:  %.2f \n ====================== \n ======================", teste.getTemperaturaAtual(), teste.getTemperaturaMax() , teste.getTemperaturaMin()));
        teste.aumentarTemperatura(44.00);
        System.out.println(String.format(" \n temperatura maxima: %.2f ", teste.getTemperaturaMax()));
        teste.diminuirTemperatura(18.00);
        System.out.println(String.format(" \n temperatura minima: %.2f ", teste.getTemperaturaMin()));
        
        System.out.println(String.format("TEMPERATURA EM Fahreinheit:  %.2f", teste.exibeFahreinheit()));
 
    }
}
