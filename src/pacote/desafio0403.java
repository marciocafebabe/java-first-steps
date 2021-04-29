package pacote;

import java.util.Scanner;

/*
 * EXTRATO DO SERVIÇO:
 * 
 * Função:
 * Receber do usuário os valores do preço do serviço, dos gastos mensais 
 * e das porcentagens que cada um dos 3 sócios da empresa têm direito para
 * fornecer o extrato do serviço, o qual mostra o valor poupado para 
 * reinvestimento na empresa, valor dos gastos mensais e os recebimentos
 * de cada um dos 3 sócios em reais.
 * 
 * Funcionamento:
 * Dados fornecidos pela empresa: A metade do valor do serviço menos os 
 * custos mensais equivale ao valor poupado para reinvestimento na empresa.
 * Os recebimentos dos sócios são calculados multiplicando cada porcentagem
 * (valor entre 0 e 1) pela metade do valor do serviço, pois essa metade
 * é o dinheiro destinado aos três. Todos os dados são calculados pelo
 * programa e mostrados no extrato do serviço.
 */

public class desafio0403 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double vs, cp, pct1, pct2, pct3;
		
		System.out.println("Por favor, digite o valor do serviço:");
		vs = s.nextDouble();
		
		System.out.println("Por favor, digite o valor dos gastos mensais:");
		cp = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o sócio 1 tem direito:");
		pct1 = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o sócio 2 tem direito:");
		pct2 = s.nextDouble();
		
		System.out.println("Digite a porcentagem que o sócio 3 tem direito:");
		pct3 = s.nextDouble();
		
		double vpr = vs / 2 - cp;
		double v1 = pct1 / 100 * vs / 2;
		double v2 = pct2 / 100 * vs / 2;
		double v3 = pct3 / 100 * vs / 2;
		
		if (pct1 + pct2 + pct3 == 100) {
			System.out.println("xxxxxxxxEXTRATO DO SERVIÇOxxxxxxxxxx");
			System.out.println("Valor poupado para reinvestimento: " + vpr + " reais");
			System.out.println("Valor dos gastos mensais: " + cp + " reais");
			System.out.println("Recebimentos do sócio 1: " + v1 + " reais");
			System.out.println("Recebimentos do sócio 2: " + v2 + " reais");
			System.out.println("Recebimentos do sócio 3: " + v3 + " reais");
		} else {
			System.out.println("Erro: A soma dos percentuais de lucro dados aos sócios está diferente de 100%");
		}
		
		s.close();
	}

}
