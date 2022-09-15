package br.com.residencia.poo.balanco;

public class Balanco {

	public static void main(String[] args) {

		CalculoGastos cg = new CalculoGastos();
		
		cg.soma();
		cg.soma(1800, 2000, 3000);
		cg.soma(1800, 2000, 3000, 1600, 1750, 2200);
		cg.soma(1800, 2000, 3000, 1600, 1750, 2200, 1700, 2600, 1850, 1900, 3100, 2500);
			
	}

}
