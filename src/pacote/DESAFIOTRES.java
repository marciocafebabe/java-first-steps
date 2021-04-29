package pacote;

public class DESAFIOTRES {

	public static void main(String[] args) {
		
		int valor1 = 0;
		int valor2 = 1;
		int proximo = 0;
		
		System.out.print(valor1 + " ");
		System.out.print(valor2 + " ");
		
		while (proximo < 50) {
			
			proximo = valor1 + valor2;
			valor1 = valor2;
			valor2 = proximo;
			System.out.print(proximo + " ");
		}
		
	}

}