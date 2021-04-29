package pacote;

import java.util.Scanner;

public class Lista1Ex3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int thanos = 0; //66
		int galactus = 0; //88
		int surfista = 0; //99
		int invalidos = 0;
		
		int x = 0;
		
		while (x != -1234) {
			System.out.println("Digite o número do candidato votado.");
			System.out.println("Para acabar a votação, digite '-1234'.");
			x = s.nextInt();
			
			if (x == 66) {
				thanos++;
			
			} else if (x == 88) {
				galactus++;
			
			} else if (x == 99) {
				surfista++;
			
			} else {
				invalidos++;
				
			}
			
		}
		
		if (thanos > galactus && thanos > surfista) {
			System.out.println("Thanos venceu a votação.");
		
		} else if (galactus > thanos && surfista < galactus) {
			System.out.println("Thanos venceu a votação.");
		
		} else if (surfista > thanos && galactus < surfista) {
			System.out.println("Surfista venceu a votação.");
		
		} else {
			System.out.println("Houve empate.");
		
		}
		
		invalidos = invalidos - 1;
		
		System.out.println("Thanos recebeu " + thanos + " votos.");
		System.out.println("Galactus recebeu " + galactus + " votos.");
		System.out.println("Surfista Prateado recebeu " + surfista + " votos.");
		System.out.println("\nHouve um total de " + invalidos + " votos inválidos.");
		
		s.close();
	}

}
