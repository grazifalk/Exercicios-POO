package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

/* 11- Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7   */

public class ExercicioOnze {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Double altura;
	Double pesoH;
	Double pesoM;
	String sexo;
	
	System.out.println("Informe sua altura: ");
	altura = sc.nextDouble();
	System.out.println("Informe seu sexo: [H - Homem][M - Mulher]");
	sexo = sc.nextLine();
	
	pesoH = (72.7*altura) - 58;
	pesoM = (62.1*altura) - 44.7;
			
	if(sexo.equalsIgnoreCase("H")) {
		System.out.println("Seu peso ideal é: " + pesoH + " kg");
	} else if(sexo.equalsIgnoreCase("M")) {
		System.out.println("Seu peso ideal é: " + pesoM + "kg");
	} else {
		System.out.println("Valor inválido!");
	}
	}

}
