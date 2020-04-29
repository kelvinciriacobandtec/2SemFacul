
package com.mycompany.kelvin.roberto.c2;

/**
 *
 * @author kelvi_000
 */
public class Paciente {
   private String nome, planoDeSaude;
   private Integer idade;
    
    
    //Dimitri Vegas & Like Mike

    public Paciente(String nome, Integer idade, String planoDeSaude) {
        this.nome = nome;
        this.idade = idade;
        this.planoDeSaude = planoDeSaude;
    }

    public void exibirDados(){
        System.out.println(String.format("======= Dados do Paciente ======= \n "
                         + "Nome: %s \n Idade: %d \n Plano de Saúde: %s", getNome() , getIdade() , getPlanoDeSaude()));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    @Override
    public String toString() {
        return "Paciente" + "nome=" + nome + ", idade=" + idade + ", planoDeSaude=" + planoDeSaude;
    }
    
    
}
