/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;


import java.util.ArrayList;
import java.util.List;

public class Grupo {
    
    // Atributos
    private String nome;            // nome do grupo
    private List<Contato> lista;    // lista de contatos

    // Construtor que recebe o nome do grupo
    public Grupo(String nome) {
        this.nome = nome;
        lista = new ArrayList<Contato>();   // instancia a lista
    }
    
    // Métodos
    
    // Método adiciona - Recebe um objeto Contato e adiciona esse contato à lista
    public void adiciona(Contato c) {
        lista.add(c);
    }
    
    // Método remove - Recebe um objeto Contato e remove esse contato da lista 
    public void remove(Contato c) {
        lista.remove(c);
    }

    // Getter do atributo lista
    public List<Contato> getLista() {
        return lista;
    }
    
    
}
