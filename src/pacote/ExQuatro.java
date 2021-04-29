package pacote;

/*
 * Comentário:
 * 
 * Função:
 * Receber do usuário os valores das horas de trabalho mensais, 
 * o valor da hora trabalhada e o percentual de desconto do salário 
 * bruto para calcular o salário bruto, o total de desconto do
 * salário e o salário líquido.
 * 
 * Funcionamento:
 * Dados fornecidos pelo exercício: As horas de trabalho mensais 
 * multiplicado pelo valor da hora equivale ao salário bruto.
 * O percentual de desconto fornecido (número de 0 a 1) multiplicado
 * pelo salário bruto equivale ao total de desconto do salário.
 * O salário líquido equivale ao salário bruto menos o total de 
 * desconto. Tudo isso é calculado e mostrado no console pelo
 * programa.
 */

import javax.swing.JOptionPane;

public class ExQuatro {
	
	public static void main(String[] args) {

        String msg0 = "Por favor, responda as perguntas sem as unidades.";
        JOptionPane.showMessageDialog(null, msg0);

        String ht = JOptionPane.showInputDialog("Quantas horas de trabalho por mes?");
        double horasTrabalhadas = Double.parseDouble(ht);

        String vh = JOptionPane.showInputDialog("Qual eh o valor da hora trabalhada?");
        double valorPorHora = Double.parseDouble(vh);

        String pd = JOptionPane.showInputDialog("Qual eh o percentual de desconto do salario bruto?");
        double percentualDeDesconto = Double.parseDouble(pd);

        double sb = horasTrabalhadas * valorPorHora;
        double td = percentualDeDesconto * sb / 100;
        double sl = sb - td;

        String msg1 = "Portanto:";
        String msg2 = "Horas Trabalhadas = " + horasTrabalhadas;
        String msg3 = "Salario Bruto = " + sb + " reais";
        String msg4 = "Total de Desconto do salario = " + td + " reais";
        String msg5 = "Salario Liquido = " + sl + " reais";

        JOptionPane.showMessageDialog(null, msg1);
        JOptionPane.showMessageDialog(null, msg2);
        JOptionPane.showMessageDialog(null, msg3);
        JOptionPane.showMessageDialog(null, msg4);
        JOptionPane.showMessageDialog(null, msg5);
	}
}