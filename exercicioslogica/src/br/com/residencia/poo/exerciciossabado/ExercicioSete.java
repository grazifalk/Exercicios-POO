package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioSete {
	/*7- Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    C = 5 * ((F-32) / 9).*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturaF;
		double temperaturaC;
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		temperaturaF = sc.nextDouble();
		temperaturaC = 5 * ((temperaturaF-32)/9);
		System.out.println("A temperatura em graus Celsius é: " + temperaturaC + " °C");
		
		sc.close();

	}

}
