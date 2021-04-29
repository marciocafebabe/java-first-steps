package pacote;
import java.util.Scanner;

public class V1 {

	public static String vale;
	
	public static void cupom() {
		if (vale.equalsIgnoreCase("VALE10")) {
			System.out.println("10% de desconto");
			System.out.println("Total: 9 reais");
		} else {
			System.out.println("Cupom inválido");
			System.out.println("Total: 10 reais");
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Subtotal: 10 reais");
		System.out.println("Cupom de desconto:");
		vale = leitor.next();
		leitor.close();
		cupom();
	}

}
