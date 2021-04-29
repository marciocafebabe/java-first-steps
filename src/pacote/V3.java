package pacote;
import java.util.Scanner;

public class V3 {

	public static String vale;
	
	public static String cupom() {
		if (vale.equalsIgnoreCase("VALE10")) {
			return "10% de desconto\nTotal: 9 reais";
		} else {
			return "Cupom inválido\nTotal: 10 reais";
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Subtotal: 10 reais");
		System.out.println("Cupom de desconto:");
		vale = leitor.next();
		leitor.close();
		System.out.println(cupom());
	}

}
