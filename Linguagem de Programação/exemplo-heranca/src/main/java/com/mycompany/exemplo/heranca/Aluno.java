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
public class Aluno {
private Integer ra;
protected String nome ;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }



    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
    
    


}
