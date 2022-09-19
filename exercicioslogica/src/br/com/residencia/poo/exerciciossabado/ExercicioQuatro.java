package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioQuatro {
	/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	area = pi*R² */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio;
		double area;
		System.out.println("Olá! Vamos calcular a área de um círculo!\n");
		System.out.println("Informe o raio de um círculo: ");
		raio = sc.nextDouble();
		area = 3.14*(raio*raio);
		System.out.println("A área de um círculo com raio de " + raio + " é :" + area);
		
		sc.close();

	}

}
