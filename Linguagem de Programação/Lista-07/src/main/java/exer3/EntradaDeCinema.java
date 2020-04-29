/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

/**
 *
 * @author kelvi_000
 */
public class EntradaDeCinema {

    private Integer hora, sala, valor;
    private Double desconto, resultado;
    private String nome;

    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }

    Double GetCalculaDesconto(boolean estudante, Integer idade) {
        if (idade <= 12) {
            desconto = 0.50;
        }

        if (estudante = true && idade > 12 && idade <= 15) {
            desconto = 0.40;
        }

        if (estudante = true && idade > 16 && idade <= 20) {
            desconto = 0.30;
        }
        if (estudante = true && idade > 20) {
            desconto = 0.20;
        }

        resultado = getValor() - (getValor() * desconto);
        return resultado;
    }

    Double calculaDescontoHorario() {
        if (hora < 16) {
            resultado = resultado - (valor * 0.10);
            return resultado;
        }
        return resultado;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getSala() {
        return sala;
    }

    public Integer getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

}
