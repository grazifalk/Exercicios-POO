package br.com.residencia.poo.slidevintenove;

import java.util.Scanner;

public class ExercicioDois {
	
	//2) Construir um algoritmo que leia um número e exiba na tela o seu sucessor e antecessor.

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		System.out.println("Sucessor = " + (numero+1) + " | Antecessor = " + (numero-1));
		
		sc.close();

	}

}
