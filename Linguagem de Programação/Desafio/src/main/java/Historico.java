

/**
 *
 * @author kelvi_000
 */
public class Historico {
  private Integer dia , mes , ano;
  private Double valor;
  private String operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Integer getDia() {
        return dia;
    }
    
    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValor() {
        return valor;
    }

    public String getOperacao() {
        return operacao;
    }
    
    
    
}
