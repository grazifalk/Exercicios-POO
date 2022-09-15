package br.com.poo.sistemabancario.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}
	
	@Override
	public void depositar(double valor) {
	}
	
	@Override
	public void transferir(Conta destino, double valor) {
	}
	
	//calculo da previsao de rendimento mediante um valor qualquer
	public void previsaoDeRendimento(double valor, int dias) {
		double valorRendimento = (valor * 0.2) * dias;
		System.out.printf("\nO rendimento estimado daqui a " + dias + " dias será de: R$%.2f " + valor); //???
		System.out.printf("\nO valor total será de: R$%.2f " + valor);
	}
	
}
