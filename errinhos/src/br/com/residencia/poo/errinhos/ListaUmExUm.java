package br.com.residencia.poo.errinhos;

import java.util.Scanner;

public class ListaUmExUm {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner dados = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = dados.nextLine();
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = dados.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + "! Seja bem vinda :)");
		
	}

}
