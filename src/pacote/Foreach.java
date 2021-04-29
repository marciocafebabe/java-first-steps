package pacote;
import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
		
		int i;
		ArrayList<Integer> lista = new ArrayList<>();
		for(i=0; i<10; i++) {
			lista.add(i);
		}
			for (int numeros : lista) {
				System.out.print(numeros + " ");
			}
			System.out.println(lista.toString());
	}
}
