package pacote;

import java.util.Scanner;

public class FiapLoop {

	public static void main(String[] args) {
		int x = 0;
		Scanner s = new Scanner(System.in);
		
		while(x != 4) {
			System.out.println();
			System.out.println("1 - Tipo do triângulo");
			System.out.println("2 - Existência do triângulo");
			System.out.println("3 - Área do triângulo");
			System.out.println("4 - Sair");
			x = s.nextInt();
		
			switch(x) {
			
			case 1:
			
				System.out.println("Digite o primeiro lado do triângulo (sem unidade):");
				int lado1 = s.nextInt();
				
				System.out.println("Digite segundo lado do triângulo:");
				int lado2 = s.nextInt();
				
				System.out.println("Digite o terceiro lado do triângulo:");
				int lado3 = s.nextInt();
				
				if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
					System.out.println();
					System.out.println("O triângulo é escaleno.");
					System.out.println();
				
				} else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado1 != lado3) {
					System.out.println();
					System.out.println("O triângulo é isósceles.");
					System.out.println();
				} else if (lado1 == lado2 && lado1 == lado3) {
					System.out.println();
					System.out.println("O triângulo é equilátero.");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Os dados inseridos não foram válidos.");
					System.out.println();
				}
				break;
			
			case 2:
				System.out.println("Digite o primeiro lado do triângulo (sem unidade):");
				int a = s.nextInt();
				
				System.out.println("Digite segundo lado do triângulo:");
				int b = s.nextInt();
				
				System.out.println("Digite o terceiro lado do triângulo:");
				int c = s.nextInt();
				
				if (a < b + c && b < a + c && c < a + b) {
					System.out.println();
					System.out.println("O triângulo existe.");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("O triângulo não existe.");
					System.out.println();
				}
				
				break;
			
			case 3:
				int base, altura, area;
				
				System.out.println("Digite o comprimento da base do triângulo \n(Não coloque unidade, já está em centímetros):");
				base = s.nextInt();
				
				System.out.println("Digite o tamanho da altura do triângulo:");
				altura = s.nextInt();
				
				area = base * altura / 2;
				
				System.out.println();
				System.out.println("O triângulo tem uma área de " + area + " centímetros quadrados.");
				System.out.println();
				
				break;
			
			case 4:
				System.out.println("Você saiu.");
				break;
			
			}
		
		}
	s.close();
	}

}
