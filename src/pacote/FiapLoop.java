package pacote;

import java.util.Scanner;

public class FiapLoop {

	public static void main(String[] args) {
		int x = 0;
		Scanner s = new Scanner(System.in);
		
		while(x != 4) {
			System.out.println();
			System.out.println("1 - Tipo do tri�ngulo");
			System.out.println("2 - Exist�ncia do tri�ngulo");
			System.out.println("3 - �rea do tri�ngulo");
			System.out.println("4 - Sair");
			x = s.nextInt();
		
			switch(x) {
			
			case 1:
			
				System.out.println("Digite o primeiro lado do tri�ngulo (sem unidade):");
				int lado1 = s.nextInt();
				
				System.out.println("Digite segundo lado do tri�ngulo:");
				int lado2 = s.nextInt();
				
				System.out.println("Digite o terceiro lado do tri�ngulo:");
				int lado3 = s.nextInt();
				
				if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
					System.out.println();
					System.out.println("O tri�ngulo � escaleno.");
					System.out.println();
				
				} else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado1 != lado3) {
					System.out.println();
					System.out.println("O tri�ngulo � is�sceles.");
					System.out.println();
				} else if (lado1 == lado2 && lado1 == lado3) {
					System.out.println();
					System.out.println("O tri�ngulo � equil�tero.");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Os dados inseridos n�o foram v�lidos.");
					System.out.println();
				}
				break;
			
			case 2:
				System.out.println("Digite o primeiro lado do tri�ngulo (sem unidade):");
				int a = s.nextInt();
				
				System.out.println("Digite segundo lado do tri�ngulo:");
				int b = s.nextInt();
				
				System.out.println("Digite o terceiro lado do tri�ngulo:");
				int c = s.nextInt();
				
				if (a < b + c && b < a + c && c < a + b) {
					System.out.println();
					System.out.println("O tri�ngulo existe.");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("O tri�ngulo n�o existe.");
					System.out.println();
				}
				
				break;
			
			case 3:
				int base, altura, area;
				
				System.out.println("Digite o comprimento da base do tri�ngulo \n(N�o coloque unidade, j� est� em cent�metros):");
				base = s.nextInt();
				
				System.out.println("Digite o tamanho da altura do tri�ngulo:");
				altura = s.nextInt();
				
				area = base * altura / 2;
				
				System.out.println();
				System.out.println("O tri�ngulo tem uma �rea de " + area + " cent�metros quadrados.");
				System.out.println();
				
				break;
			
			case 4:
				System.out.println("Voc� saiu.");
				break;
			
			}
		
		}
	s.close();
	}

}
