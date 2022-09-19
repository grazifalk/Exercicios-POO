package br.com.residencia.poo.slidetrinta;

import java.util.Scanner;

public class ExercicioOito {
	
	/*8) Escreva um programa que diga se o número é par ou ímpar
	Dica: o operador % calcula a divisao de um número X por um número Y e retorna o resto da divisão.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite o número que deseja verificar: ");
		numero = sc.nextInt();
			if(numero%2 == 0) {
				System.out.println(numero + " é um número par.");
			} else {
				System.out.println(numero + " é um número ímpar.");
			}

		sc.close();
	}

}
