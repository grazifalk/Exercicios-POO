package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ExercicioQuatroA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nome = in.nextLine();

		System.out.println("Informe a disciplina: ");
		String disciplina = in.nextLine();
		
		int cont = 1;
		double totalNotas = 0.0, media;
		while (cont <= 3) {
			System.out.println("Insira a nota"+cont+": ");
		    double nota = in.nextDouble();
		    totalNotas += nota;
		    cont++;
		}
		
		media = totalNotas/3;
		System.out.println("Olá, "+nome);
		System.out.println("Na disciplina "+disciplina+" sua média é: "+media);
		
		in.close();
	}

}