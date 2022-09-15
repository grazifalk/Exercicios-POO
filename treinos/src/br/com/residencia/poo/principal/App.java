package br.com.residencia.poo.principal;

import java.util.Scanner;

import br.com.residencia.poo.cliente.Cliente;
import br.com.residencia.poo.gerente.Gerente;
import br.com.residencia.poo.conta.ContaBancaria;
import br.com.residencia.poo.conta.ContaCorrente;
import br.com.residencia.poo.conta.ContaInvestimento;
import br.com.residencia.poo.conta.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		
		/*Banco do Serratec
		1º toda conta bancária deve ter um método para sacar OK
		2º toda conta bancária deve ter um método para depositar OK
		3º deve ser possível cadastrar uma conta bancária com qualquer valor de saldo maior que 10.00 OK
		4º toda conta bancária deve ter um método para transferir OK
		5º deve existir uma conta corrente baseada na conta bancária
		6º deve existir uma conta poupança baseada na conta bancária
		*/
		
		
		var conta1 = new ContaCorrente("Graziella", 100.0);
		conta1.setAgencia("0001");
		conta1.setNumero("2584529-5");
		
		
		
		var conta2 = new ContaPoupanca("Gabriel Pacheco", 100.0);
		conta2.setAgencia("0001");
		conta2.setNumero("2184579-8");
				
		
		/*
		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
		System.out.println();
		
		*/
		
		// Gabriel sacou 50 reais para pagar a graziella.
		var pagamentoGraziella = conta2.sacar(50.00);
		
		// A Graziela vai depositar os 50,00 para não ficar com dinheiro em mãos.
		conta1.depositar(pagamentoGraziella);
		
		/*
		//Apuração de saldo
		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
		System.out.println();
		*/
		
		
		// O professor ganhou 10k de uma empresa.
		var contaProfessor = new ContaInvestimento("Weberson", 10000.0);
	
		//Graziella, vou te pagar 4k para vc criar um código simples pra mim.
		contaProfessor.transferir(4000.0, conta1);
		
		//Gabriel, vou t pagar 3k para ajudar a Graziella nesse projeto.
		contaProfessor.transferir(3000.0, conta2);
		
		/*
		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
		System.out.println(contaProfessor.getTitular() + " - Saldo R$ " + contaProfessor.getSaldo());
		System.out.println();
		*/
		// Vai fazer um aporte de 1000.0
		contaProfessor.aplicarDinheiro(1000.0);
		
		//System.err.println("R$ " + contaProfessor.obterSaldoMaisAplicacao());
		
		System.out.println("Imprimindo extrato Conta1:");
		conta1.imprimirExtrato();
		
		
		System.out.println("Imprimindo extrato Conta2:");
		conta2.imprimirExtrato();
		
		System.out.println("Imprimindo extrato Conta professor:");
		contaProfessor.imprimirExtrato();
		
		
		/*
		 * 
		 * Foi solicitado que fosse criado uma rotina de extrato bancario.
		 * Devemos implementar um extrato com tudo que aconteceu na conta desde sua criação.
		 * 
		 * 
		 * Data da geração
		 * Data da movimentacao
		 * valor da movimentação
		 * tipo de movimentação.
		 * 
		 * 12/09/2022 as 17:22 - SAQUE - R$ 100,00
		 * 12/09/2022 as 17:25 - DEPOSITO - R$ 500,00

			Saldo atual de R$ 400,00
		 * 
		 * 
		 * */
		
	}
			
//		var conta1 = new ContaCorrente("Graziela", 100.0);
//		var conta2 = new ContaPoupanca("Gabriel", 100.0);
//		
//		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
//		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
//		System.out.println();
//		
//		//Gabriel sacou 50 reais para pagar Graziela
//		var pagamentoGraziela = conta2.sacar(50.00);
//		
//		//Graziela vai depositar os 50 reais para não ficar com dinheiro em mãos
//		conta1.depositar(pagamentoGraziela);
//		
//		//apuração de saldo
//		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
//		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
//		System.out.println();
//	
//		//o professor ganhou 10k de uma empresa
//		var contaProfessor = new ContaInvestimento("Weverson", 10000.0);
//		//Graziela, vou te pagar 4k para voce criar um código simples pra mim
//		contaProfessor.transferir(4000.0, conta1);
//		//Gabriel, vou te pagar 3k para ajudar a Graziela nesse projeto
//		contaProfessor.transferir(3000.0, conta2);
//		
//		System.out.println(conta1.getTitular() + " - Saldo R$ " + conta1.getSaldo());
//		System.out.println(conta2.getTitular() + " - Saldo R$ " + conta2.getSaldo());
//		System.out.println(contaProfessor.getTitular() + " - Saldo R$ " + contaProfessor.getSaldo());
//		System.out.println();
//		
//		//vai fazer aporte de 1000.0
//		contaProfessor.aplicarDinheiro(1000.0);
//		
//		System.err.println("R$ " + contaProfessor.obterSaldoMaisAplicacao());
		
		// TODO Auto-generated method stub
    //		var conta1 = new ContaBancaria();
		
		// Alterar o nome do titular.
	//	conta1.setTitular("Marcia Lima");
		
		// obter o titular
	//	conta1.getTitular();
		// Quero de alguma forma poder alterar o saldo
		
	//	System.out.println("O saldo da conta da "+ conta1.getTitular() + " é R$ " + conta1.getSaldo()); 
		// Criar um metodo para depositar
		// Criar um metodo para transferir.
		
		
		// Eu quero ja criar uma conta com um saldo inical diferente 10.0
	//	var conta2 = new ContaBancaria(100.0);
	//	conta2.setTitular("Graziela");
	//	System.out.println("O saldo da conta da "+ conta2.getTitular() + " é R$ " + conta2.getSaldo()); 
		
		
	//	var conta3 = new ContaBancaria("Pedro Siqueira", 10000.0);
	//	System.out.println("O saldo da conta da "+ conta3.getTitular() + " é R$ " + conta3.getSaldo()); 
		
		
	//}

}
