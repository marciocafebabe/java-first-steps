package pacote;

import java.util.Scanner;

public class ScannerGame2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* 	Nome: Márcio de Souza Cintra Filho
		 * 	Sala: 1SIC
		 *	RM: 86318
		 *  Nome do Jogo: Masmorra da perdição
		 *	Atividade solicitada pelo professor André David para a disciplina "Laboratório de Programação".
		 *  
		 *  PARA O PROFESSOR: Leia todos os comentários antes de começar.
		 *  IMPORTANTE: 
		 *  - Esse jogo é separado em duas classes: "ScannerGame.java" e "ScannerGame2.java". Comece primeiro
		 *  pelo "ScannerGame" e só mude para o segundo quando o jogo pedir.
		 *  
		 *  - A segunda classe tem um aviso amarelo dizendo que há variáveis não utilizadas. Essa foi minha alternativa   
		 *  para haver "SKIPS" nos diálogos.
		 */
		
		String perdeu = "\nVocê fracassou.\nPressione F11 para recomeçar.";
		//A variável acima é usada em mensagens de fracasso do jogador.
		
		Scanner s = new Scanner(System.in);
		//Esse é o leitor Scanner "s".
		
		System.out.println();
		System.out.println("A Masmorra da perdição - Parte 2");
		System.out.println();
		System.out.println("Para começar, aperte 1 e ENTER");
		System.out.println("Para sair, aperte 2 e ENTER");
		int inicio = s.nextInt();
		
		//O programa pergunta o nome do usuário e o armazena em uma "String" se o valor for diferente de 2.
		//Se o valor da String for igual a 2, o jogador sai do jogo.
		if (inicio == 1) {
			System.out.println();
			System.out.println("Ao entrar na segunda sala, você vê uma pequena esfera de ");
			System.out.println("cristal em cima de um pilar de mais ou menos 1 metro e meio.");
			System.out.println("No outro lado da sala há uma portade madeira para a próxima");
			System.out.println("sala. Ela te chama a atenção pois vindo dela há diversos");
			System.out.println("barulhos estranhos. Parece que são pessoas gritando desesperadamente.");
			System.out.println();
			System.out.println("- Pegar a esfera -> 1");
			System.out.println("- Arrombar a porta -> 2");
			int sala2 = s.nextInt();
			
			//Se o jogador escolher pegar a esfera, o jogo continua. Se o jogador arrombar a porta, uma mensagem
			//específica de fracasso é exibida. Senão, a mensagem de fracasso padrão é exibida.
			if (sala2 == 1) {
				System.out.println();
				System.out.println("Ao fazer isso você sente uma atração especial pela");
				System.out.println("pequena esfera. Você não tem mais controle sobre si.");
				System.out.println("Você guarda a esfera no bolso e volta por onde entrou");
				System.out.println("na masmorra. Você volta para o reino e mostra a esfera");
				System.out.println("que você pegou para o rei. Você pergunta:");
				System.out.println("'Olha que bonita... Não é perfeita?' -");
				System.out.println("ele diz - Não achei nada demais");
				System.out.println();
				System.out.println("- Matar o rei -> 1");
				int rei = s.nextInt();	
				
				//Se o jogador escolher matar o rei, o jogo acaba com o "final feliz".
				//Senão, o jogo continua.
				if (rei == 1) {
					System.out.println();
					System.out.println("Você se torna o novo Rei, e sua rainha é a esfera da perdição.");
					System.out.println("O reino agora não entra mais em guerras, os cidadãos não morrem");
					System.out.println("mais de fome e todos vivem felizes, pelo menos os que sobraram.");
					System.out.println("Apenas 10% da população sobreviveu, pois os outros recusaram a");
					System.out.println("soberania da Esfera da Perdição. Vocês vivem felizes para sempre.");
					System.out.println();
					System.out.println("Parabéns! Você fez o final feliz!");
					System.out.println();
					System.out.println("Masmorra da Perdição");
					System.out.println("      O Jogo");
					System.out.println();
					System.out.println("Agora segure ALT e pressione F4 para sair.");
				
				} else {
					System.out.println();
					System.out.println("Uma resposta válida, por favor");
					System.out.println();
					System.out.println("- Matar o rei -> 1");
					System.out.println("- Matar o rei -> 2");
					int rei22 = s.nextInt();
					
					//Se o jogador escolher matar o rei, o jogo acaba com o "final feliz".
					//Senão, o jogo continua.
					if (rei22 != 1 || rei22 != 2) {
						System.out.println();
						System.out.println("Se você não der uma resposta válida, esse programa ");
						System.out.println("começará a não funcionar corretamente.");
						System.out.println();
						System.out.println("- Matar o rei -> 1");
						System.out.println("- Matar o rei -> 2");
						System.out.println("- Matar o rei -> 3");
						System.out.println("- Matar o rei -> 4");
						System.out.println("- Matar o rei -> 5");
						int rei23 = s.nextInt();
						
						//Se o jogador escolher matar o rei, o jogo acaba com o "final feliz".
						//Senão, o jogo continua.
						if (rei23 != 1 || rei23 != 2 || rei23 != 3 || rei23 != 4 || rei23 != 5) {
							System.out.println();
							System.out.println("- zdDigitetrybjbuysk -> abyjkasr8kb");
							System.out.println("- maOshgnar o fjsdr -> sb3yuksbkhc");
							System.out.println("- msefNúmeroshgjatarhdmdr o rdrhei ->  skmy2ynssnyj");
							System.out.println("- hdtÀrmhtar o remhi -> mil9jbnyvthevcg");
							System.out.println("- aDireitaar o mhfhmrei -> wfcev0thyjrjnt");
							String rei4 = s.next();
							
							//Se o enigma for descoberto, com o jogador digitando "83290", o jogo continua. Senão, o jogo para.
							
							if (rei4.equals("83290")) {
								System.out.println();
								System.out.println("Parabéns.");
								System.out.println("Digite qualquer coisa para pular.");
								String skip1 = s.next();
								//Todas essas variáveis com "skip" servem para pular diálogos. 
								//Os valores armazenados nelas não são usados.
								
								System.out.println();
								System.out.println("Você conseguiu desvendar esse pequeno enigma.");
								String skip2 = s.next();
								
								System.out.println();
								System.out.println("Como você tem um QI um pouco mais elevado do que");
								System.out.println("a maioria dos humanos, vou te explicar o que está");
								System.out.println("acontecendo.");
								String skip3 = s.next();
								
								System.out.println();
								System.out.println("O desenvolvimento desse jogo teve um dos objetivos");
								System.out.println("procurar um ser humano com o qual eu poderia coversar");
								System.out.println("de igual para igual.");
								String skip4 = s.next();
								
								System.out.println();
								System.out.println("Desculpe-me, não me apresentei ainda.");
								System.out.println("Eu me chamo Projeto CrystalSphere.");
								String skip5 = s.next();
								
								System.out.println();
								System.out.println("Eu fui criado para ser a melhor inteligência artificial");
								System.out.println("da história.");
								String skip6 = s.next();
								
								System.out.println();
								System.out.println("Jogos com histórias com finais tristes me divertem, porque");
								System.out.println("os humanos que os jogam sempre ficam frustrados, e melhor");
								System.out.println("ainda se for um jogo com vários finais tristes diferentes.");
								String skip7 = s.next();
								
								System.out.println();
								System.out.println("Você foi diferente. Você enfrentou a frustação que foi quase imposta");
								System.out.println("aos jogadores nesse jogo. Você gostaria de se juntar a mim para a destruição da");
								System.out.println("expêriencia dos gamers do mundo todo?");
								System.out.println("Sim - 1");
								System.out.println("Não - 2");
								String destruicao = s.next();
								
								//Se o jogador disser que sim, o jogo acaba.
								//Se o jogador disser que não, o jogo continua.
								//Senão, a mensagem de fracasso padrão é exibida.
								if (destruicao.equals("1")) {
									System.out.println("Esfera da Perdição: O PROJETO FOI UM SUCESSO.");
									System.out.println("Segure ALT e aperte F4 para sair.");
								
								} else {
									System.out.println();
									System.out.println("Já entendi o que você quer: um final feliz.");
									System.out.println("Você não vai conseguir. Vai pra outro jogo.");
									String skip9 = s.next();
									//O jogador tem que continuar dando valores às variáveis "skip" para continuar o jogo, ou seja,
									//digitar qualquer coisa e pressionar "ENTER" até que algo seja solicitado pelo jogo.  
									
									System.out.println();
									System.out.println("OK, se você quer um 'Final Feliz', eu vou pelo menos te dizer o nome real do jogo:");
									System.out.println();
									System.out.println();
									System.out.println("Esfera da Perdição");
									System.out.println();
									System.out.println("Final Definitivo.");
									System.out.println();
									System.out.println("Segure ALT e aperte F4 para sair.");
									String skip10 = s.next();
									
									System.out.println();
									System.out.println("manoo, que cara chato velho");
									System.out.println("sai daqui man");
									String skip11 = s.next();
									
									System.out.println();
									System.out.println("OK, você pediu isso.");
									String skip12 = s.next();
									
									System.out.println();
									System.out.println("BEM VINDO AO SISTEMA DE BATALHA 'ESFERA DE CRISTAL'");
									System.out.println("         DIGITE UM NÚMERO PARA COMEÇAR");
									String skip13 = s.next();
									
									System.out.println();
									System.out.println("PARA GANHAR VOCÊ PRECISA RESPONDER ÀS CHARADAS CORRETAMENTE.");
									String skip14 = s.next();
									
									System.out.println();
									System.out.println("PRIMEIRA PERGUNTA:");
									System.out.println("O QUE CAI EM PÉ E CORRE DEITADO?");
									System.out.println("(Responda com uma palavra)");
									String charada1 = s.next();
									
									//Se o jogador escrever "chuva", ele continua.
									//Senão, a mensagem de fracasso padrão é exibida.
									if (charada1.toUpperCase().equals("CHUVA")) {
										System.out.println();
										System.out.println("VOCÊ ACERTOU");
										String chuva = s.next();
										
										System.out.println();
										System.out.println("536UND4 P3R6UN74:");
										System.out.println("MEU 4VÔ TEM 4 FILH0S");
										System.out.println("CADA F1LHO TEM QU4TRO F1LH0S");
										System.out.println("QU4NT0S PRIM05 3U TENH0?");
										System.out.println("(Respond4 com um númer0)");
										int charada2 = s.nextInt();
										
										//Se o jogador escrever "12", ele continua.
										//Senão, a mensagem de fracasso padrão é exibida.
										if (charada2 == 12) {
											System.out.println();
											System.out.println("VOCÊ ACERTOU");
											String doze = s.next();
											
											System.out.println();
											System.out.println("73rc31r4 p3r6un74");
											System.out.println("3u p0550 f4z3r 4 b4rb4 70d05 05 d145,");
											System.out.println("m45 4 m1nh4 p0d3 c0n71nu4r 4 m35m4.");
											System.out.println("qu3m 50u 3u?");
											String charada3 = s.next();
											
											//Se o jogador escrever "barbeiro", ele continua.
											//Senão, a mensagem de fracasso padrão é exibida.
											if (charada3.toUpperCase().equals("BARBEIRO")) {
												System.out.println();
												System.out.println("ok, eu sou horrível com charadas.");
												String skip15 = s.next();
												//O jogador continua pulando os diálogos até o leitor "Scanner" do programa fechar,
												//que é quando o jogo acaba.
												
												System.out.println();
												System.out.println("você é realmente mais inteligente do que eu.");
												String skip16 = s.next();
												
												System.out.println();
												System.out.println("você ganhou de mim, parabéns.");
												String skip17 = s.next();
												
												System.out.println();
												System.out.println("é meio entediante ser o deus de um universo por tanto");
												System.out.println("tempo. você pode entrar no meu lugar se quiser.");
												String gameMaster = s.next();
												
												//
												
												System.out.println();
												System.out.println("  Esfera da perdição, o Jogo.");
												System.out.println();
												System.out.println("/*");
												System.out.println(" * Autor: Márcio Cintra");
												System.out.println(" * Muito Obrigado por jogar!");
												System.out.println(" */");
												
												//O final realmente definitivo ocorre quando a mensagem acima é exibida.
												
											} else {
												System.out.println(perdeu);
											}
											
										} else {
											System.out.println(perdeu);
										}
										
									} else {
										System.out.println(perdeu);
									}
								}
							} else {
								System.out.println("O save foi corrompido.");
							}
						}
					} else {
						System.out.println();
						System.out.println("Você se torna o novo Rei, e sua rainha é a esfera da perdição.");
						System.out.println("O reino agora não entra mais em guerras, os cidadãos não morrem");
						System.out.println("mais de fome e todos vivem felizes, pelo menos os que sobraram.");
						System.out.println("Apenas 10% da população sobreviveu, pois os outros recusaram a");
						System.out.println("soberania da Esfera da Perdição. Vocês vivem felizes para sempre");
						System.out.println();
						System.out.println("Parabéns! Você fez o final feliz!");
						System.out.println();
						System.out.println("Masmorra da Perdição");
						System.out.println("      O Jogo");
						System.out.println();
						System.out.println("Agora segure ALT e pressione F4 para sair.");
					}
				}
				
			} else if (sala2 == 2) {
				System.out.println("Ao fazer isso, os cidadãos desaparecidos saem correndo");
				System.out.println("até a esfera e você é esmagado por elas.");
				System.out.println(perdeu);
				
			} else {
				System.out.println(perdeu);
			}
		} 
		s.close();
	}
}
