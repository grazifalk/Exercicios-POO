package br.com.residencia.poo.slidequarentacinco;

import java.util.Scanner;

public class ExercicioUm {
	/*Faça um programa para que leia a idade e o nome de um jogador de futebol.
	Categorias:
	De 10-17: categorias de base
	18-40: profissional
	acima de 40: master
	abaixo de 10: escolinha
	A resposta deverá ser conforme exemplo abaixo:
	Entrada:
	nome: João
	idade: 30
	Categoria: Profissional*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Escreva o nome do jogador: ");
		nome = sc.next();
		System.out.println("Qual é a idade do jogador? ");
		idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 17) {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: Base");
		} else if(idade >= 18 && idade <=40) {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: Profissional");
		} else if(idade > 40) {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: Master");
		} else {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: Escolinha");
		}
		
		sc.close();
	}

}
