package br.com.poo.sistemabancario.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	protected String tipoConta;
	protected Integer numeroAgencia;
	protected Integer numeroConta;
	protected Double saldo;
	protected String cpf;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();

	public Conta() {
	}

	public Conta(String tipoConta, Integer numeroAgencia,
			Integer numeroConta, Double saldo, String cpf) {
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static Map<String, Conta> getMapaContas() {
		return mapaContas;
	}

	public static void setMapaContas(Map<String, Conta> mapaContas) {
		Conta.mapaContas = mapaContas;
	}
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void transferir(Conta destino, double valor);
	
	

//	// declaracao de variaveis
//	private int numero;
//	private String titular;
//	private double saldo;
//
//	public Conta(String titular) {
//		this.titular = titular;
//	}
//
//	// acoes da conta
//
//	// metodo de saque sem tratamento
//	/*
//	 * public void sacar(double valor) { double novoSaldo = this.saldo - valor;
//	 * this.saldo = novoSaldo; }
//	 */
//
//	// metodo de saque com tratamento parcial
//	public boolean sacar(double valor) {
//		if (this.saldo < valor) {
//			System.out.println("Saldo insuficiente!");
//			return false;
//		} else {
//			double novoSaldo = this.saldo - valor;
//			this.saldo = novoSaldo;
//
//			return true;
//		}
//	}
//
//	// metodo para efetuar um deposito sem tratamento
//	/*
//	 * public void depositar(double valor) { //double novoSaldo = this.saldo +
//	 * valor; //this.saldo = novoSaldo; this.saldo += valor; }
//	 */
//
//	// metodo para efetuar um deposito com tratamento parcial
//
//	public boolean depositar(double valor) {
//		if (valor < 0) {
//			System.out.println("Valor inválido!");
//			return false;
//		} else {
//			this.saldo += valor;
//			return true;
//		}
//	}
//
//	// transferencia entre contas
//
////	public boolean transferir(double valor) {
////		if (valor < 0) {
////			System.out.println("Valor inválido!");
////			return false;
////		}
////
////		else if (valor > saldo) {
////			System.out.println("Saldo insuficiente!");
////			return false;
////		}
////		else {
////			this.saldo -= valor;
////			return true;
////		}
////	}
//
//	public boolean transferir(Conta destino, double valor) {
//		if (valor <= saldo && valor > 0) {
//			this.sacar(valor);
//			destino.depositar(valor);
//			System.out.println("Transferência realizada com sucesso!");
//			return true;
//		} else {
//			System.out.println("Saldo insuficiente para transação!");
//			return false;
//		}
//	}
//
//	public int getNumero() {
//		return numero;
//	}
//
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
//
//	public String getTitular() {
//		return titular;
//	}
//
//	public void setTitular(String titular) {
//		this.titular = titular;
//	}
//
//	public double getSaldo() {
//		return saldo;
//	}
//
//	public Conta() {
//		super();
//	}
//
//	public Conta(int numero, String titular, double saldo) {
//		super();
//		this.numero = numero;
//		this.titular = titular;
//		this.saldo = saldo;
//	}

}
