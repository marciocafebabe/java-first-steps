package pacote;

import java.util.Scanner;

public class teams1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome.");
		String nome = s.next();
		
		System.out.println("Digite seu �ltimo nome.");
		String sobrenome = s.next();
		
		String nome_completo = nome + " " + sobrenome;
		
		System.out.println("Ol�, " + nome_completo + ".");
		s.close();
	}

}
