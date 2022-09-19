package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioUm {
	//1- Faça um Programa que peça dois números e imprima a soma.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroUm;
		int numeroDois;
		
		System.out.println("Digite o primeiro número: ");
		numeroUm = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = sc.nextInt();
		System.out.println("A soma de " + numeroUm + " e " + numeroDois + " é: " + (numeroUm+numeroDois));
		
		sc.close();

	}

}
