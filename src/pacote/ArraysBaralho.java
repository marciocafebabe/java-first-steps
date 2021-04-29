package pacote;

import java.util.Random;

public class ArraysBaralho {

	public static void main(String[] args) {
		
		String[] faces = 
		{"Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		
		String[] nipes =
		{" de Espadas"," de Paus"," de Copas"," de Ouros"};
		
		Random r = new Random();
		
		int indiceFace = r.nextInt(faces.length);
		
		int indiceNipe = r.nextInt(nipes.length);
		
		System.out.println(faces[indiceFace] + nipes[indiceNipe]);
				
	}

}