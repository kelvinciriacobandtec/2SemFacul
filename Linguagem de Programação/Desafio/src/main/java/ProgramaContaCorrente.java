
/**
 *
 * @author kelvi_000
 */
public class ProgramaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente("Kelvin", 0.0);
        
        conta01.depositar(1000.00, 10, 02, 2020);
        conta01.sacar(100.00, 15, 02, 2020);
        
        conta01.depositar(60.00, 17, 03, 2020);
        conta01.sacar(50.00, 20, 03, 2020);
        
        conta01.sacar(500.00, 10, 04, 2020);
        
         conta01.exibirExtrato();
        
        
        
    }
}
