 /* ::::: DADOS DO PROGRAMADOR :::::
 * Aluno: Samuel Brando Oldra
 * Matr�cula: 10205981
 * Disciplina: Programa��o 3
 * Professor: Alexandre Zamerlam
 * Faculdade: Faculdade de Inform�tica de Taquara
 * Mantenedora: Funda��o Educacional Encosta Inferior do Nordeste
 */
  
import javax.swing.JOptionPane;
 
public class Pares{
	public static void main(String vArgs[]){
		
		// vari�veis
		String sNume = ""; 	// leitura da caixa de di�logo
		int iNume = 0; 		// n�mero informado
		int iSoma = 0; 		// soma dos anteriores
		
		// leitura do n�mero inteiro.
		sNume = JOptionPane.showInputDialog(null,"Informe um n�mero inteiro: ",
        "Solicita��o",JOptionPane.QUESTION_MESSAGE);
                
        if(sNume != null){           
        	// convers�o de String -> int
        	iNume = Integer.parseInt(sNume);
        
        	int iAux = 0;		// auxiliar para soma
        	while(iAux < iNume){
        		if(iAux % 2 == 0){
        			iSoma += iAux;
        		}
        		iAux++;
        	}
        
        	// mostra o resultado
        	JOptionPane.showMessageDialog(null,"A soma �: " + iSoma, "Resultado",
			JOptionPane.INFORMATION_MESSAGE);
		} else{
			// mostra o erro
        	JOptionPane.showMessageDialog(null,"Entrada de dados inv�lida!", "ERRO",
			JOptionPane.ERROR_MESSAGE);	
		}
		
		System.exit(0); 
	}
}