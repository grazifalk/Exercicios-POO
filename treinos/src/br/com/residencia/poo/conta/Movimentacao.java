package br.com.residencia.poo.conta;

import java.util.Date;

import br.com.residencia.poo.enums.TipoMovimentacao;
import br.com.residencia.poo.util.DataUtil;

public class Movimentacao {

	private Date data;
	private TipoMovimentacao tipo;
	private Double valor;
	private ContaBancaria contaDestino;
	
	public Movimentacao(TipoMovimentacao tipo, Double valor) {
		this.data = new Date();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public Movimentacao(TipoMovimentacao tipo, Double valor, ContaBancaria contaDestino) {
		this.data = new Date();
		this.tipo = tipo;
		this.valor = valor;
		this.contaDestino = contaDestino;
	}
	
	public String obterMovimentacaoFormatada() {
	
		var data = DataUtil.converterDateParaDataEHora(this.data);
		
		if(contaDestino == null) {
			return data + " - " + tipo.getValor() + " - R$ " + this.valor;
		}
		
		return data + 
			" - " + 
			tipo.getValor() + 
			" - AG:" + 
			contaDestino.getAgencia() + 
			" CC:" + 
			contaDestino.getNumero() +
			" - R$ " + 
			this.valor;
		
	}
		
	// Movimentação so pode ser preenchida no momento que ela acontece
		
}
