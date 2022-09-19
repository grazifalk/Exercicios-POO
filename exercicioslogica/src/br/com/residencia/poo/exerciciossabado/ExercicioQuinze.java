package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

/* 15- Faça um Programa que leia três números e mostre-os em ordem decrescente.*/

public class ExercicioQuinze {

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
			System.out.println("Números em ordem decrescente: " + numeroUm + "- " + numeroDois + "- " + numeroTres);
		} else if (numeroUm > numeroTres && numeroTres > numeroDois) {
			System.out.println("Números em ordem decrescente: " + numeroUm + "- " + numeroTres +  "- " + numeroDois);
		} else if (numeroDois > numeroUm && numeroUm > numeroTres) {
			System.out.println("Números em ordem descrescente: " + numeroDois + "- " + numeroUm + "- " + numeroTres);
		} else if (numeroDois > numeroTres && numeroTres > numeroUm) {
			System.out.println("Números em ordem decrescente: " + numeroDois + "- " + numeroTres + "- " + numeroUm);
		} else if (numeroTres > numeroUm && numeroUm > numeroDois) {
			System.out.println("Números em ordem decrescente: " + numeroTres + "- " + numeroUm + "- " + numeroDois);
		} else if (numeroTres > numeroDois && numeroDois > numeroUm) {
			System.out.println("Números em ordem decrescente: " + numeroTres + "- " + numeroDois + "- " + numeroUm);
		} else {
			System.out.println("Valores inválidos!");
		}

		sc.close();
	}

}