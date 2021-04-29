package pacote;

import java.util.Scanner;

/*
 * EXTRATO DO SERVI�O:
 * 
 * Fun��o:
 * Receber do usu�rio os valores do pre�o do servi�o, dos gastos mensais 
 * e das porcentagens que cada um dos 3 s�cios da empresa t�m direito para
 * fornecer o extrato do servi�o, o qual mostra o valor poupado para 
 * reinvestimento na empresa, valor dos gastos mensais e os recebimentos
 * de cada um dos 3 s�cios em reais.
 * 
 * Funcionamento:
 * Dados fornecidos pela empresa: A metade do valor do servi�o menos os 
 * custos mensais equivale ao valor poupado para reinvestimento na empresa.
 * Os recebimentos dos s�cios s�o calculados multiplicando cada porcentagem
 * (valor entre 0 e 1) pela metade do valor do servi�o, pois essa metade
 * � o dinheiro destinado aos tr�s. Todos os dados s�o calculados pelo
 * programa e mostrados no extrato do servi�o.
 */

public class desafio0403 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double vs, cp, pct1, pct2, pct3;
		
		System.out.println("Por favor, digite o valor do servi�o:");
		vs = s.nextDouble();
		
		System.out.println("Por favor, digite o valor dos gastos mensais:");
		cp = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o s�cio 1 tem direito:");
		pct1 = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o s�cio 2 tem direito:");
		pct2 = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o s�cio 3 tem direito:");
		pct3 = s.nextDouble();
		
		double vpr = vs / 2 - cp;
		double v1 = pct1 / 100 * vs / 2;
		double v2 = pct2 / 100 * vs / 2;
		double v3 = pct3 / 100 * vs / 2;
		
		if (pct1 + pct2 + pct3 == 100) {
			System.out.println("xxxxxxxxEXTRATO DO SERVI�Oxxxxxxxxxx");
			System.out.println("Valor poupado para reinvestimento: " + vpr + " reais");
			System.out.println("Valor dos gastos mensais: " + cp + " reais");
			System.out.println("Recebimentos do s�cio 1: " + v1 + " reais");
			System.out.println("Recebimentos do s�cio 2: " + v2 + " reais");
			System.out.println("Recebimentos do s�cio 3: " + v3 + " reais");
		} else {
			System.out.println("Erro: A soma dos percentuais de lucro dados aos s�cios est� diferente de 100%");
		}
		
		s.close();
	}

}
