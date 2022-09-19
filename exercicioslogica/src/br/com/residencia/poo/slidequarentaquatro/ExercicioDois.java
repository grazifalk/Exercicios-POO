package br.com.residencia.poo.slidequarentaquatro;

import java.util.Scanner;

//2) Escreva um programa que encontre o valor máximo entre dois números.

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numeroUm;
		double numeroDois;
		
		System.out.println("Digite um número qualquer: ");
		numeroUm = sc.nextDouble();
		System.out.println("Digite outro número qualquer: ");
		numeroDois = sc.nextDouble();
		
		if(numeroUm > numeroDois) {
			System.out.println("O número " + numeroUm + " é maior que o número " + numeroDois);
		} else if (numeroDois > numeroUm) {
			System.out.println("O número " + numeroDois + " é maior que o número " + numeroUm);
		} else if (numeroUm == numeroDois) {
			System.out.println("Os dois números são iguais! =)");
		}
		sc.close();
	}

}
