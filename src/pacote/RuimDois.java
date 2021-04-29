package pacote;

/*
 * Comentário do programa:
 * 
 * Função:
 * Receber o valor, dado pelo usuário, de um carro novo e calcular e mostrar ao
 * usuário o preço do mesmo carro, mas de fábrica
 * 
 * Funcionamento: Ao receber o valor do carro novo, o programa multiplica o
 * valor por 27%, que é o preço do carro sem contar impostos e distribuidores
 * no Brasil. Após o processo, o preço do carro de fábrica é fornecido ao usuário.
 */

import java.util.Scanner;

public class RuimDois {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double n, f;
		
		System.out.println("Preço do carro novo: ");
		n = s.nextDouble();
		
		f = n * 27/100;
		
		System.out.println("Preço do carro de fábrica: " + f + " reais.");
		
		s.close();
	}

}
