package pacote;

import java.util.Scanner;

public class ifelseS2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua idade (num inteiro):");
		int idade = s.nextInt();
		
		if (idade <= 12) {
			System.out.println("Crianca");
		
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente");
		
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		
		} else {
			System.out.println("Melhor Idade");
		}
		s.close();
	}
}
