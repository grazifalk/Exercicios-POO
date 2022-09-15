package br.com.residencia.poo.balanco;

public class CalculoGastos {
	//declaração de variaveis
	int gastosJaneiro = 15000;
	int gastosFevereiro = 23000;
	int gastosMarco = 17000;
	int gastosAbril = 12000;
	int gastosMaio = 16000;
	int gastosJunho = 22000;
	int gastosJulho = 18000;
	int gastosAgosto = 19000;
	int gastosSetembro = 27000;
	int gastosOutubro = 16000;
	int gastosNovembro = 18000;
	int gastosDezembro = 21000;
	int balancoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
	int balancoSemestral = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
	int balancoAnual = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho +
			gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;
	
	//construtor default
	public CalculoGastos() {
	}

	//construtor parametrizado
	public CalculoGastos(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
			int gastosJunho, int gastosJulho, int gastosAgosto, int gastosSetembro, int gastosOutubro,
			int gastosNovembro, int gastosDezembro, int balancoTrimestral, int balancoSemestral, int balancoAnual) {
		super();
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
		this.gastosMaio = gastosMaio;
		this.gastosJunho = gastosJunho;
		this.gastosJulho = gastosJulho;
		this.gastosAgosto = gastosAgosto;
		this.gastosSetembro = gastosSetembro;
		this.gastosOutubro = gastosOutubro;
		this.gastosNovembro = gastosNovembro;
		this.gastosDezembro = gastosDezembro;
		this.balancoTrimestral = balancoTrimestral;
		this.balancoSemestral = balancoSemestral;
		this.balancoAnual = balancoAnual;
	}
	//criação de métodos
	int soma() {
		System.out.println("O valor total gasto no mês de Janeiro foi: R$ " + gastosJaneiro);
		return gastosJaneiro;
	}
	
	int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco) {
		int balancoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("O valor total gasto no trimestre foi: R$ " + balancoTrimestral);
		return balancoTrimestral;
	}
	
	int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
			int gastosJunho) {
		balancoSemestral = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio +
				gastosJunho;
		System.out.println("O valor total gasto no semestre foi: R$ " + balancoSemestral);
		return balancoSemestral;
	}
	
	int soma(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
			int gastosJunho, int gastosJulho, int gastosAgosto, int gastosSetembro, int gastosOutubro,
			int gastosNovembro, int gastosDezembro) {
		balancoAnual = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio +
				gastosJunho + gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro +
				gastosNovembro + gastosDezembro;
		System.out.println("O valor gasto anual foi: R$ " + balancoAnual);
		return balancoAnual;
	}

}
