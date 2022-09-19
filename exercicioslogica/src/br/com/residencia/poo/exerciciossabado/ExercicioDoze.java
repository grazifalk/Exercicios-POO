package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double numeroUm, numeroDois, numeroTres;
		
		System.out.println("Informe o primeiro número: ");
		numeroUm = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		numeroDois = sc.nextDouble();
		System.out.println("Informe o terceiro número: ");
		numeroTres = sc.nextDouble();
		
		if (numeroUm > numeroDois && numeroUm > numeroTres) {
			System.out.println("O primeiro número informado é o maior! [número " + numeroUm + "]");
		} else if (numeroDois > numeroUm && numeroDois > numeroTres) {
			System.out.println("O segundo número informado é o maior! [número " + numeroDois + "]");
		} else if (numeroTres > numeroUm && numeroTres > numeroDois) {
			System.out.println("O terceiro número informado é o maior! [número " + numeroTres + "] ");
		}else if (numeroUm == numeroDois && numeroDois == numeroTres) {
			System.out.println("Os três números informados são iguais!");
		} else {
			System.out.println("Erro!");
		}

	}

}
