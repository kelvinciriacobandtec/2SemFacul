/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Random;

public class Dado {

    Random aleatorio = new Random();
    
    public Integer Jogar(){
        Integer numero =  aleatorio.nextInt();
        return numero;
    }
}
