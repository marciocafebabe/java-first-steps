package pacote;
import java.util.Scanner;

public class Retorne1 {

	public static boolean saida(String sigla) {
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		for (int i = 0; i < estados.length; i++) {
			if (sigla.equalsIgnoreCase(estados[i])) {
				return true;
			} 
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String estado;
		System.out.println("Digite a sigla de um estado brasileiro:");
		estado = leitor.next();
		
		if(saida(estado) == true) {
			System.out.println("Seu estado existe.");
		
		} else {
			System.out.println("Seu estado não existe.");
		}
		leitor.close();
	}

}
