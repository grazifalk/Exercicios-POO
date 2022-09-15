package br.com.residencia.poo.conta;

import java.util.Date;

import br.com.residencia.poo.enums.TipoMovimentacao;
import br.com.residencia.poo.util.DataUtil;

public class ContaInvestimento extends ContaBancaria {
	private Double valorAplicacao;

	// A unica coisa que não vai na herança sao os construtores.
	public ContaInvestimento(String titular, double saldoAbertura) {
		
		//Aqui eu envio os dados para a classe pai
		super(titular, saldoAbertura);
		
		valorAplicacao = 0.0;
	}
	
	public void aplicarDinheiro(Double valor) {
		//Sempre ta redendo 1% na aplicaçao
		
		var rendimento = (valor * 0.01);
		var valorAAplicar = valor + rendimento;
		
		this.valorAplicacao += valorAAplicar;
		
		var movimentacaoAplicacao = new Movimentacao(TipoMovimentacao.APLICACAO, valor);
		var movimentacaoRendimento = new Movimentacao(TipoMovimentacao.RENDIMENTO, rendimento);
		
		this.movimentacoes.add(movimentacaoAplicacao);
		this.movimentacoes.add(movimentacaoRendimento);
	}
	
	
	public double obterSaldoMaisAplicacao() {
		return this.valorAplicacao + this.saldo;

	}

	@Override
     public void imprimirExtrato() {
		
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("***** Extrato Conta Investimento ********");
		System.out.println("*****************************************");
		System.out.println();
		System.out.println();
		
		System.out.println("Gerado em: " + DataUtil.converterDateParaDataEHora(new Date()));
		System.out.println();
		
		// Para cada movimentação dentro de movimentações
		for(var movimentacao : this.movimentacoes) {
			System.out.println(movimentacao.obterMovimentacaoFormatada());
		}
		
		System.out.println();
		System.out.println("Saldo atual de R$ " + obterSaldoMaisAplicacao());
		System.out.println();
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("*********** Fim do extrato **************");
		System.out.println("*****************************************");
		System.out.println();
		
	}

}