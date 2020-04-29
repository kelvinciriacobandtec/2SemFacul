
package com.mycompany.kelvin.roberto.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelvi_000
 */
public class Hospital{
    private String nome;
    private Integer quantidadeLeitos;
    private List lista = new ArrayList<Paciente>();

    public Hospital(String nome, Integer quantidadeLeitos) {
 
        this.nome = nome;
        this.quantidadeLeitos = quantidadeLeitos;
        
    
    }
    
    public void internarPaciente(Paciente paciente){
        if (getQuantidadeLeitos() >= 0) {
            quantidadeLeitos --; 
            lista.add(new Paciente(paciente.getNome(), paciente.getIdade(), paciente.getPlanoDeSaude()));
            System.out.println("Paciente " + paciente.getNome() + " Internado");
            
        }else{
            System.out.println("não foi possível internar o paciente "+ paciente.getNome() +" será necessário transferi-lo!");
        }
        
    }
    
    public void exibeDadosPacientes(){
        
        if (lista.size() > 0) {
           for (int i = 0 ; i < lista.size(); i ++){
             // System.out.println(String.format(" Paciente: %d \n Nome do Paciente: %s \n Idade: %d \n Plano de Saúde: %s", i + 1 ,  , paciente.getIdade() , paciente.getPlanoDeSaude()));
               System.out.println(lista.get(i) + "\n ================================");
           }
     
        } else {
            System.out.println("Não há pacientes internados!");
        }
    }
    
    public void exibeLeitos(){
        System.out.println("Quantidade de leitos disponíveis: " + quantidadeLeitos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeLeitos() {
        return quantidadeLeitos;
    }

    public void setQuantidadeLeitos(Integer quantidadeLeitos) {
        this.quantidadeLeitos = quantidadeLeitos;
    }

    @Override
    public String toString() {
        return "Hospital" + "nome=" + nome + ", quantidadeLeitos=" + quantidadeLeitos + ", lista=" + lista ;
    }
    
    
    
    
}
