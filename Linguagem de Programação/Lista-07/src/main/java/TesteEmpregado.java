public class TesteEmpregado {
    public static void main(String[] args){
        Empregado João = new Empregado("João", "Analista de Sistemas", 5.400);
        Empregado Kelvin = new Empregado("KELVIN", "CEO", 220.880);
        
        
        System.out.println("====================");
        System.out.println(João.getNome());
        System.out.println(João.getCargo());
        System.out.println(String.format("%.3f",João.reajustarSalario(15)));
        System.out.println("====================");
        
        System.out.println("=-=-=-=-=-=-=-=-=-=--");
        System.out.println(Kelvin.getNome());
        System.out.println(Kelvin.getCargo());
        System.out.println(Kelvin.getSalario());
        System.out.println(Kelvin.reajustarSalario(10));
        System.out.println("=-=-=-=-=-=-=-=-=-=--");
        
        
    }
}
