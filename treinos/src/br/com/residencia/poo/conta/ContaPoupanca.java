package br.com.residencia.poo.conta;

import java.util.Date;
import br.com.residencia.poo.util.DataUtil;

public class ContaPoupanca extends ContaBancaria {

	//a unica coisa que nao vai na herança sao os construtores
	public ContaPoupanca(String titular, double saldoAbertura) {
		//aqui eu envio os dados para a classe pai
		super(titular, saldoAbertura);
	}
	
}
