package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Pedro";
		minhaConta.saldo = 1000.0;
		minhaConta.numero = 123;
		minhaConta.sacar(0.0);
		minhaConta.depositar(0.0);
			
		Conta minhaConta2 = new Conta();
		
		minhaConta2.titular = "Maria";
		minhaConta2.saldo = 2000.0;
		minhaConta2.numero = 124;
		minhaConta2.sacar(0.0);
		minhaConta2.depositar(0.0);
		
		if(minhaConta.transferir(minhaConta2,-200)) {
            System.out.println("Transferencia ocorreu com sucesso");
        } else { System.out.println("Saldo insuficiente para transação!");}
		
		System.out.println("Saldo atual: " + minhaConta.saldo + "\nNome do titular: " + minhaConta.titular + "\nNúmero da Conta:" + minhaConta.numero);
		System.out.println("\nSaldo atual: " + minhaConta2.saldo + "\nNome do titular: " + minhaConta2.titular + "\nNúmero da Conta:" + minhaConta2.numero);

	}

}
