package pacote;

import java.util.Scanner;

public class Lista1Ex4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float faixa1 = 0;
		float faixa2 = 0;
		float faixa3 = 0;
		float faixa4 = 0;
		float faixa5 = 0;
		
		for(int x = 0; x < 15; x++) {
			System.out.println("Digite a idade da pessoa: ");
			int i = s.nextInt();
				
				if (i <= 15 && i >= 0) {
					faixa1++;
				
				} else if (i >= 16 && i <= 30) {
					faixa2++;
				
				} else if (i >= 31 && i <= 45) {
					faixa3++;
				
				} else if (i >= 46 && i <= 60) {
					faixa4++;
				
				} else if (i >= 61 && i <= 122) {
					faixa5++;
				
				} else {
					System.out.println("Valor digitado inválido.");
					x = x - 1;
				
				}
			
		}
		
		float total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
		
		float pct1 = faixa1 / total * 100;
		float pct2 = faixa2 / total * 100;
		float pct3 = faixa3 / total * 100;
		float pct4 = faixa4 / total * 100;
		float pct5 = faixa5 / total * 100;
		
		System.out.println("\nHá " + faixa1 + " pessoas na faixa etária 1 (" + pct1 + "%).");
		System.out.println("\nHá " + faixa2 + " pessoas na faixa etária 2 (" + pct2 + "%).");
		System.out.println("\nHá " + faixa3 + " pessoas na faixa etária 3 (" + pct3 + "%).");
		System.out.println("\nHá " + faixa4 + " pessoas na faixa etária 4 (" + pct4 + "%).");
		System.out.println("\nHá " + faixa5 + " pessoas na faixa etária 5 (" + pct5 + "%).");
		System.out.println(pct1);
		s.close();
	}

}
