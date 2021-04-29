package pacote;
import java.util.Scanner;

public class RM86318_PARTE3_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numero = 0;
		int nota_prox = 0;
		int nota_ant = 0;
				
		System.out.println("Digite o número de alunos na sala:");
		int alunos = s.nextInt();
			
		while (alunos > 0) {			
			numero++;
			System.out.println("Nota do aluno " + numero + ":");
			nota_prox = s.nextInt();
			
			nota_prox += nota_ant;
			
			nota_ant = nota_prox;
								
			alunos--;
						
		}
		double media = nota_prox/numero;
		
		System.out.println(media);
		s.close();
	}

}
