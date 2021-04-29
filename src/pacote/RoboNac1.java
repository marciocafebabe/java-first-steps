package pacote;

import java.util.Scanner;

public class RoboNac1 {

	public static void main(String[] args) {
		
		/*
		 *  Nome da Equipe: Conquer Squad
		 * 
		 *  Nome e RM dos alunos:
		 * 
		 *  - M�rcio de Souza Cintra Filho
		 *    RM - 86318
		 * 
		 *  - Gabriel Carlos Barruzi de Morais 
		 *    RM - 85366
		 * 
		 *  - Luan Cassanho Araujo
		 *    RM - 86046
		 * 
		 *  - Ideraldo Rui do Carmo Biecco
		 *    RM - 85934
		 * 
		 *  - Lucas Afonso Pido 
		 *    RM - 83736
		 *
		 *  Observa��es:
		 *  
		 *  - Foi considerado que o rob� ocupa uma �rea de 10 cent�metros quadrados, ou seja, um quadrado do mapa.
		 *  - Foi considerado que o rob� precisa localizar-se exatamente no centro do quadrado do objetivo ap�s todos os comandos para haver sucesso.
		 */
		
		Scanner s = new Scanner(System.in);
		
		int ResCom1  = 1;
		int ResCom2  = 1;
		int ResCom3  = 1;
		int ResCom4  = 1;
		int ResCom5  = 1;
		int ResCom6  = 1;
		int ResCom7  = 1;
		int ResCom8  = 1;
		int ResCom9  = 1;
		int ResCom10 = 1;
				
			System.out.println("Digite a diferen�a de potencial (voltagem) usada no rob�: ");
			double ddp = s.nextInt();
				
			System.out.println("O percurso do rob� come�a aqui!");
			
			System.out.println(); 
			
			System.out.println("Escreva a dire��o que o rob� andar� primeiro:\nDire��es poss�veis: 'Frente', 'Tras', 'Esquerda', 'Direita'.");
			String dir1 = s.next();
			
			// Se a dire��o do primeiro comando for "Frente", o programa continua sem alterar nada. Sen�o, a vari�vel "ResCom1" (resultado do comando 1),
			// passa a armazenar o valor "2".
			if (dir1.toUpperCase().equals("FRENTE")) {
				
			} else {
				ResCom1 = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist1 = s.nextInt();
			
			// O rob� precisa andar entre 60 e 80 cent�metros para haver sucesso no comando. Sen�o, a vari�vel "ResCom2" (resultado do comando 2),
			// passa a armazenar o valor "2".
			if (dist1 >= 60 && dist1 <= 80) {
				
			} else {
				ResCom2 = 2;
				}
			
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir2 = s.next();
			
			// Se a dire��o do segundo comando for "Direita", o programa continua sem alterar nada. Sen�o, a vari�vel "ResCom3" (resultado do comando 3),
			// passa a armazenar o valor "2".			
			if (dir2.toUpperCase().equals("DIREITA")) {
				
			} else {
				ResCom3 = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist2 = s.nextInt();
			
			// O rob� precisa andar entre 60 e 80 cent�metros para haver sucesso no comando. Sen�o, a vari�vel "ResCom4" (resultado do comando 4),
			// passa a armazenar o valor "2".
			if (dist2 >= 60 && dist2 <= 80) {
				
			} else {
				ResCom4 = 2;
				}
			
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir3 = s.next();
			
			// Se a dire��o do terceiro comando for "Frente", o programa continua sem alterar nada. Sen�o, a vari�vel "ResCom5" (resultado do comando 5),
			// passa a armazenar o valor "2".			
			if (dir3.toUpperCase().equals("FRENTE")) {
							
			} else {
				ResCom5 = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist3 = s.nextInt();
			
			int x = dist1 + dist3; 
			
			// O rob� precisa ter andado de 130 a 150 cent�metros ao Norte at� agora para haver sucesso nesse comando. Sen�o, a vari�vel "ResCom6" 
			// (resultado do comando 6), passa a armazenar o valor "2".
			if (x >= 130 && x <= 150) {
				
			} else {
				ResCom6 = 2;
				}
			
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir4 = s.next();
			
			// Se a dire��o do quarto comando for "Direita", o programa continua sem alterar nada. Sen�o, a vari�vel "ResCom7" (resultado do comando 7),
			// passa a armazenar o valor "2".
			if (dir4.toUpperCase().equals("DIREITA")) {
							
			} else {
				ResCom7 = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist4 = s.nextInt();
						
			int y = dist2 + dist4;
			
			// O rob� precisa ter andado exatamente 160 cent�metros ao Leste at� agora para haver sucesso nesse comando. Sen�o, a vari�vel "ResCom8" 
			// (resultado do comando 8), passa a armazenar o valor "2".
			if (y == 160) {
				
			} else {
				ResCom8 = 2;
				}
			
			System.out.println("Escreva a pr�xima dire��o que o rob� andar�: ");
			String dir5 = s.next();
			
			// Se a dire��o do quarto comando for "Tras", o programa continua sem alterar nada. Sen�o, a vari�vel "ResCom9" (resultado do comando 9),
			// passa a armazenar o valor "2".			
			if (dir5.toUpperCase().equals("TRAS")) {
				
			} else {
				ResCom9 = 2;
				}
			
			System.out.println("Digite a dist�ncia que o rob� andar�: \n(N�mero inteiro)");
			int dist5 = s.nextInt();
						
			int z = dist1 + dist3 - dist5;
			
			// A dist�ncia andada para frente at� agora pelo rob� subtra�da pela dist�ncia andada pra tr�s no d�cimo comando precisa dar 0 para haver
			// sucesso nesse comando. Sen�o, a vari�vel "ResCom10" (resultado do comando 10), passa a armazenar o valor "2".
			if (z == 0) {
				
			} else {
				ResCom10 = 2;
				}
			
			// Se a voltagem informada pelo usu�rio for abaixo de 10 V, � informado que o rob� n�o tem voltagem suficiente
			// para chegar ao final do percurso e o programa acaba com uma mensagem de fracasso. Sen�o, o programa continua.
			if (ddp >= 10) {
				System.out.println("\nO rob� tinha voltagem suficiente para come�ar.");
				
				// Se o rob� n�o direcionou-se corretamente no primeiro comando, � exibida uma mensagem de fracasso no primeiro
				// comando e o programa para. Sen�o, o programa mostra uma mensagem de sucesso no primeiro comando e ele continua.
				if (ResCom1 == 1) {
					System.out.println("\nPrimeiro Comando: O rob� se direcionou corretamente.");
					
					// Se o rob� andou uma dist�ncia aceit�vel no segundo comando, o programa mostra uma mensagem de sucesso no 
					// segundo comando e ele continua. Sen�o, � exibida uma mensagem de fracasso no segundo comando e o programa para.
					if (ResCom2 == 1) {
						System.out.println("\nSegundo Comando: O rob� percorreu uma dist�ncia aceit�vel.");
						
						// Se o rob� n�o direcionou-se corretamente no terceiro comando, � exibida uma mensagem de fracasso no terceiro
						// comando e o programa para. Sen�o, o programa mostra uma mensagem de sucesso no terceiro comando e ele continua.
						if (ResCom3 == 1) {
							System.out.println("\nTerceiro Comando: O rob� se direcionou corretamente.");
							
							// Se o rob� andou uma dist�ncia aceit�vel no quarto comando, o programa mostra uma mensagem de sucesso no 
							// quarto comando e ele continua. Sen�o, � exibida uma mensagem de fracasso no quarto comando e o programa para.
							if (ResCom4 == 1) {
								System.out.println("\nQuarto Comando: O rob� percorreu uma dist�ncia aceit�vel.");

								// Se o rob� n�o direcionou-se corretamente no quinto comando, � exibida uma mensagem de fracasso no quinto
								// comando e o programa para. Sen�o, o programa mostra uma mensagem de sucesso no quinto comando e ele continua.
								if (ResCom5 == 1) {
									System.out.println("\nQuinto Comando: O rob� se direcionou corretamente.");
									
									// Se o rob� andou uma dist�ncia aceit�vel no sexto comando, o programa mostra uma mensagem de sucesso no 
									// sexto comando e ele continua. Sen�o, � exibida uma mensagem de fracasso no sexto comando e o programa para.
									if (ResCom6 == 1) {
										System.out.println("\nSexto Comando: O rob� percorreu uma dist�ncia aceit�vel.");

										// Se o rob� n�o direcionou-se corretamente no s�timo comando, � exibida uma mensagem de fracasso no s�timo
										// comando e o programa para. Sen�o, o programa mostra uma mensagem de sucesso no s�timo comando e ele continua.
										if (ResCom7 == 1) {
											System.out.println("\nS�timo Comando: O rob� se direcionou corretamente.");
											
											// Se o rob� andou uma dist�ncia aceit�vel no oitavo comando, o programa mostra uma mensagem de sucesso no 
											// oitavo comando e ele continua. Sen�o, � exibida uma mensagem de fracasso no oitavo comando e o programa para.
											if (ResCom8 == 1) {
												System.out.println("\nOitavo Comando: O rob� percorreu uma dist�ncia aceit�vel.");

												// Se o rob� n�o direcionou-se corretamente no nono comando, � exibida uma mensagem de fracasso no nono
												// comando e o programa para. Sen�o, o programa mostra uma mensagem de sucesso no nono comando e ele continua.
												if (ResCom9 == 1) {
													System.out.println("\nNono Comando: O rob� se direcionou corretamente.");
													
													// Se o rob� andou uma dist�ncia aceit�vel no d�cimo comando, o programa mostra uma mensagem de sucesso no 
													// d�cimo comando e ele continua. Sen�o, � exibida uma mensagem de fracasso no d�cimo comando e o programa para.
													if (ResCom10 == 1) {
														System.out.println("\nD�cimo Comando: O rob� percorreu uma dist�ncia aceit�vel.");
														System.out.println("\n\nParab�ns! O rob� chegou ao final do percurso!");
													
													} else {
														System.out.println("\nD�cimo Comando: O rob� n�o percorreu uma dist�ncia aceit�vel.");
														System.out.println("Fracasso...");
													}
													
												} else {
													System.out.println("\nNono Comando: O rob� n�o se direcionou corretamente.");
													System.out.println("Fracasso...");
												}
												
											} else {
												System.out.println("\nOitavo Comando: O rob� n�o percorreu uma dist�ncia aceit�vel.");
												System.out.println("Fracasso...");
											}
											
										} else {
											System.out.println("\nQuinto Comando: O rob� n�o se direcionou corretamente.");
											System.out.println("Fracasso...");
										}
										
									} else {
										System.out.println("\nSexto Comando: O rob� n�o percorreu uma dist�ncia aceit�vel.");
										System.out.println("Fracasso...");
									}
								
								} else {
									System.out.println("\nQuinto Comando: O rob� n�o se direcionou corretamente.");
									System.out.println("Fracasso...");
								}
								
							} else {
								System.out.println("\nQuarto Comando: O rob� n�o percorreu uma dist�ncia aceit�vel.");
								System.out.println("Fracasso...");
							}
						
						} else {
							System.out.println("\nTerceiro Comando: O rob� n�o se direcionou corretamente.");
							System.out.println("Fracasso...");
						}
					
					} else {
						System.out.println("\nSegundo Comando: O rob� n�o percorreu uma dist�ncia aceit�vel.");
						System.out.println("Fracasso...");
					}
				
				} else {
					System.out.println("\nPrimeiro Comando: O rob� n�o se direcionou corretamente.");
					System.out.println("Fracasso...");
				}
				
			} else {
				System.out.println("\nO rob� n�o tinha a voltagem necess�ria para concluir o percurso.");
				System.out.println("Fracasso...");
			}
					
		s.close();
	}
		
}