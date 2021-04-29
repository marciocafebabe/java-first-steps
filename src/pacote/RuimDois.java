package pacote;

/*
 * Coment�rio do programa:
 * 
 * Fun��o:
 * Receber o valor, dado pelo usu�rio, de um carro novo e calcular e mostrar ao
 * usu�rio o pre�o do mesmo carro, mas de f�brica
 * 
 * Funcionamento: Ao receber o valor do carro novo, o programa multiplica o
 * valor por 27%, que � o pre�o do carro sem contar impostos e distribuidores
 * no Brasil. Ap�s o processo, o pre�o do carro de f�brica � fornecido ao usu�rio.
 */

import java.util.Scanner;

public class RuimDois {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double n, f;
		
		System.out.println("Pre�o do carro novo: ");
		n = s.nextDouble();
		
		f = n * 27/100;
		
		System.out.println("Pre�o do carro de f�brica: " + f + " reais.");
		
		s.close();
	}

}
