package pacote;

/*
 * Fibonacci:
 * 
 * Fun��o:
 * Calcular a sequ�ncia de n�meros fibonacci at� 10000. Essa sequ�ncia consiste
 * come�ar com 0, 1 e cada pr�ximo n�mero � a soma dos dois anteriores.
 * Come�o como exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 * 
 * Funcionamento:
 * � um loop feito pela fun��o "while". Considerando x e y como vari�veis de
 * n�mero inteiro, as quais come�am respectivamente como 0 e 1, soma-se x e y,
 * e esse se torna o novo valor de x. Depois � calculado x - y, e esse se torna 
 * o novo valor de y. Ap�s isso, � imprimido no console a vari�vel x. Esse processo
 * se repete at� x ficar com o maior n�mero poss�vel, mas menor que 10000.
 */

public class funcaofor {

	public static void main(String[] args) {
		
		System.out.print(0 + " ");
		int x = 0;
		int y = 1;
		
		while (x < 10000) {
			x += y;
			y = x - y;
			System.out.print(x + " ");
		}
		
	}

}