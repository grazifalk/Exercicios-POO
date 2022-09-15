package br.com.residencia.poo.balancoconstrutores;

public class BalancoTotal {
	public int calculoGastosTotal;

	public BalancoTotal(int mes1, int mes2, int mes3) {
		calculoGastosTotal = mes1 + mes2 + mes3;
	}

	public BalancoTotal(int mes1, int mes2, int mes3, int mes4, int mes5, int mes6) {
		calculoGastosTotal = mes1 + mes2 + mes3 + mes4 + mes5 + mes6;
	}

	public BalancoTotal(int mes1, int mes2, int mes3, int mes4, int mes5, int mes6, int mes7,
			int mes8, int mes9, int mes10, int mes11, int mes12) {
		calculoGastosTotal = mes1 + mes2 + mes3 + mes4 + mes5 + mes6 + mes7 + mes8 + mes9
				+ mes10 + mes11 + mes12;
	}

}