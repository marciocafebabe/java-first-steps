package pacote;

import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		
		//*OBS: Os limites do mapa (no caso, até onde o robô poderia ir se o mapa fosse completamente aberto) são
		//delimitados por um retângulo, o qual tem dois de seus vértices localizados em (1, 1) e em (189, 159).
		//Fora do limite é considerado que há paredes.
		
		//OBS 2: Está sendo considerado que o robô ocupa apenas um par ordenado, e ele precisa estar DENTRO do
		//quadrado do destino para haver sucesso no percurso.
		
		//OBS 3: A escolha de direções e a escolha da distância percorrida contam juntas como dois comandos.
		
		Scanner s = new Scanner(System.in);
		//Scanner criado.
		
		int sucesso = 1;
		//Essa variável começa armazenando o valor "1", mas, se o usuário realizar uma ação que impossibilite que o robô chegue
		//chegue ao final, essa variável passa a ser "2" e, se isso ocorrer, no final do programa é exibida a
		//mensagem de fracasso (é como se a variável fosse "contaminada" pelo valor "2").
		
		System.out.println("Digite a diferença de potencial (voltagem) usada no robô: ");
		double ddp = s.nextInt();
		//O programa pergunta a voltagem usada no robô. Se a voltagem for abaixo de 10 V, 
		//é informado que o robô não tem voltagem suficiente para chegar ao final do percurso e o programa acaba.
		//Senão, o programa continua.
		
		if (ddp >= 10 ) {
			
			//
			System.out.println("O percurso começa aqui!\n");
			System.out.println("Coordenadas do ponto de partida do robô: \nPar ordenado (15, 5).");
			//O robô encontra-se no par ordenado citado, pois ele está no centro do quadrado do chão.
			
			System.out.println(); //Pula uma linha.
			
			System.out.println("Escreva a direção que o robô andará:\nDireções possíveis: 'Norte', 'Sul', 'Leste', 'Oeste'.");
			String dir1 = s.next();
			//Como o número de comandos é obrigatoriamente 10, o robô precisa ir ao norte para chegar ao destino sem bater nas paredes
			//com 10 comandos no máximo. Senão, a variável "sucesso" passa a ter o valor "false".
			
			if (dir1.toUpperCase().equals("NORTE")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist1 = s.nextInt();
			//A distância mínima e máxima que o robô pode ir sem bater nas paredes e chegando ao final em 10 comandos são, 
			//respectivamente, 56 e 84. Se o valor informado não estiver entre esses dois valores, a variável "sucesso" passa 
			//a armazenar o valor "false". 
			
			if (dist1 >= 56 && dist1 <= 84) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir2 = s.next();
			//O robô precisa ir ao leste para chegar ao destino sem bater nas paredes com 10 comandos no máximo.
			//Senão, a variável "sucesso" passa a ter o valor "false".
			
			if (dir2.toUpperCase().equals("LESTE")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist2 = s.nextInt();
			//A distância mínima e máxima que o robô pode ir sem bater nas paredes e chegando ao final em 10 comandos são, 
			//respectivamente, 56 e 84. Se o valor informado não estiver entre esses dois valores, a variável "sucesso" passa 
			//a armazenar o valor "false".
			
			if (dist2 >= 56 && dist2 <= 84) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir3 = s.next();
			//O robô precisa ir ao norte para chegar ao destino sem bater nas paredes com 10 comandos no máximo.
			//Senão, a variável "sucesso" passa a ter o valor "false".
			
			if (dir3.toUpperCase().equals("NORTE")) {
							
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist3 = s.nextInt();
			
			int x = dist1 + dist3; 
			//A variável "x", que é a distância percorrida nas duas vezes que o robô foi ao norte (Isso se o usuário
			//digitou os valores corretos para direções até o momento), representa o quanto o robô andou para o
			//norte até agora. Com o valor dessa variável, é possível saber se o robô andou uma quantidade de unidades
			//certa para o norte para chegar ao final sem bater nas paredes. O robô pode ser movimentado para o norte, no total
			//(primeira mais a terceira distância), de 126 a 154 unidades para ter sucesso, senão, a variável "sucesso" 
			//passa a ter o valor "false".
			
			if (x >= 126 && x <= 154) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir4 = s.next();
			//O robô precisa ir ao leste para chegar ao destino sem bater nas paredes com 10 comandos no máximo.
			//Senão, a variável "sucesso" passa a ter o valor "false".				
			
			if (dir4.toUpperCase().equals("LESTE")) {
							
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist4 = s.nextInt();
			//A variável "y", que é a distância percorrida nas duas vezes que o robô foi ao leste (Isso se o usuário
			//digitou os valores corretos para direções até o momento), representa o quanto o robô andou para o
			//leste até agora. Com o valor dessa variável, é possível saber se o robô andou uma quantidade de unidades
			//certa para o leste para chegar ao final sem bater nas paredes. O robô pode ser movimentado para o leste, no total
			//(primeira mais a terceira distância), de 156 a 164 unidades para ter sucesso, senão, a variável "sucesso" 
			//passa a ter o valor "false".
			
			int y = dist2 + dist4;
			
			if (y >= 156 && y <= 164) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir5 = s.next();
			//O robô precisa ir ao sul para chegar ao destino sem bater nas paredes com 10 comandos no máximo.
			//Senão, a variável "sucesso" passa a ter o valor "false".
			
			if (dir5.toUpperCase().equals("SUL")) {
				
			} else {
				sucesso = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist5 = s.nextInt();
			//A variável "z" representa o quanto o robô andou para o norte menos o quanto o robô andou para o sul no último comando.
			//Como o quadrado do robô está na mesma "altura" do quadrado do destino (não é a altura literalmente. É apenas na
			//perspectiva do mapa), o robô precisa voltar para uma "altura" que o quadrado do ponto de partida também tenha.
			//Por exemplo: o ponto de partida é em (15, 5). Se o valor do y (não a variável, mas sim a "ordenada" em um plano cartesiano)
			//não estiver entre 1 e 9, o robô não estará dentro do quadrado e a variável "sucesso" passa a ter o valor "false".
			//Para tanto, fazendo as contas da variável "z", o valor armazenado nela precisa estar entre -4 e 4.
			
			int z = dist1 + dist3 - dist5;
						
			if (z >= -4 && z <= 4) {
				
			} else {
				sucesso = 2;
				}
			
			//Se o robô executar qualquer comando que faça com que ele não chegue ao final e/ou tenha batido em qualquer parede,
			//a variável sucesso, que armazenava o valor "true", foi alterada em algum momento para "false", e a mensagem de fracasso  
			//será exibida. Senão, a mensagem de sucesso será exibida.
			
			if (sucesso == 1) {
				System.out.println("Sucesso! O robô chegou ao final do percurso sem bater na parede!");
			} else {
				System.out.println("Fracasso...");
			}
			
				
		} else {
			System.out.println("O robô não tem a voltagem necessária para chegar ao final.");
		}
		s.close();
	}
		
}
