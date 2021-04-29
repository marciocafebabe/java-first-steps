package pacote;

import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		
		//*OBS: Os limites do mapa (no caso, at� onde o rob� poderia ir se o mapa fosse completamente aberto) s�o
		//delimitados por um ret�ngulo, o qual tem dois de seus v�rtices localizados em (1, 1) e em (189, 159).
		//Fora do limite � considerado que h� paredes.
		
		//OBS 2: Est� sendo considerado que o rob� ocupa apenas um par ordenado, e ele precisa estar DENTRO do
		//quadrado do destino para haver sucesso no percurso.
		
		//OBS 3: A escolha de dire��es e a escolha da dist�ncia percorrida contam juntas como dois comandos.
		
		Scanner s = new Scanner(System.in);
		//Scanner criado.
		
		int sucesso = 1;
		//Essa vari�vel come�a armazenando o valor "1", mas, se o usu�rio realizar uma a��o que impossibilite que o rob� chegue
		//chegue ao final, essa vari�vel passa a ser "2" e, se isso ocorrer, no final do programa � exibida a
		//mensagem de fracasso (� como se a vari�vel fosse "contaminada" pelo valor "2").
		
		System.out.println("Digite a diferen�a de potencial (voltagem) usada no rob�: ");
		double ddp = s.nextInt();
		//O programa pergunta a voltagem usada no rob�. Se a voltagem for abaixo de 10 V, 
		//� informado que o rob� n�o tem voltagem suficiente para chegar ao final do percurso e o programa acaba.
		//Sen�o, o programa continua.
		
		if (ddp >= 10 ) {
			
			//
			System.out.println("O percurso come�a aqui!\n");
			System.out.println("Coordenadas do ponto de partida do rob�: \nPar ordenado (15, 5).");
			//O rob� encontra-se no par ordenado citado, pois ele est� no centro do quadrado do ch�o.
			
			System.out.println(); //Pula uma linha.
			
			System.out.println("Escreva a dire��o que o rob� andar�:\nDire��es poss�veis: 'Norte', 'Sul', 'Leste', 'Oeste'.");
			String dir1 = s.next();
			//Como o n�mero de comandos � obrigatoriamente 10, o rob� precisa ir ao norte para chegar ao destino sem bater nas paredes
			//com 10 comandos no m�ximo. Sen�o, a vari�vel "sucesso" passa a ter o valor "false".
			
			if (dir1.toUpperCase().equals("NORTE")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist1 = s.nextInt();
			//A dist�ncia m�nima e m�xima que o rob� pode ir sem bater nas paredes e chegando ao final em 10 comandos s�o, 
			//respectivamente, 56 e 84. Se o valor informado n�o estiver entre esses dois valores, a vari�vel "sucesso" passa 
			//a armazenar o valor "false". 
			
			if (dist1 >= 56 && dist1 <= 84) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir2 = s.next();
			//O rob� precisa ir ao leste para chegar ao destino sem bater nas paredes com 10 comandos no m�ximo.
			//Sen�o, a vari�vel "sucesso" passa a ter o valor "false".
			
			if (dir2.toUpperCase().equals("LESTE")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist2 = s.nextInt();
			//A dist�ncia m�nima e m�xima que o rob� pode ir sem bater nas paredes e chegando ao final em 10 comandos s�o, 
			//respectivamente, 56 e 84. Se o valor informado n�o estiver entre esses dois valores, a vari�vel "sucesso" passa 
			//a armazenar o valor "false".
			
			if (dist2 >= 56 && dist2 <= 84) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir3 = s.next();
			//O rob� precisa ir ao norte para chegar ao destino sem bater nas paredes com 10 comandos no m�ximo.
			//Sen�o, a vari�vel "sucesso" passa a ter o valor "false".
			
			if (dir3.toUpperCase().equals("NORTE")) {
							
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist3 = s.nextInt();
			
			int x = dist1 + dist3; 
			//A vari�vel "x", que � a dist�ncia percorrida nas duas vezes que o rob� foi ao norte (Isso se o usu�rio
			//digitou os valores corretos para dire��es at� o momento), representa o quanto o rob� andou para o
			//norte at� agora. Com o valor dessa vari�vel, � poss�vel saber se o rob� andou uma quantidade de unidades
			//certa para o norte para chegar ao final sem bater nas paredes. O rob� pode ser movimentado para o norte, no total
			//(primeira mais a terceira dist�ncia), de 126 a 154 unidades para ter sucesso, sen�o, a vari�vel "sucesso" 
			//passa a ter o valor "false".
			
			if (x >= 126 && x <= 154) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir4 = s.next();
			//O rob� precisa ir ao leste para chegar ao destino sem bater nas paredes com 10 comandos no m�ximo.
			//Sen�o, a vari�vel "sucesso" passa a ter o valor "false".				
			
			if (dir4.toUpperCase().equals("LESTE")) {
							
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist4 = s.nextInt();
			//A vari�vel "y", que � a dist�ncia percorrida nas duas vezes que o rob� foi ao leste (Isso se o usu�rio
			//digitou os valores corretos para dire��es at� o momento), representa o quanto o rob� andou para o
			//leste at� agora. Com o valor dessa vari�vel, � poss�vel saber se o rob� andou uma quantidade de unidades
			//certa para o leste para chegar ao final sem bater nas paredes. O rob� pode ser movimentado para o leste, no total
			//(primeira mais a terceira dist�ncia), de 156 a 164 unidades para ter sucesso, sen�o, a vari�vel "sucesso" 
			//passa a ter o valor "false".
			
			int y = dist2 + dist4;
			
			if (y >= 156 && y <= 164) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir5 = s.next();
			//O rob� precisa ir ao sul para chegar ao destino sem bater nas paredes com 10 comandos no m�ximo.
			//Sen�o, a vari�vel "sucesso" passa a ter o valor "false".
			
			if (dir5.toUpperCase().equals("SUL")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist5 = s.nextInt();
			//A vari�vel "z" representa o quanto o rob� andou para o norte menos o quanto o rob� andou para o sul no �ltimo comando.
			//Como o quadrado do rob� est� na mesma "altura" do quadrado do destino (n�o � a altura literalmente. � apenas na
			//perspectiva do mapa), o rob� precisa voltar para uma "altura" que o quadrado do ponto de partida tamb�m tenha.
			//Por exemplo: o ponto de partida � em (15, 5). Se o valor do y (n�o a vari�vel, mas sim a "ordenada" em um plano cartesiano)
			//n�o estiver entre 1 e 9, o rob� n�o estar� dentro do quadrado e a vari�vel "sucesso" passa a ter o valor "false".
			//Para tanto, fazendo as contas da vari�vel "z", o valor armazenado nela precisa estar entre -4 e 4.
			
			int z = dist1 + dist3 - dist5;
						
			if (z >= -4 && z <= 4) {
				
			} else {
				sucesso = 2;
				}
			
			//Se o rob� executar qualquer comando que fa�a com que ele n�o chegue ao final e/ou tenha batido em qualquer parede,
			//a vari�vel sucesso, que armazenava o valor "true", foi alterada em algum momento para "false", e a mensagem de fracasso  
			//ser� exibida. Sen�o, a mensagem de sucesso ser� exibida.
			
			if (sucesso == 1) {
				System.out.println("Sucesso! O rob� chegou ao final do percurso sem bater na parede!");
			} else {
				System.out.println("Fracasso...");
			}
			
				
		} else {
			System.out.println("O rob� n�o tem a voltagem necess�ria para chegar ao final.");
		}
		s.close();
	}
		
}
