package pacote;

import java.util.Scanner;

public class ClasseDois {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		float x = 0;
		float y = 0;
		float z = 0;
		
		System.out.println("Insira o tempo de duração de um filme em minutos:");
		float min = s.nextFloat();
		
			if (min >= 60 && min <= 119) {
				x = min / 60;
				z = x + 1 - x;
				y = (min / 60 - 1) * 60;
				
			
			} else if (min >= 120 && min <= 179) {
				x = min / 60;
				z = x + 2 - x;
				y = (min / 60 - 2) * 60;
			
			} else if (min >= 180 && min <= 239) {
				x = min / 60;
				z = x + 3 - x;
				y = (min / 60 - 3) * 60;
			
			} else if (min >= 240 && min <= 299) {
				x = min / 60;
				z = x + 4 - x;
				y = (min / 60 - 4) * 60;
				
			} else if (min < 60) {
				x = 0;
				y = min;
				
			} else {
				System.out.println("Insira dados válidos");
			}
			
		System.out.println("O filme te duração de " + z + " horas e " + y + " minutos.");	
		s.close();
	}
}
