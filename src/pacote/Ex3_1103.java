package pacote;

import java.util.Scanner;

public class Ex3_1103 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o horário do dia em horas (Valor inteiro):");
		System.out.println("Exemplo de valores válidos: 3, 10, 17");
		System.out.println("Exemplo de valores não válidos: 3:30, 2:45");
		int horas = s.nextInt();
		
			int minutos = horas * 60;
			
			System.out.println("Minutos passados no dia: " + minutos);
		
		s.close();
	}
}
