package JogoDaVelha;

public class jv {

	 private String [] [] matriz = {{"1", "2", "3"}, 
						   {"4", "5", "6"}, 
						   {"7", "8", "9"}};
	
	public String mostrar() {
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("   "+ matriz[linha][coluna]);
			}
			System.out.println("\n");
		}
		return null;
	}
	
	
	public boolean Valido(String posicao) {
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				if(matriz[linha][coluna].equals(posicao))
					return true;
			}
		}
		return false;
	}
	
	
	public void jogada(String posicao, String jogador) {
		if(posicao.equals("1"))
			matriz[0][0] = jogador;
		else if(posicao.equals("2"))
			matriz[0][1] = jogador;
		else if(posicao.equals("3"))
			matriz[0][2] = jogador;
		else if(posicao.equals("4"))
			matriz[1][0] = jogador;
		else if(posicao.equals("5"))
			matriz[1][1] = jogador;
		else if(posicao.equals("6"))
			matriz[1][2] = jogador;
		else if(posicao.equals("7"))
			matriz[2][0] = jogador;
		else if(posicao.equals("8"))
			matriz[2][1] = jogador;
		else if(posicao.equals("9"))
			matriz[2][2] = jogador;
	}
	
	public String ganhou(int jogadas) {
		String[] pvitorias = new String[8];
		String vencedor = "null";
				if(jogadas == 9) {
					vencedor = "EMPATE";
				}
		pvitorias[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
		pvitorias[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
		pvitorias[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
		
		pvitorias[3] = matriz[0][0] + matriz[1][0] + matriz[1][0];
		pvitorias[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
		pvitorias[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
		
		pvitorias[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
		pvitorias[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];
		
		for(int i=0; i<pvitorias.length; i++) {
			if(pvitorias[i].equals("XXX")) {
				vencedor = "Jogador 1"; 
				}
			else if(pvitorias[i].equals("OOO")) {
				vencedor = "Jogador 2"; 
				}			
	}
		return vencedor;
		
	}
		
}
