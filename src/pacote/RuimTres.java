package pacote;

/*
 * Comentário do programa:
 * 
 * Função:
 * Esse programa mostra no console os números ímpares dentro de um
 * intervalo específico (no caso, de 0 a 20).
 * 
 * Funcionamento:
 * É feito um loop por meio da função "while" para que seja imprimido, a
 * cada loop, um número, no caso, a variável "int x", somado a 1. Ou seja,
 * a cada loop o programa pula um número. O primeiro: 0 + 1. O segundo: 
 * (variável x, a qual era 1 e foi adicionado mais 1 a ela, e agora virou 2.)
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
