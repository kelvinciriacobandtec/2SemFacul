import javax.swing.*;

public class TesteListaAluno {
    public static void main(String[] args) {
        Boolean Fim = false;
        Integer ra;
        String nome;
        Double nota;
        Integer selecão;

        ListaObj lobj = new ListaObj(10);

        while (!Fim == true){
            selecão = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: " +
                    "\n 1 - Adicionar aluno" +
                    "\n 2 - Exiber a lista" +
                    "\n 3 - Exibir um aluno a lista" +
                    "\n 4 - Limpar lista" +
                    "\n 5 - Fim"
            ));

            switch (selecão){
                case 1:

                   ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ra do aluno: "));
                   nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                   nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));

                   Aluno aluno = new Aluno(ra,nome,nota);
                   lobj.adiciona(aluno);

                    break;

                case 2:
                    lobj.exibe();

                    break;

                case 3:
                   int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero do elemento"));

                   JOptionPane.showMessageDialog(null,lobj.getElemento(numero));

                    break;

                case 4:

                    lobj.limpa();

                    break;

                case 5:
                    Fim = true;
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Invalida.","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
