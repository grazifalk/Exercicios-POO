package br.com.poo.sistemabancario.pessoas;

public class Gerente extends Funcionario {
	//declaracao de atributos
	//modificador de acesso - tipo da variável - nome da variável
	private int numeroFuncionarios;
	private boolean controleCaixa;
	
	//construtor default
	public Gerente() {
		super();	
	}
	//construtor parametrizado
	public Gerente(String nome, String cpf, double salario, int senha, String login, String agencia, int numeroFuncionarios, boolean controleCaixa) {
		super(nome, cpf, salario, senha, login, agencia);
		this.numeroFuncionarios = numeroFuncionarios;
		this.controleCaixa = controleCaixa;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public boolean isControleCaixa() {
		return controleCaixa;
	}
	public void setControleCaixa(boolean controleCaixa) {
		this.controleCaixa = controleCaixa;
	}


	
	
	
	
}
