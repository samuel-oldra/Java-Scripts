import javax.swing.JOptionPane; 

public class Nomes{
	
	public static ClassNomes oString;
	
	public static void main(String vsArgs[]){
		oString = new ClassNomes();
		String sNome = "";		
		
		// l� a String.
		sNome = JOptionPane.showInputDialog(null,"Digite seu nome:",
        "Leitura do nome",JOptionPane.QUESTION_MESSAGE);
        
		sNome = oString.abreviar(sNome);
		
		// imprime a String.
		JOptionPane.showMessageDialog(null,"Abreviado:\n" + sNome, 
		"Resultado opera��o",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}