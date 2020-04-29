public class Empregado {
   private String nome , cargo;
   private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Double reajustarSalario(Integer pctParametro){
        Double resultado = getSalario() - (getSalario() * pctParametro) / 100;
        return resultado;
        
    }
    
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }
    
    
}
