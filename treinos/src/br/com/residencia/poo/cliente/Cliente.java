package br.com.residencia.poo.cliente;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String enderecoCompleto;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
