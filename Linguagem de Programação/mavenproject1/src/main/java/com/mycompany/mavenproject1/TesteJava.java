/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TesteJava {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        Double horasVoo = 0.0 , contador = 0.0 ;
        Integer voo = 0;
        
        System.out.println("Digite seu nome");
        String nome = in.nextLine();
        
        System.out.println("Quantas horas foi seu ultimo vôo");
        horasVoo = in.nextDouble();
        
        while (horasVoo >= 0.0) {            
            
            if (horasVoo == 0.0 || horasVoo > 6.0){
                System.out.println("quantidade invalida patrão");
                voo--;
            }else{
            contador+=horasVoo;
            }
            System.out.println(String.format("%s agora tem um total de %.2f horas de vôo", nome , contador));
            
             System.out.println("Quantas horas foi seu ultimo vôo");
             horasVoo = in.nextDouble();
             
             voo++;
        }
        System.out.println(String.format("%s se aposentou após fazer %d vôos acumulando %.2f horas!", nome ,voo, contador));
        
        
    }
}
