/*
 Samuel Brando Oldra
 Programa��o III
 Faculdade de Inform�tica
*/

public class Magico{
	
	// vari�veis.
	private int iSize;			// tamanho matriz.
	private int oQuadro[][];	// matriz.
		
	// construtor da classe Magico.
	public Magico(int iSize){
		
		int x, y; // coordenadas iniciais.
		this.iSize = iSize;
		oQuadro = new int[this.iSize][this.iSize];
		
		// OBS.: ponto de partida meio da �ltima linha.
		x = this.iSize / 2; // coluna inicial.
		y = this.iSize - 1; // linha inicial.
				
		gerarMatriz(x, y);
		mostrarMatriz();
	}
	
	// m�todo que cria o quadrado m�gico.
	private void gerarMatriz(int iX, int iY){
				
		// vari�veis.
		int iCont = 0;	// controla a execu��o do la�o;
		int x = 0;		// controla a posi��o horizontal(coluna).
		int y = 1;		// controla a posi��o vertical(linha).
		
		// OBS.: baixo + direita; ocupada cima ponto partida.
		while(iCont < (iSize * iSize)){
			
			if(oQuadro[x][y] == 0){
				
				oQuadro[x][y] = iCont + 1;
				
				if((x + 1) < iSize){ 		// testa se � a �ltima coluna.
					x = x + 1;				// vai uma coluna para direita.
				}
				else{
					x = 0;					// vai para a primeira coluna.
				}
				
				if((y + 1) < iSize){ 		// testa se � a �ltima linha.
					y = y + 1;				// vai uma linha para baixo.
				}
				else{
					y = 0;					// vai para a primeira da linha.
				}				
			}
			else{
				if(x == 0){ 				// testa se � a primeira coluna.
					x = iSize - 1;			// vai para a �ltima da linha.
				}
				else{
					x = x - 1;				// vai uma coluna para esquerda.
				}
				
				if(y <= 1){ 				// testa se � a segunda linha.
					if(y == 0){
						y = iSize - 2;		// vai para a pen�ltima da linha.
					}
					else{
						y = iSize - 1; 		// vai para a �ltima da linha.
					}
				}
				else{
					y = y - 2;				// vai duas coluna para esquerda.
				}
				
				oQuadro[x][y] = iCont + 1;
				
				if((x + 1) < iSize){ 		// testa se � a �ltima coluna.
					x = x + 1;				// vai uma coluna para direita.
				}
				else{
					x = 0;					// vai para a primeira coluna.
				}
				
				if((y + 1) < iSize){ 		// testa se � a �ltima linha.
					y = y + 1;				// vai uma linha para baixo.
				}
				else{
					y = 0;					// vai para a primeira da linha.
				}
			}
			
			iCont++;						// incrementa o contador;
		}
	}
	
	// m�todo que mostra o quadrado m�gico.
	private void mostrarMatriz(){
		
		// vari�veis.
		int iContX = 0;		// controla a posi��o horizontal(coluna).
		int iContY = 0;		// controla a posi��o vertical(linha).
		
		for(iContY = 0; iContY < this.iSize; iContY++){
			for(iContX = 0; iContX < this.iSize; iContX++){
				if(iContX < iSize - 1){
					System.out.print(oQuadro[iContX][iContY] + "\t");
				}
				else{
					System.out.println(oQuadro[iContX][iContY] + "\t");
				}
			}			
		}
	}
}