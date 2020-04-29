
package packag;

public class Concessionaria {
    public boolean ligado = false;
    Double acelerar = 0.0;
    
    public void CarroLigado(){
        ligado = true;
    }
    
    public void CarroDesligado(){
        ligado = false;
    }
    
    public  void Acelerar(){
        acelerar += 10;
    } 
    
    public  void freiar(){
        acelerar -= 10;
    } 
    
//      public void setStatus(Boolean ligado){
//    // this.ligado esta se referindo a o Double saldo la de cima
//        this.ligado = true;
// 
//    };
}
