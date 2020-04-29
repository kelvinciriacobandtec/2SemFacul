import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author kelvi_000
 */
public class ContaCorrente {
    private String titular;
    private Double saldo = 0.0;
    private List<Historico> historicos = new ArrayList<>();

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    
    public void depositar(Double valor , Integer dia , Integer mes, Integer ano){
        this.saldo += valor;
        historicos.add(new Historico(dia, mes, ano,valor, "depositar"));
        
    }
    
    public void sacar(Double valor , Integer dia , Integer mes, Integer ano){
        this.saldo = saldo - valor;
        historicos.add(new Historico(dia, mes, ano,valor, "saco"));
    }
    
    public void exibirExtrato(){
        JOptionPane.showMessageDialog(null,String.format(" Nome: %s \n Saldo Atual: %.2f", getTitular(),getSaldo()));     
         
       historicos.forEach(
       (dados) ->{
           System.out.println("\n valor: " + dados.getValor() + " Data: " + dados.getDia() + "/" + dados.getMes() +"/"+ dados.getAno() + "Tipo: " + dados.getOperacao());
       }
       );
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

   

    
    
    
    
}
