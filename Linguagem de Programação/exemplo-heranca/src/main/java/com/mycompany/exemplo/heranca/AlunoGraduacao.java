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
public class AlunoGraduacao extends Aluno {
    
    // Atributos
    
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Double notaContinuada, Double notaIntegrada, Integer ra, String nome) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }
    
    public void exibeDados(){
        System.out.println("Dados do Aluno Graduação");
        System.out.println("Ra: "+ getRa());
        System.out.println("Nome: " + nome);
        System.out.println("Nota continuada: "+ notaContinuada);
        System.out.println("Nota Integrada: " + notaIntegrada);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +super.toString() + ", notaContinuada=" + notaContinuada + ", notaIntegrada=" + notaIntegrada + '}';
    }
    
    
    
}
