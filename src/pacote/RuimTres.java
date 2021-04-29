package pacote;

/*
 * Coment�rio do programa:
 * 
 * Fun��o:
 * Esse programa mostra no console os n�meros �mpares dentro de um
 * intervalo espec�fico (no caso, de 0 a 20).
 * 
 * Funcionamento:
 * � feito um loop por meio da fun��o "while" para que seja imprimido, a
 * cada loop, um n�mero, no caso, a vari�vel "int x", somado a 1. Ou seja,
 * a cada loop o programa pula um n�mero. O primeiro: 0 + 1. O segundo: 
 * (vari�vel x, a qual era 1 e foi adicionado mais 1 a ela, e agora virou 2.)
 * ->2 + 1, e assim em diante.
 */

public class RuimTres {

	public static void main(String[] args) {
		
		int x = 0;
		while (x < 20) {
			x += 1;
			System.out.print(x+" ");
			x++;
		}
	
	}

}
