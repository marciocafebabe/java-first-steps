package pacote;

import java.util.Scanner;

public class LoopNormal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome = "1";
		
		while (!(nome.equals("quit"))) {
		
		System.out.println("\nSeu nome: (Escreva `quit` se essa for sua �ltima opera��o.) ");
		nome = s.next();
		
		if (nome.equals("quit")) {
			System.out.println("Saindo...");
			
		} else {
		
		System.out.println("Escreva seu setor:");
		String setor = s.next();
		
		System.out.println("Escreva o meio de transporte que voc� usa:");
		String mdt = s.next();
		
		if (mdt.equals("carro")) {
			System.out.println("Qual � o �ltimo d�gito da placa do carro usado?");
			int digito = s.nextInt();
			
			System.out.println("Ol�, " + nome + " do setor " + setor + "." );
			
			if (digito == 0 || digito == 1) {
				System.out.println("Seu rod�zio � na segunda.");
			
			} else if (digito == 2 || digito == 3) {
				System.out.println("Seu rod�zio � na terca.");
			
			} else if (digito == 4 || digito == 5) {
				System.out.println("Seu rod�zio � na quarta.");
			
			} else if (digito == 6 || digito == 7) {
				System.out.println("Seu rod�zio � na quinta.");
			
			} else if (digito == 8 || digito == 9) {
				System.out.println("Seu rod�zio � na sexta.");
			
			} else {
				System.out.println("Uma valor valido por favor.");
			}
			
			} else if (mdt.equals("�nibus")) {
				System.out.println("Ol�, " + nome + " do setor " + setor + ". Voc� n�o tem rod�zio.");
				}
			}
		}
		s.close();
	}

}
