package br.com.residencia.poo.gerente;

public class Gerente {

	private String nome;
	private Double salario;
	
	public Gerente(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salario;
	}
			
}