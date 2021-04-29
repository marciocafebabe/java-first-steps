package pacote;

import java.util.Scanner;

public class marselo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = s.next();
		
		System.out.println(nome + ", seja bem vindo.");
		s.close();
	}
}
