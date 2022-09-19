package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

/* 14- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
sabendo que a decisão é sempre pelo mais barato. */

public class ExercicioCatorze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double produtoUm;
		Double produtoDois;
		Double produtoTres;
		
		System.out.println("Informe o valor do primeiro produto: R$ ");
		produtoUm = sc.nextDouble();
		System.out.println("Informe o valor do segundo produto: R$ ");
		produtoDois = sc.nextDouble();
		System.out.println("Informe o valor do terceiro produto: R$ ");
		produtoTres = sc.nextDouble();
		
		if (produtoUm < produtoDois && produtoUm < produtoTres) {
			System.out.println("Você deve comprar o primeiro produto, pois é o mais barato!");
		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {
			System.out.println("O segundo produto está com melhor preço, compre ele!");
		} else {
			System.out.println("A melhor opção de compra é o item 3, pois possui o melhor valor!");
		}

		sc.close();
	}

}
