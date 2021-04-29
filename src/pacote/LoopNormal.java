package pacote;

import java.util.Scanner;

public class LoopNormal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome = "1";
		
		while (!(nome.equals("quit"))) {
		
		System.out.println("\nSeu nome: (Escreva `quit` se essa for sua última operação.) ");
		nome = s.next();
		
		if (nome.equals("quit")) {
			System.out.println("Saindo...");
			
		} else {
		
		System.out.println("Escreva seu setor:");
		String setor = s.next();
		
		System.out.println("Escreva o meio de transporte que você usa:");
		String mdt = s.next();
		
		if (mdt.equals("carro")) {
			System.out.println("Qual é o último dígito da placa do carro usado?");
			int digito = s.nextInt();
			
			System.out.println("Olá, " + nome + " do setor " + setor + "." );
			
			if (digito == 0 || digito == 1) {
				System.out.println("Seu rodízio é na segunda.");
			
			} else if (digito == 2 || digito == 3) {
				System.out.println("Seu rodízio é na terca.");
			
			} else if (digito == 4 || digito == 5) {
				System.out.println("Seu rodízio é na quarta.");
			
			} else if (digito == 6 || digito == 7) {
				System.out.println("Seu rodízio é na quinta.");
			
			} else if (digito == 8 || digito == 9) {
				System.out.println("Seu rodízio é na sexta.");
			
			} else {
				System.out.println("Uma valor valido por favor.");
			}
			
			} else if (mdt.equals("ônibus")) {
				System.out.println("Olá, " + nome + " do setor " + setor + ". Você não tem rodízio.");
				}
			}
		}
		s.close();
	}

}
