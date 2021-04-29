package pacote;

import java.util.Scanner;

public class ODelta {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Em uma equação do segundo grau:\nDigite o valor de 'a': ");
		int a = s.nextInt();
		
		System.out.println("Digite o valor de 'b': ");
		int b = s.nextInt();
		
		System.out.println("Digite o valor de 'c': ");
		int c = s.nextInt();
		
		int delta = b * b - 4 * a * c;
		
		if (delta == 0) {
			double x1 = (-b) / 2 * a;
			System.out.println("Um valor para x encontrado: " + x1);
		
		} else if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("Dois valores para x encontrados: " + x1 + " e " + x2);
		
		} else if (delta < 0) {
			System.out.println("Delta menor que zero: Não há valores para x.");
		} else {
			System.out.println("Não foi possível fazer a operação.");
		}
		
		s.close();
	}

}
