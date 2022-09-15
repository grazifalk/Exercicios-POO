package br.com.poo.sistemabancario.pessoas;

public class Diretor extends Funcionario {
	//declaracao de atributos
	//modificador de acesso - tipo da variável - nome da variável
	private String listaAgencias;
	private double capitalBruto;
	
	public Diretor() {
		super();
	}
	//construtor super, baseado na classe pai
//	public Diretor(String nome, String cpf, double salario, int senha, String login, String agencia) {
//		super(nome, cpf, salario, senha, login, agencia);
//	}
	//construtor da classe diretor
//	public Diretor(String listaAgencias, double capitalBruto) {
//		super();
//		this.listaAgencias = listaAgencias;
//		this.capitalBruto = capitalBruto;
//	}
	//é possível juntar os dois construtores:
	public Diretor(String listaAgencias, double capitalBruto, String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.listaAgencias = listaAgencias;
		this.capitalBruto = capitalBruto;
	}
	
	
	public String getListaAgencias() {
		return listaAgencias;
	}
	public double getCapitalBruto() {
		return capitalBruto;
	}
	@Override
	public double bonificao() {
		return getSalario() * 0.20;
	}

}
