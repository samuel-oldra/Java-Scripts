package Contas;

// import files
import Contas.ContaBanco;

// classe ContaComum que herda atributos e m�todos do pai
public class ContaComum extends ContaBanco{
	
	// m�todo construtor com saldo inicial
	public ContaComum(String sNumConta, String sNomeConta, double dSaldoConta){
		super(sNumConta, sNomeConta, dSaldoConta); // usa m�todo construtor do pai
	}
	
	// m�todo construtor sem saldo inicial
	public ContaComum(String sNumConta, String sNomeConta){
		super(sNumConta, sNomeConta); // usa m�todo construtor do pai
	}
}