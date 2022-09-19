package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioDez {
	/* 10- Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
	usando a seguinte fórmula: (72.7*altura) - 58 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura;
		double pesoIdeal;
		
		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();
		
		pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		
		sc.close();

	}

}
