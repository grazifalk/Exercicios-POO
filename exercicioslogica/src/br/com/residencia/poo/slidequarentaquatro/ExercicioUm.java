package br.com.residencia.poo.slidequarentaquatro;

import java.util.Scanner;

public class ExercicioUm {
	
	//1) Leia um número e retorne como resposta se ele é positivo, negativo ou zero.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um número para saber se ele é positivo, negativo ou zero: ");
		numero = sc.nextDouble();
		if(numero > 0) {
			System.out.println(numero + " é um número positivo!");
		} else if (numero < 0) {
			System.out.println(numero + " é um número negativo!");
		} else {
			System.out.println("Você digitou zero.");
		}
		
		sc.close();
		
	}
}
