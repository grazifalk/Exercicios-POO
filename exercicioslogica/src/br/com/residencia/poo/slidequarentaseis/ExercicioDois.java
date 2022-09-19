package br.com.residencia.poo.slidequarentaseis;

import java.util.Scanner;

public class ExercicioDois {
	//Faça um algoritmo que leia a idade de uma pessoa e de acordo com a idade exiba a seguintes mensagens:
	//Menor que 16 anos - não pode votar
	//Entre 16 e 18 anos e maior que 70 anos - voto opcional
	//Entre 18 e 70 anos - voto obrigatório	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual é a idade do eleitor? ");
		idade = sc.nextInt();
		if(idade < 16) {
			System.out.println("Não pode votar!");
		} else if (idade >= 18 && idade <=70) {
			System.out.println("Voto obrigatório!");
		} else {
			System.out.println("Voto opcional!");
		}
		sc.close();
	}

}
