/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca;

/**
 *
 * @author kelvi_000
 */
public class Teste {
    public static void main(String[] args) {
        AlunoGraduacao al = new AlunoGraduacao(8.0, 7.0, 10000, "Tonhão do Uber");
        
        System.out.println("Nome do aluno" + al.getNome() +
                    "tem nota continuada de " + al.getNotaContinuada());
        System.out.println(" ");
        al.exibeDados();
    }

   
    
}
