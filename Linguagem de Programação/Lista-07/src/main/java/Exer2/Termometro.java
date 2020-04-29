/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer2;

/**
 *
 * @author KELVAO_DAMASSA_CLAN
 */
public class Termometro {
    private Double temperaturaAtual, temperaturaMax, temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    
    
    void aumentarTemperatura (Double amtTemp){
        
        temperaturaAtual = amtTemp;
        
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
    }
    
    void diminuirTemperatura (Double dimTemp){
        
        temperaturaAtual = dimTemp;
        
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
    }
    
    Double exibeFahreinheit(){
       Double tempfare = (temperaturaAtual * 9/5) + 32;
       
       return  tempfare;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }
    
    
}
