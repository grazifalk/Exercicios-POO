package br.com.residencia.poo.slidevintenove;

import java.util.Scanner;

//3) Construa um algoritmo que leia o nome de um aluno, disciplinas, duas notas e exiba na tela a média.

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String disciplina;
		double notaUm;
		double notaDois;
				
		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Digite a disciplina: ");
		disciplina = sc.nextLine();
		System.out.println("Informe a nota 1: ");
		notaUm = sc.nextDouble();
		System.out.println("Informe a nota 2: ");
		notaDois = sc.nextDouble();
		double media = (notaUm + notaDois)/2;
		System.out.println("Sua média é: " + media);
		
	sc.close();
	}
	

}
