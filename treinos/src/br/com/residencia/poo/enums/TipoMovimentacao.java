package br.com.residencia.poo.enums;

public enum TipoMovimentacao {

	SAQUE("Saque"), // 0
	DEPOSITO("Deposito"), // 1
	TRANSFERENCIA("Transferência"), // 2
	ABERTURA_CONTA("Abertura de conta"), // 3
	APLICACAO("Aplicação"),
	RENDIMENTO("Rendimento");
	
	private String valor;
		
	private TipoMovimentacao(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}
}