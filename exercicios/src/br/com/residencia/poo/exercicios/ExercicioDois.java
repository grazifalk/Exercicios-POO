package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ExercicioDois {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //instância da classe scanner para fazer uso dos métodos que compõem essa classe
											 //O que está entre parenteses é o que eu quero fazer nessa instância (parâmetro)
											 // System.in (entrada de dados) - System.out (saída de dados)
		System.out.println("Qual é o seu nome?");
		String nome = sc.nextLine();
		System.out.println("Olá, "+nome);
		
		sc.close();
	}

}
