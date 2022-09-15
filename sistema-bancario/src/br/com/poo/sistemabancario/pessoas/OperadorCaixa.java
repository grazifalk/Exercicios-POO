package br.com.poo.sistemabancario.pessoas;

public class OperadorCaixa extends Funcionario {
	//declaracao de atributos
	//modificador de acesso - tipo da variável - nome da variável
	private double incioCaixa;
	private double fechamentoCaixa;
		
	public OperadorCaixa() {
		super();
	}
	public OperadorCaixa(double incioCaixa, double fechamentoCaixa, String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.incioCaixa = incioCaixa;
		this.fechamentoCaixa = fechamentoCaixa;
	}
	public double getIncioCaixa() {
		return incioCaixa;
	}
	public void setIncioCaixa(double incioCaixa) {
		this.incioCaixa = incioCaixa;
	}
	public double getFechamentoCaixa() {
		return fechamentoCaixa;
	}
	public void setFechamentoCaixa(double fechamentoCaixa) {
		this.fechamentoCaixa = fechamentoCaixa;
	}

	
	
}
