package br.com.residencia.poo.exerciciospdf;

import java.util.Scanner;

/* O programa “termômetro” lê uma temperatura em graus celsius, e devolve
sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)
Exemplo:
Temperatura em °C: 30°
Temperatura em °F: 86° */

public class ExercicioQuatro {

	public static void main(String[] args) {
		double tempC, tempF;
		Scanner temp = new Scanner(System.in);
		System.out.println("Qual é a temperatura em graus Celsius? ");
		tempC = temp.nextDouble();
		
		tempF = (tempC*1.8)+32;
		
		System.out.println(tempC + " °C é equivalente a " + tempF + "°F");		

		temp.close();
	}

}