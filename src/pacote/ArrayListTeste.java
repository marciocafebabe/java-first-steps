package pacote;

import java.util.ArrayList;

public class ArrayListTeste {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Branco");
		l.add("Vermelho");
		l.add(0,"Azul");
		l.add("Amarelo");
		l.add("Verde");
		
		l.remove("Vermelho");
		
		//Mostrar elementos da lista em formato String.		
		System.out.println(l.toString());
		
		//Mostrar qnt. de elementos na lista
		System.out.println(l.size());
		
		//Indicar a String associada ao indice 2 da lista.
		System.out.println(l.get(2));
		
		//Indicar o indice da String "Azul" do ArrayList.
		System.out.println(l.indexOf("Branco"));
		
		//Pergunta se a String especifica esta contida ou nao na lista (resposta em boolean).
		System.out.println(l.contains("Amarelo"));
		System.out.println(l.contains("Roxo"));	
	}
}