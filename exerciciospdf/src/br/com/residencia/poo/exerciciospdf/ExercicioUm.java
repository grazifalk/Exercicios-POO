package br.com.residencia.poo.exerciciospdf;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner dados = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = dados.nextLine();
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = dados.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + "! Seja bem vinda :)");
		
		dados.close();
	
	}

}
