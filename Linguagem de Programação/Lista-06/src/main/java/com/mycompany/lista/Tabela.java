package com.mycompany.lista;

/**
 *
 * @author kelvi_000
 */
public class Tabela {
   private  Integer vitoria = 0, empate = 0 , derrota =0, pontuação = 0 ;
    
    public void setVitoria(Integer vitoria){
        this.vitoria += vitoria;
    }
      public Integer getVitoria(){
        return vitoria;
    }   
    public  void setEmpate(Integer empate){
        this.empate += empate;      
    }
    
    public Integer getEmpate(){
        return empate;
    }
    
    public void setDerrota(Integer derrota){
        this.derrota += derrota;
        }
    public  Integer getDerrota(){
        return derrota;
    }
      
    
}
