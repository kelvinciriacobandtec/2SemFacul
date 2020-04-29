
package com.mycompany.aula.virtual.sem2;

/**
 *
 * @author kelvi_000
 */
public class ExemploMetodo {

    public static void main(String args[]){
        System.out.println("Boa noite Kelvao");
    ExibeQuadro("Boinha");
    }
    
    public static void ExibeQuadro(String frase){
        ExibeAsterisco();
        System.out.println("****                        *****");
        ExibeAsterisco();
        System.out.println("****      "+ frase +"            *****");
        ExibeAsterisco();
    }
    
    public static void ExibeAsterisco(){
        System.out.println("*********************************");
    }
}
