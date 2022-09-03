package br.com.residencia.poo.exerciciospdf;

/*O programa “Riuju” escreve na tela o resultado das expressões abaixo:
a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
Exemplo:
O resultado da expressão é 256.

b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9

Exemplo:
O resultado da expressão é 2421.*/

public class ExercicioCinco {

	public static void main(String[] args) {
		int operacaoUm, operacaoDois;
		
		System.out.println("Olá, bem vindo ao programa Riuju! Vamos lhe passar o resultado das operações abaixo:");
		System.out.println("\nOperação A. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66");
		System.out.println("Operação B. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
		
		operacaoUm = 2 + 3- (5*8) - 4 + 354 - 521 + (7 * 66);
		operacaoDois = (2 + 7 * (14 - 21)) + ((28 * 3) * 42) + 740 - ((156 + 4 + 40) * 9);
		
		System.out.println("================\nOperação A: " + operacaoUm + "\nOperação B: " + operacaoDois);
	}

}
