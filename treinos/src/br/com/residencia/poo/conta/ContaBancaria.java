package br.com.residencia.poo.conta;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

import br.com.residencia.poo.enums.TipoMovimentacao;
import br.com.residencia.poo.util.DataUtil;

public abstract class ContaBancaria {

	protected String titular;
	protected String agencia;
	protected String numero;
	protected Double saldo;
	protected ArrayList<Movimentacao> movimentacoes;
	
	// Esse e o contrutor default, quando nao criamos um construtor, ele e criado dinamicamente
	public ContaBancaria() {
		this.saldo = 10.0;
		this.movimentacoes = new ArrayList<Movimentacao>();
	}
	
	/// Podemos ter outros tipos de construtores, de acordo com a regra de negocio
		public ContaBancaria(Double saldoAbertura) {
		
		if(saldoAbertura < 10.0) {
			throw new InputMismatchException("O minimo para abertura de conta é R$ 10.00");	
		}
		
		saldo = saldoAbertura;
		this.movimentacoes = new ArrayList<Movimentacao>();
	}
	
	public ContaBancaria(String titular, Double saldoAbertura) {
		this.titular = titular;
		this.saldo = saldoAbertura;
		this.movimentacoes = new ArrayList<Movimentacao>();
	
		// Aqui gera a primeira movimentação.
				//Saldo de abertura.
				//Criei a movimentação.
				var movimentacao = new Movimentacao(TipoMovimentacao.ABERTURA_CONTA, saldoAbertura);
				
				//Aqui vou add a movimentação ao meu array de movimentações.
				this.movimentacoes.add(movimentacao);
			}
			
			public ContaBancaria(String titular, String agencia, String numero, Double saldo) {
				this.titular = titular;
				this.agencia = agencia;
				this.numero = numero;
				this.saldo = saldo;
				this.movimentacoes = new ArrayList<Movimentacao>();
			}
			

			// Encapsulamento.
			// Aqui vamos encapsular os atributos dentros de GETs e SETs
			
			public void setTitular(String titular) {
				//Uma serie de validações para garantir que é um nome valido.
				this.titular = titular;
			}
			
			public String getTitular() {
				return titular;
			}

			public String getAgencia() {
				return agencia;
			}

			public void setAgencia(String agencia) {
				this.agencia = agencia;
			}

			public String getNumero() {
				return numero;
			}

			public void setNumero(String numero) {
				this.numero = numero;
			}

			public Double getSaldo() {
				return saldo;
			}	
			
			public Double sacar(Double valor) {	
				
				var valorSacado = efetuarSaque(valor);
				
				// Criar movimentação e add no array de movimentações
				var movimentacao =  new Movimentacao(TipoMovimentacao.SAQUE, valor);
				this.movimentacoes.add(movimentacao);
				
				// Retorna o valor que pedi para sacar.
				return valorSacado;
			}
			
			public void depositar(Double valor) {
				
				// O valor minimo para deposito é 10.00
				if(valor < 10.0) {
					throw new InputMismatchException("O valor mínimo para depositor é de R$ 10,00 ");	
				}
				
				//this.saldo = this.saldo + valor;
				this.saldo += valor;
				
				// Criar movimentação e add no array de movimentações
				var movimentacao =  new Movimentacao(TipoMovimentacao.DEPOSITO, valor);
				this.movimentacoes.add(movimentacao);
			}
			
			
			public void transferir(Double valor, ContaBancaria contaDestino) {
						
				var valorSacado = efetuarSaque(valor);
				
				//Depositar na conta destino.
				contaDestino.depositar(valorSacado);
				
				var movimentacao = new Movimentacao(TipoMovimentacao.TRANSFERENCIA, valorSacado, contaDestino);
				this.movimentacoes.add(movimentacao);
			}
			
			
//			public void transferir(Double valor, ContaBancaria contaDestino) {
//				
//				//Removendo o valor da conta principal.
//				var valorATransferir = this.sacar(valor);
//				
//				//Depositar na conta destino.
//				contaDestino.depositar(valorATransferir);
//			}
			
			
			//Aqui estou criando um metodo abstrato para obrigar as classes filhas a implementarem esse metodo.
			public void imprimirExtrato() {
				System.out.println();
				System.out.println("****************************************");
				System.out.println("********** Extrato Bancário ************");
				System.out.println("****************************************");
				System.out.println();
				System.out.println();
				
				System.out.println("Gerado em: " + DataUtil.converterDateParaDataEHora(new Date()));
				System.out.println();
				
				// Para cada movimentação dentro de movimentações
				for(var movimentacao : this.movimentacoes) {
					System.out.println(movimentacao.obterMovimentacaoFormatada());
				}
				
				System.out.println();
				System.out.println("Saldo atual de R$ " + this.saldo);
				System.out.println();
				System.out.println();
				System.out.println("*****************************************");
				System.out.println("*********** Fim do extrato **************");
				System.out.println("*****************************************");
				System.out.println();
			}
			
			
			private Double efetuarSaque(Double valor) {
				//Removendo o valor da conta principal.
				if(this.saldo < valor) {
					// Manda mensagem  avisando que o saldo é insuficinente.
					throw new InputMismatchException("Saldo insulficiente. /nSaldo de R$ " + saldo);	
				}
				
				// Remove o valor do saldo.
				//this.saldo = this.saldo - valor;
				this.saldo -= valor;
				
				return valor;
			}
	
}