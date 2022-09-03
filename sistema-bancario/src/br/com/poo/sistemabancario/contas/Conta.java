package br.com.poo.sistemabancario.contas;

public class Conta {

	// declaracao de variaveis
	public int numero;
	public String titular;
	public double saldo;
	
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

//	public boolean tranferir(double valor) {
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

	public boolean transferir(Conta x, double valor) {
		if (valor <= saldo && valor > 0) {
			this.sacar(valor);
			x.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

}
