package br.com.residencia.poo.slidevintenove;

import java.util.Scanner;

//1) Leia dois valores pelo teclado e imprima a soma.

public class ExercicioUm {
	
	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);
		
		double vendaUm, vendaDois, soma;
		System.out.println("Informe o valor da venda 1 - R$ ");
		vendaUm = sc.nextDouble();
		System.out.println("Informe o valor da venda 2 - R$ ");
		vendaDois = sc.nextDouble();
		
		soma = vendaUm + vendaDois;
		
		System.out.println("Valor Total R$ " + soma);
		
		sc.close();

	}
}
