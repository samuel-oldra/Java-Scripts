public class Calculadora{
	public static void main(String vsArgs[]){
		
		System.out.println("Iniciando programa...");
		
		// cria a interface gr�fica.
		WinCalculadora oCalculadora = new WinCalculadora();
		
		System.out.println("Mostrando a janela...");
		
		// adiciona objeto respons�vel por tratar eventos da janela.
		oCalculadora.addWindowListener(new TtdCalculadora());
		
		oCalculadora.show();
	}
}