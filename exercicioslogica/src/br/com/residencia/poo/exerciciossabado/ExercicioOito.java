package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioOito {
	/*8- Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    °F = °C × 1, 8 + 32        */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturaC;
		double temperaturaF;
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		temperaturaC = sc.nextDouble();
		
		temperaturaF = (temperaturaC*1.8)+32;
		
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaF + " °F");
		
		sc.close();

	}

}
