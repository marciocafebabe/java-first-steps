package pacote;

/*
 * Coment�rio:
 * 
 * Fun��o:
 * Receber do usu�rio os valores das horas de trabalho mensais, 
 * o valor da hora trabalhada e o percentual de desconto do sal�rio 
 * bruto para calcular o sal�rio bruto, o total de desconto do
 * sal�rio e o sal�rio l�quido.
 * 
 * Funcionamento:
 * Dados fornecidos pelo exerc�cio: As horas de trabalho mensais 
 * multiplicado pelo valor da hora equivale ao sal�rio bruto.
 * O percentual de desconto fornecido (n�mero de 0 a 1) multiplicado
 * pelo sal�rio bruto equivale ao total de desconto do sal�rio.
 * O sal�rio l�quido equivale ao sal�rio bruto menos o total de 
 * desconto. Tudo isso � calculado e mostrado no console pelo
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