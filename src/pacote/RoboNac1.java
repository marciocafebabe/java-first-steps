package pacote;

import java.util.Scanner;

public class RoboNac1 {

	public static void main(String[] args) {
		
		/*
		 *  Nome da Equipe: Conquer Squad
		 * 
		 *  Nome e RM dos alunos:
		 * 
		 *  - Márcio de Souza Cintra Filho
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
		 *  Observações:
		 *  
		 *  - Foi considerado que o robô ocupa uma área de 10 centímetros quadrados, ou seja, um quadrado do mapa.
		 *  - Foi considerado que o robô precisa localizar-se exatamente no centro do quadrado do objetivo após todos os comandos para haver sucesso.
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
				
			System.out.println("Digite a diferença de potencial (voltagem) usada no robô: ");
			double ddp = s.nextInt();
				
			System.out.println("O percurso do robô começa aqui!");
			
			System.out.println(); 
			
			System.out.println("Escreva a direção que o robô andará primeiro:\nDireções possíveis: 'Frente', 'Tras', 'Esquerda', 'Direita'.");
			String dir1 = s.next();
			
			// Se a direção do primeiro comando for "Frente", o programa continua sem alterar nada. Senão, a variável "ResCom1" (resultado do comando 1),
			// passa a armazenar o valor "2".
			if (dir1.toUpperCase().equals("FRENTE")) {
				
			} else {
				ResCom1 = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist1 = s.nextInt();
			
			// O robô precisa andar entre 60 e 80 centímetros para haver sucesso no comando. Senão, a variável "ResCom2" (resultado do comando 2),
			// passa a armazenar o valor "2".
			if (dist1 >= 60 && dist1 <= 80) {
				
			} else {
				ResCom2 = 2;
				}
			
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir2 = s.next();
			
			// Se a direção do segundo comando for "Direita", o programa continua sem alterar nada. Senão, a variável "ResCom3" (resultado do comando 3),
			// passa a armazenar o valor "2".			
			if (dir2.toUpperCase().equals("DIREITA")) {
				
			} else {
				ResCom3 = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist2 = s.nextInt();
			
			// O robô precisa andar entre 60 e 80 centímetros para haver sucesso no comando. Senão, a variável "ResCom4" (resultado do comando 4),
			// passa a armazenar o valor "2".
			if (dist2 >= 60 && dist2 <= 80) {
				
			} else {
				ResCom4 = 2;
				}
			
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir3 = s.next();
			
			// Se a direção do terceiro comando for "Frente", o programa continua sem alterar nada. Senão, a variável "ResCom5" (resultado do comando 5),
			// passa a armazenar o valor "2".			
			if (dir3.toUpperCase().equals("FRENTE")) {
							
			} else {
				ResCom5 = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist3 = s.nextInt();
			
			int x = dist1 + dist3; 
			
			// O robô precisa ter andado de 130 a 150 centímetros ao Norte até agora para haver sucesso nesse comando. Senão, a variável "ResCom6" 
			// (resultado do comando 6), passa a armazenar o valor "2".
			if (x >= 130 && x <= 150) {
				
			} else {
				ResCom6 = 2;
				}
			
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir4 = s.next();
			
			// Se a direção do quarto comando for "Direita", o programa continua sem alterar nada. Senão, a variável "ResCom7" (resultado do comando 7),
			// passa a armazenar o valor "2".
			if (dir4.toUpperCase().equals("DIREITA")) {
							
			} else {
				ResCom7 = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist4 = s.nextInt();
						
			int y = dist2 + dist4;
			
			// O robô precisa ter andado exatamente 160 centímetros ao Leste até agora para haver sucesso nesse comando. Senão, a variável "ResCom8" 
			// (resultado do comando 8), passa a armazenar o valor "2".
			if (y == 160) {
				
			} else {
				ResCom8 = 2;
				}
			
			System.out.println("Escreva a próxima direção que o robô andará: ");
			String dir5 = s.next();
			
			// Se a direção do quarto comando for "Tras", o programa continua sem alterar nada. Senão, a variável "ResCom9" (resultado do comando 9),
			// passa a armazenar o valor "2".			
			if (dir5.toUpperCase().equals("TRAS")) {
				
			} else {
				ResCom9 = 2;
				}
			
			System.out.println("Digite a distância que o robô andará: \n(Número inteiro)");
			int dist5 = s.nextInt();
						
			int z = dist1 + dist3 - dist5;
			
			// A distância andada para frente até agora pelo robô subtraída pela distância andada pra trás no décimo comando precisa dar 0 para haver
			// sucesso nesse comando. Senão, a variável "ResCom10" (resultado do comando 10), passa a armazenar o valor "2".
			if (z == 0) {
				
			} else {
				ResCom10 = 2;
				}
			
			// Se a voltagem informada pelo usuário for abaixo de 10 V, é informado que o robô não tem voltagem suficiente
			// para chegar ao final do percurso e o programa acaba com uma mensagem de fracasso. Senão, o programa continua.
			if (ddp >= 10) {
				System.out.println("\nO robô tinha voltagem suficiente para começar.");
				
				// Se o robô não direcionou-se corretamente no primeiro comando, é exibida uma mensagem de fracasso no primeiro
				// comando e o programa para. Senão, o programa mostra uma mensagem de sucesso no primeiro comando e ele continua.
				if (ResCom1 == 1) {
					System.out.println("\nPrimeiro Comando: O robô se direcionou corretamente.");
					
					// Se o robô andou uma distância aceitável no segundo comando, o programa mostra uma mensagem de sucesso no 
					// segundo comando e ele continua. Senão, é exibida uma mensagem de fracasso no segundo comando e o programa para.
					if (ResCom2 == 1) {
						System.out.println("\nSegundo Comando: O robô percorreu uma distância aceitável.");
						
						// Se o robô não direcionou-se corretamente no terceiro comando, é exibida uma mensagem de fracasso no terceiro
						// comando e o programa para. Senão, o programa mostra uma mensagem de sucesso no terceiro comando e ele continua.
						if (ResCom3 == 1) {
							System.out.println("\nTerceiro Comando: O robô se direcionou corretamente.");
							
							// Se o robô andou uma distância aceitável no quarto comando, o programa mostra uma mensagem de sucesso no 
							// quarto comando e ele continua. Senão, é exibida uma mensagem de fracasso no quarto comando e o programa para.
							if (ResCom4 == 1) {
								System.out.println("\nQuarto Comando: O robô percorreu uma distância aceitável.");

								// Se o robô não direcionou-se corretamente no quinto comando, é exibida uma mensagem de fracasso no quinto
								// comando e o programa para. Senão, o programa mostra uma mensagem de sucesso no quinto comando e ele continua.
								if (ResCom5 == 1) {
									System.out.println("\nQuinto Comando: O robô se direcionou corretamente.");
									
									// Se o robô andou uma distância aceitável no sexto comando, o programa mostra uma mensagem de sucesso no 
									// sexto comando e ele continua. Senão, é exibida uma mensagem de fracasso no sexto comando e o programa para.
									if (ResCom6 == 1) {
										System.out.println("\nSexto Comando: O robô percorreu uma distância aceitável.");

										// Se o robô não direcionou-se corretamente no sétimo comando, é exibida uma mensagem de fracasso no sétimo
										// comando e o programa para. Senão, o programa mostra uma mensagem de sucesso no sétimo comando e ele continua.
										if (ResCom7 == 1) {
											System.out.println("\nSétimo Comando: O robô se direcionou corretamente.");
											
											// Se o robô andou uma distância aceitável no oitavo comando, o programa mostra uma mensagem de sucesso no 
											// oitavo comando e ele continua. Senão, é exibida uma mensagem de fracasso no oitavo comando e o programa para.
											if (ResCom8 == 1) {
												System.out.println("\nOitavo Comando: O robô percorreu uma distância aceitável.");

												// Se o robô não direcionou-se corretamente no nono comando, é exibida uma mensagem de fracasso no nono
												// comando e o programa para. Senão, o programa mostra uma mensagem de sucesso no nono comando e ele continua.
												if (ResCom9 == 1) {
													System.out.println("\nNono Comando: O robô se direcionou corretamente.");
													
													// Se o robô andou uma distância aceitável no décimo comando, o programa mostra uma mensagem de sucesso no 
													// décimo comando e ele continua. Senão, é exibida uma mensagem de fracasso no décimo comando e o programa para.
													if (ResCom10 == 1) {
														System.out.println("\nDécimo Comando: O robô percorreu uma distância aceitável.");
														System.out.println("\n\nParabéns! O robô chegou ao final do percurso!");
													
													} else {
														System.out.println("\nDécimo Comando: O robô não percorreu uma distância aceitável.");
														System.out.println("Fracasso...");
													}
													
												} else {
													System.out.println("\nNono Comando: O robô não se direcionou corretamente.");
													System.out.println("Fracasso...");
												}
												
											} else {
												System.out.println("\nOitavo Comando: O robô não percorreu uma distância aceitável.");
												System.out.println("Fracasso...");
											}
											
										} else {
											System.out.println("\nQuinto Comando: O robô não se direcionou corretamente.");
											System.out.println("Fracasso...");
										}
										
									} else {
										System.out.println("\nSexto Comando: O robô não percorreu uma distância aceitável.");
										System.out.println("Fracasso...");
									}
								
								} else {
									System.out.println("\nQuinto Comando: O robô não se direcionou corretamente.");
									System.out.println("Fracasso...");
								}
								
							} else {
								System.out.println("\nQuarto Comando: O robô não percorreu uma distância aceitável.");
								System.out.println("Fracasso...");
							}
						
						} else {
							System.out.println("\nTerceiro Comando: O robô não se direcionou corretamente.");
							System.out.println("Fracasso...");
						}
					
					} else {
						System.out.println("\nSegundo Comando: O robô não percorreu uma distância aceitável.");
						System.out.println("Fracasso...");
					}
				
				} else {
					System.out.println("\nPrimeiro Comando: O robô não se direcionou corretamente.");
					System.out.println("Fracasso...");
				}
				
			} else {
				System.out.println("\nO robô não tinha a voltagem necessária para concluir o percurso.");
				System.out.println("Fracasso...");
			}
					
		s.close();
	}
		
}