import javax.swing.JOptionPane;

public class Adicao{
	public static void main(String args[]){
		String primNum, seguNum; // armazenam as strings dos dois numeros
		int num1, num2, soma;	// armazenam os n�meros convertidos e a soma
		
		primNum = JOptionPane.showInputDialog(null,"Entre com primeiro inteiro: ",
		"Primeiro n�mero",JOptionPane.QUESTION_MESSAGE);
		seguNum = JOptionPane.showInputDialog(null,"Entre com segundo inteiro: ",
		"Segundo n�mero",JOptionPane.QUESTION_MESSAGE);
		// l� os n�meros do usu�rio como STRING
		
		num1 = Integer.parseInt(primNum);
		num2 = Integer.parseInt(seguNum);
		// converte as STRINGS lidas para o tipo INTEIRO
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"A soma �: " + soma, "Resultado",
		JOptionPane.PLAIN_MESSAGE); // mostra o resultado
		/*
		 * null = centraliza a caixa de di�logo
		 * "Resultado" = t�tulo da aplica��o
		 * PLAINLMESSAGE = �cone da caixa de di�logo
		 */
		
		System.exit(0);
		// fecha a aplica��o.
	}
	// fim main
}