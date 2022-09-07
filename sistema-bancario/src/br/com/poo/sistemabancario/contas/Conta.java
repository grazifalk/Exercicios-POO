package br.com.poo.sistemabancario.contas;

public class Conta {

	// declaracao de variaveis
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(String titular) {
		this.titular = titular;
	}

	// acoes da conta

	// metodo de saque sem tratamento
	/*
	 * public void sacar(double valor) { double novoSaldo = this.saldo - valor;
	 * this.saldo = novoSaldo; }
	 */

	// metodo de saque com tratamento parcial
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;

			return true;
		}
	}

	// metodo para efetuar um deposito sem tratamento
	/*
	 * public void depositar(double valor) { //double novoSaldo = this.saldo +
	 * valor; //this.saldo = novoSaldo; this.saldo += valor; }
	 */

	// metodo para efetuar um deposito com tratamento parcial

	public boolean depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	// transferencia entre contas

//	public boolean transferir(double valor) {
//		if (valor < 0) {
//			System.out.println("Valor inválido!");
//			return false;
//		}
//
//		else if (valor > saldo) {
//			System.out.println("Saldo insuficiente!");
//			return false;
//		}
//		else {
//			this.saldo -= valor;
//			return true;
//		}
//	}

	public boolean transferir(Conta destino, double valor) {
		if (valor <= saldo && valor > 0) {
			this.sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferência realizada com sucesso!");
			return true;
		} else {
			System.out.println("Saldo insuficiente para transação!");
			return false;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta() {
		super();
	}

	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

}
