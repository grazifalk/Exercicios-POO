package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioDois {
	//2- Faça um Programa que peça as 4 notas bimestrais e mostre a média.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notaUm;
		double notaDois;
		double notaTres;
		double notaQuatro;
		double media;
		
		System.out.println("Digite a nota do 1º Bimestre: ");
		notaUm = sc.nextDouble();
		System.out.println("Digite a nota do 2º Bimestre: ");
		notaDois = sc.nextDouble();
		System.out.println("Digite a nota do 3º Bimestre: ");
		notaTres = sc.nextDouble();
		System.out.println("Digite a nota do 4º Bimestre: ");
		notaQuatro = sc.nextDouble();
		media = (notaUm+notaDois+notaTres+notaQuatro)/4;
		System.out.println("Sua média é: " + media);
		
		sc.close();
	}

}
