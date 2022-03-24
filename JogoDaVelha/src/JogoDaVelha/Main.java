package JogoDaVelha;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		jv jogo = new jv();
		String posicao1;
		int valida = 0, jogadas = 0;
		
		while(true) {
			System.out.println("JOGO DA VELHA");
			jogo.mostrar();
			
			do{//inicia jogador 1
				
				System.out.println("Jogador 1, informe uma posição: ");
				posicao1 = ler.next();
				while(!jogo.Valido(posicao1)) {
					System.out.println("Jogada invalida, tente novamente");
					System.out.println("Jogador 1, informe uma posição: ");
					posicao1 = ler.next();
					valida = 0;
				}
				jogo.jogada(posicao1, "X");
				valida = 1;
				
			}while(valida == 0);//fim jogador 1
			
			jogadas++;
			valida = 0;
			jogo.mostrar();
			if(!jogo.ganhou(jogadas).equals("null")) {
				break;
			}

			do{//inicia jogador 2
				
				System.out.println("Jogador 2, informe uma posição: ");
				posicao1 = ler.next();
				while(!jogo.Valido(posicao1)) {
					System.out.println("Jogada invalida, tente novamente");
					System.out.println("Jogador 2, informe uma posição: ");
					posicao1 = ler.next();
					valida = 0;
				}
				jogo.jogada(posicao1, "O");
				valida = 1;
				
			}while(valida == 0);//fim jogador 2
			
			jogadas++;
			valida = 0;
			jogo.mostrar();
			if(!jogo.ganhou(jogadas).equals("null")) {
				break;
			}
			
		}//------------------------------
		
		System.out.println("O "+jogo.ganhou(jogadas)+" venceu!");
	}

}
