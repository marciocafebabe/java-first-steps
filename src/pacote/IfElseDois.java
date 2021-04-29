package pacote;

import java.util.Scanner;

public class IfElseDois {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		
		System.out.println("Digite o numero do mes");
		int mes = s.nextInt();
		
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("fev");
		}else if (mes == 3) {
			System.out.println("mar");
		}else if (mes == 4) {
			System.out.println("abr");
		}else if (mes == 5) {
			System.out.println("maio");
		}else if (mes == 6) {
			System.out.println("junho");
		}else if (mes == 7) {
			System.out.println("jul");
		}else if (mes == 8) {
			System.out.println("ago");
		}else if (mes == 9) {
			System.out.println("set");
		}else if (mes == 10) {
			System.out.println("out");
		}else if (mes == 11) {
			System.out.println("nov");
		}else if (mes == 12) {
			System.out.println("dez");
		}else {
			System.out.println("Um numero valido pf");
		} 
		
		s.close();
	}

}
