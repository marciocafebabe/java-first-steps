package pacote;
import java.util.Scanner;

public class RM86318_PARTE3_2 {

	public static void main(String[] args) {
		
		//OBS 1: Foi considerado que o eleitor precisa ter 16 anos completos até o primeiro dia de 2020 para poder votar.
		//OBS 2: Os valores do dia e mês de nascimento não foram armazenados em uma variável específica, pois esses valores não foram utilizados. 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento:");
		int ano = s.nextInt();
		
		System.out.println("Digite o número do mês do seu nascimento:");
		ano = s.nextInt();
		
		System.out.println("Digite o ano do seu nascimento:");
		ano = s.nextInt();
		
		if (ano == 2003 || ano == 2002) {
			System.out.println("Você pode escolhorer se quer votar nesse ano ou não.");
		
		} else if (ano <= 2001) {
			System.out.println("Você é obrigado a votar nesse ano.");
		
		} else {
			System.out.println("Você não tem a idade mínima para poder votar.");
		}
		
		s.close();
	}

}
