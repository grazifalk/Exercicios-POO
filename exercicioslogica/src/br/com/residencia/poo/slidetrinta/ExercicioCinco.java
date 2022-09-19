package br.com.residencia.poo.slidetrinta;

import java.util.Scanner;

public class ExercicioCinco {
	
	/*5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra. Escreva um algoritmo que leia o total
	de horas normais e o total de horas extras trabalhadas por um empregado em um ano e calcule o salário anual deste
	trabalhador.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double horasNormais = 10.00;
		Double horasExtras = 15.00;
		
		System.out.println("Digite o número de horas extras trabalhadas no ano: ");
		horasExtras = sc.nextDouble();
		System.out.println("Digite o número de horas restantes trabalhadas no ano: ");
		horasNormais = sc.nextDouble();
		System.out.println("Seu salário anual é de R$ " + ((horasNormais*10) + (horasExtras*15)));
		
		sc.close();
	}

}
