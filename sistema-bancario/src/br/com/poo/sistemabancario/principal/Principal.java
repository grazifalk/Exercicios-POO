package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Pedro";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 123;
		minhaConta.sacar(505.0);
		minhaConta.depositar(-20.0);
		
		
		System.out.println("Saldo atual: " + minhaConta.saldo + "\nNome do titular: " + minhaConta.titular + "\nNúmero da Conta:" + minhaConta.numero);

	}

}
