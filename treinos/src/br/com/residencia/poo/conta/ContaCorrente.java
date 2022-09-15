package br.com.residencia.poo.conta;

public class ContaCorrente extends ContaBancaria {

	//a unica coisa que nao vai na herança sao os construtores
	public ContaCorrente(String titular, double saldoAbertura) {
		//aqui eu envio os dados para a classe pai
		super(titular, saldoAbertura);
	}
	
}
