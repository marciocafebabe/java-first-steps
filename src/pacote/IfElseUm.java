package pacote;

import java.util.Scanner;

public class IfElseUm {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in); 
		double salario = 0;
		
		System.out.println("Qual � o n�vel do professor? \n(1, 2 ou 3)");
		double nivel = s.nextDouble();
		
		System.out.println("Quantas horas/aula? \n(N�mero inteiro)");
		double aulas = s.nextDouble();
		
		if (nivel == 1) {
			salario = 12 * aulas;
			System.out.println("O sal�rio do prof vale " + salario + " reais." );
		} else {
			if (nivel == 2) {
				salario = 17 * aulas;
				System.out.println("O sal�rio do prof vale " + salario + " reais." );
			
			} else {
				if (nivel == 3) {
					salario = 25 * aulas;
					System.out.println("O sal�rio do prof vale " + salario + " reais." );
				
				} else {
					System.out.println("N�vel de professor n�o existente.");
				}
			
			}
		
		}
		
		s.close();
	}

}
