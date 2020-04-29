package exer3;

/**
 *
 * @author kelvi_000
 */
public class TesteCinema {

    public static void main(String[] args) {
        EntradaDeCinema filme1 = new EntradaDeCinema(13, 05, 15, "A ida de quem não foi");
        EntradaDeCinema filme2 = new EntradaDeCinema(22, 02, 20, "Toy Story 9 o inimigo agora é outro");

        System.out.println(String.format("=================== \n Nome do Filme: %s"
                + " \n Horario do filme: %d"
                + " \n Sala: %d"
                + " \n Valor: %d"
                + " \n =================="
                + " \n valor com desconto: %.2f"
                + " \n valor com desconto do horario: %.2f",
                 filme1.getNome(), filme1.getHora(), filme1.getSala(), filme1.getValor(), filme1.GetCalculaDesconto(false, 11), filme1.calculaDescontoHorario()));

        System.out.println(String.format("=================== \n Nome do Filme: %s"
                + " \n Horario do filme: %d"
                + " \n Sala: %d"
                + " \n Valor: %d"
                + " \n =================="
                + " \n valor com desconto: %.2f"
                + " \n valor com desconto do horario: %.2f",
                 filme2.getNome(), filme2.getHora(), filme2.getSala(), filme2.getValor(), filme2.GetCalculaDesconto(true, 27), filme2.calculaDescontoHorario()));
    }
}
