package pacote;
import java.util.ArrayList;
import java.util.Scanner;

public class whileEDoWhile {

	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);

		System.out.println("Liste seus produtos. Ao finalizar, digite `fim`.");	
		
		String produto;
		
		while(!"fim".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	
		s.close();
	}
		
}
