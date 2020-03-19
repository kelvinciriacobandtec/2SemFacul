package com.mycompany.encapsulamento;


public class ContaCorrente {
    
    //atributos
    private Double saldo = 0.0;
    public Integer contador = 0;
    
    
    //metodos
   public void depositar50(){
        saldo+=50;
    };
    
   public void sacar50(){
        if (saldo>=50) {
            saldo-=50;
            contador++;
        }
    };

   //exemplo de getter 
    public Double getSaldo() {
        return saldo;
    }
    //exemplo de setter
    public void setSaldo(Double saldo){
    // this.saldo esta se referindo a o Double saldo la de cima
        this.saldo += saldo;
        contador++;
    }
    
    public Integer getContador(){
        return contador;
    }
    
}

