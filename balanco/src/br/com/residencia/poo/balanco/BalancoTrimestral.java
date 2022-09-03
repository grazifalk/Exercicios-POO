package br.com.residencia.poo.balanco;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("O valor gasto total no trimestre foi: R$ " + gastosTrimestre);
		
	}

}
