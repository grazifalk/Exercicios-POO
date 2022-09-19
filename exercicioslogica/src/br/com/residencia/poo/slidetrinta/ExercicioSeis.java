package br.com.residencia.poo.slidetrinta;

import java.util.Scanner;

public class ExercicioSeis {
	
	//6) Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturaC;
		System.out.println("Qual é a temperatura em graus Celsius? ");
		temperaturaC = sc.nextDouble();
		double temperaturaF = (temperaturaC*1.8)+32;
		System.out.println(temperaturaC + " °C é equivalente a " + temperaturaF + "°F");
		
		sc.close();

	}
}
