package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioSeis {
	/* 6- Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorHora;
		double horasTrabalhadas;
		double salario;
		
		System.out.println("Quanto você ganha por hora? ");
		valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês? ");
		horasTrabalhadas = sc.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		System.out.println("Seu salário esse mês é de R$ " + salario);
		
		sc.close();

	}

}
