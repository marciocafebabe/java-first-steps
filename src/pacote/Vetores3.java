package pacote;

import java.util.Scanner;

public class Vetores3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String [] atividades = new String[30];
		int x = 1;
		while (x < 31) {
			System.out.println("Escreva a atividade " + x + ": ");
			atividades[x - 1] = leitor.next();
			x++;
		}
		x = 0;
		System.out.println("Você quer a ordem das atividades seja a 'mesma' ou 'inversa'?");
		
		
		while (x == 0) {
			String r = leitor.next();
		if (r.equals("mesma")) {
			x = 1;
			while (x < 31) {
				System.out.println("Atividade " + x + ": " + atividades[x - 1]);
				x++;
			}
			x = 1;
		} else if (r.equals("inversa")) {
			x = 1;
			while (x > 0) {
				System.out.println("Atividade " + x + ": " + atividades[x - 1]);
				x++;
			}
			x = 1;
		} else {
			x = 0;
			System.out.println("Por favor, escreva 'mesma' ou 'inversa', sem Caps Lock:");
		}
	}
		leitor.close();
	}

}
