package pacote;

import java.util.Scanner;

public class Ex3_1103 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o hor�rio do dia em horas (Valor inteiro):");
		System.out.println("Exemplo de valores v�lidos: 3, 10, 17");
		System.out.println("Exemplo de valores n�o v�lidos: 3:30, 2:45");
		int horas = s.nextInt();
		
			int minutos = horas * 60;
			
			System.out.println("Minutos passados no dia: " + minutos);
		
		s.close();
	}
}
