package pacote;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double [] notas = new Double[50];
		double media = 0;
		int x = 1;
		while (x < 51) {
			System.out.println("Digite a nota do aluno " + x + ":");
			notas[x - 1] = leitor.nextDouble();
			if (notas[x - 1] < 6) {
				System.out.println("O aluno " + x + " está de recuperação.\n");
			}
			x++;
		}
		x = 1;
		while (x < 51) {
			media = media + notas[x-1];
			x++;
		}
		media = media / 50;
		
		System.out.println("Média das notas: " + media);
		
		leitor.close();
	}

}
