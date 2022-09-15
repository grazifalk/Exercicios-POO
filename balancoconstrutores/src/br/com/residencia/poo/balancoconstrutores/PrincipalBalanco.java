package br.com.residencia.poo.balancoconstrutores;

public class PrincipalBalanco {

	public static void main(String[] args) {
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
		
		BalancoTotal trimestre = new BalancoTotal(gastosJaneiro, gastosFevereiro, gastosMarco);
		
		System.out.println("O valor total gasto no trimestre foi: R$ " + trimestre.calculoGastosTotal);
		
		BalancoTotal semestre = new BalancoTotal(gastosJaneiro, gastosFevereiro, 
				gastosMarco, gastosAbril, gastosMaio, gastosJunho);
		
		System.out.println("O valor total gasto no semestre foi: R$ " + semestre.calculoGastosTotal);
		
		BalancoTotal anual = new BalancoTotal(gastosJaneiro, gastosFevereiro, gastosMarco, 
				gastosAbril, gastosMaio, gastosJunho, gastosJulho, gastosAgosto, gastosSetembro,
				gastosOutubro, gastosNovembro, gastosDezembro);
		
		System.out.println("O valor total gasto anual foi: R$ " + anual.calculoGastosTotal);
		
	}

}