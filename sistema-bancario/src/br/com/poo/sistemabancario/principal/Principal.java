package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta minhaConta = new Conta("Pedro");
		Conta minhaContaDois = new Conta("Maria");
		
	//	minhaConta.titular = "Pedro";
	//	minhaConta.saldo = 1000.0;
		minhaConta.numero = 123;
		minhaConta.sacar(0.0);
		minhaConta.depositar(0.0);
			
	//	minhaContaDois.titular = "Maria";
	//	minhaContaDois.saldo = 2000.0;
		minhaContaDois.numero = 124;
		minhaContaDois.sacar(0.0);
		minhaContaDois.depositar(0.0);
		minhaConta.transferir(minhaContaDois,200);
     
		System.out.println("Saldo atual: " + "\nNome do titular: " + minhaConta.titular + "\nNúmero da Conta:" + minhaConta.numero);
		
		System.out.println("\n\nSaldo atual: " + "\nNome do titular: " + minhaContaDois.titular + "\nNúmero da Conta:" + minhaContaDois.numero);

	}

}
