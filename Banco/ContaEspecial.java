package Contas;

// import files
import Contas.ContaBanco;

// classe ContaComum que herda atributos e m�todos do pai
public class ContaEspecial extends ContaBanco{
	
	// vari�veis
	protected double dLimiteConta;	// armazena o limite da conta
	
	// m�todo construtor com saldo inicial
	public ContaEspecial(String sNumConta, String sNomeConta, double dSaldoConta, double dLimiteConta){
		super(sNumConta, sNomeConta, dSaldoConta); // usa m�todo construtor do pai
		this.dLimiteConta = dLimiteConta;
	}
	
	// m�todo construtor sem saldo inicial
	public ContaEspecial(String sNumConta, String sNomeConta, double dLimiteConta){
		super(sNumConta, sNomeConta); // usa m�todo construtor do pai
		this.dLimiteConta = dLimiteConta;
	}
	
	// pegar saldo da conta
	public double getSaldoConta(){
		return (this.dSaldoConta + this.dLimiteConta);
	}
	
	public double getLimiteConta(){
		return this.dLimiteConta;
	}
	
	// realiza um decremento de saldo
	public void putDebitarConta(double dValor){
		if(dValor > 0){ // testa valor negativo
			if(((this.dSaldoConta + dLimiteConta) - dValor) >= 0){ // testa saldo suficiente
				this.dSaldoConta -= dValor;
				System.out.println("Debito realizado com sucesso!");
			}
			else{
				System.out.println("Saldo Insuficiente!");
			}
		}
		else{
			System.out.println("Valor Invalido!");
		}
	}
}