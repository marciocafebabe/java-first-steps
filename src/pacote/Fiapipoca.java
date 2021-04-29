package pacote;
import java.util.Scanner;

public class Fiapipoca {

	public static boolean assentoEhValido(int aComprar) {
		int i = 0;	
		boolean validar = false;
		
		while (i < 60) {
			if (aComprar == i + 1) {
				i = 59;
				validar = true;
			} i++;
		}
		
		if (validar) {
			return true;
		
		} else {
			return false;
		}
	}
	
	public static boolean autorizaCompra(int comprado, int aComprar) {
		if     ( aComprar == comprado      || 
	             aComprar == comprado -  1 ||
	             aComprar == comprado +  1 ||
	             aComprar == comprado +  9 ||
	             aComprar == comprado + 10 ||
	             aComprar == comprado + 11 ||
	             aComprar == comprado -  9 ||
	             aComprar == comprado - 10 ||
	             aComprar == comprado - 11) {
			
			if (comprado % 10 == 1 && (aComprar == comprado + 9 || aComprar == comprado - 1 || aComprar == comprado - 11)) {
				return true;
			
			} else if (comprado % 10 == 0 && (aComprar == comprado - 9 || aComprar == comprado + 1 || aComprar == comprado + 11)) {
				return true;
			
			} else {
				return false;
			}
		
		} else {
			return true;
		}
	}
	
	public static String quaisVazios(int comprado) {
		String assentos = "";
		
		if (comprado % 10 == 1) {
			
			if (comprado == 1) {
				assentos = "1, 2, 11 e 12";
			
			} else if (comprado == 51) {
				assentos = "41, 42, 51 e 52";
			
			} else {
				assentos = comprado + ", " + 
						(comprado + 1) + ", " + 
						(comprado - 10) + ", " + 
						(comprado + 10) + ", " + 
						(comprado - 9) + " e " + 
						(comprado + 11);
			}
			
		} else if (comprado % 10 == 0) {
			
			if (comprado == 10) {
				assentos = "9, 10, 19 e 20";
			
			} else if (comprado == 60) {
				assentos = "49, 50, 59 e 60";
			
			} else {
				assentos = comprado + ", " + 
						(comprado + 10) + ", " + 
						(comprado - 10) + ", " + 
						(comprado - 1) + ", " + 
						(comprado + 9) + " e " + 
						(comprado - 11);
			}
			
		} else if (comprado < 10 && comprado > 1) {
			assentos = comprado + ", " +
					(comprado - 1) + ", " +
					(comprado + 1) + ", " +
					(comprado + 9) + ", " +
					(comprado + 10) + " e " +
					(comprado + 11);
			
		} else if (comprado > 51 && comprado < 60) {
			assentos = comprado + ", " +
					(comprado - 1) + ", " +
					(comprado + 1) + ", " +
					(comprado - 9) + ", " +
					(comprado - 10) + " e " +
					(comprado - 11);
		
		} else {
			assentos = comprado + ", " + 
					(comprado + 10) + ", " + 
					(comprado - 10) + ", " + 
					(comprado - 1) + ", " + 
					(comprado + 9) + " e " + 
					(comprado - 11) + ", " + 
					(comprado + 1) + ", " + 
					(comprado + 11) + " e " + 
					(comprado - 9);
		}
		
		return "Os assentos " + assentos + " estão bloqueados para compras a partir de agora.";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0;
		int comprado;
		int aComprar;
		
		while (opcao != 4) {
			System.out.println("Fiapipoca");
			System.out.println("1 - O assento existe?");
			System.out.println("2 - Autorização da compra");
			System.out.println("3 - Quais assentos estão bloqueados");
			System.out.println("4 - Sair");
			opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o número de um possível assento:");
				aComprar = leitor.nextInt();
				
				if (assentoEhValido(aComprar)) {
					System.out.println("O assento existe.");
				
				} else {
					System.out.println("O assento não existe.");
				}
			
			} else if (opcao == 2) {
				System.out.println("Qual é o assento que foi comprado?");
				comprado = leitor.nextInt();
				
				System.out.println("Qual é o assento a ser comprado?");
				aComprar = leitor.nextInt();
				
				if (autorizaCompra(comprado, aComprar)) {
					System.out.println("O assento está disponível para reserva.");
				
				} else {
					System.out.println("O assento está não está disponível.");
				}
				
			} else if (opcao == 3) {
				System.out.println("Qual é o assento que foi comprado?");
				comprado = leitor.nextInt();
				
				System.out.println(quaisVazios(comprado));
				
			} else if (opcao == 4) {
				System.out.println("Você saiu.");
				leitor.close();
			
			} else {
				System.out.println("Escolha uma opção correta.\n");
			}
		}
	}

}
