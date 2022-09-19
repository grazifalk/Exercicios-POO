package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioTres {
	//3- Faça um Programa que converta metros para centímetros.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		int cm;
		
		System.out.println("Digite o valor em metros que deseja converter: ");
		m = sc.nextInt();
		cm = m*100;
		System.out.println(m + " metros é equivalente a " + cm + " centímetros");
		
		sc.close();
	}

}
