package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		nome = in.nextLine();
		
		System.out.println("Qual é a sua idade?");
		idade = in.nextInt();
		in.nextLine();
		
		System.out.println("Olá, "+nome+" você tem "+idade+" anos.");
		
		in.close();
	}

}
