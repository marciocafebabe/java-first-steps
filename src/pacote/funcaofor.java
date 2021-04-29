package pacote;

/*
 * Fibonacci:
 * 
 * Função:
 * Calcular a sequência de números fibonacci até 10000. Essa sequência consiste
 * começar com 0, 1 e cada próximo número é a soma dos dois anteriores.
 * Começo como exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 * 
 * Funcionamento:
 * É um loop feito pela função "while". Considerando x e y como variáveis de
 * número inteiro, as quais começam respectivamente como 0 e 1, soma-se x e y,
 * e esse se torna o novo valor de x. Depois é calculado x - y, e esse se torna 
 * o novo valor de y. Após isso, é imprimido no console a variável x. Esse processo
 * se repete até x ficar com o maior número possível, mas menor que 10000.
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