package pacote;
import java.util.Scanner;

public class RM86318_PARTE3_2 {

	public static void main(String[] args) {
		
		//OBS 1: Foi considerado que o eleitor precisa ter 16 anos completos at� o primeiro dia de 2020 para poder votar.
		//OBS 2: Os valores do dia e m�s de nascimento n�o foram armazenados em uma vari�vel espec�fica, pois esses valores n�o foram utilizados. 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento:");
		int ano = s.nextInt();
		
		System.out.println("Digite o n�mero do m�s do seu nascimento:");
		ano = s.nextInt();
		
		System.out.println("Digite o ano do seu nascimento:");
		ano = s.nextInt();
		
		if (ano == 2003 || ano == 2002) {
			System.out.println("Voc� pode escolhorer se quer votar nesse ano ou n�o.");
		
		} else if (ano <= 2001) {
			System.out.println("Voc� � obrigado a votar nesse ano.");
		
		} else {
			System.out.println("Voc� n�o tem a idade m�nima para poder votar.");
		}
		
		s.close();
	}

}
