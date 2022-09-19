package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

/* 13- Faça um Programa que leia três números e mostre o maior e o menor deles. */

public class ExercicioTreze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double numeroUm;
		Double numeroDois;
		Double numeroTres;

		System.out.println("Informe um número: ");
		numeroUm = sc.nextDouble();
		System.out.println("Informe outro número: ");
		numeroDois = sc.nextDouble();
		System.out.println("Informe o último número: ");
		numeroTres = sc.nextDouble();

		if (numeroUm > numeroDois && numeroDois > numeroTres) {
			System.out.println("O maior número é: " + numeroUm + " e o menor número é: " + numeroTres);
		} else if (numeroDois > numeroUm && numeroUm > numeroTres) {
			System.out.println("O maior número é: " + numeroDois + " e o menos número é: " + numeroTres);
		} else if (numeroTres > numeroUm && numeroUm > numeroDois) {
			System.out.println("O maior número é: " + numeroTres + " e o menor número é: " + numeroDois);
		} else if (numeroTres > numeroDois && numeroDois > numeroUm) {
			System.out.println("O maior número é: " + numeroTres + " e o menor número é: " + numeroUm);
		} else if (numeroDois > numeroTres && numeroTres > numeroUm) {
			System.out.println("O maior número é: " + numeroDois + " e o menor número é: " + numeroUm);
		} else if (numeroUm > numeroTres && numeroTres > numeroDois) {
			System.out.println("O maior número é: " + numeroUm + " e o menor número é: " + numeroDois);
		} else if (numeroUm == numeroDois && numeroDois == numeroTres) {
			System.out.println("Os três número são iguais!");
		} else {
			System.out.println("Valores inválidos!");
		}

		sc.close();
	}

}