package br.com.residencia.poo.slidequarentacinco;

import java.util.Scanner;

public class ExercicioDois {
	/*A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
	Cada pãozinho custa R$ 0,50 e a broa custa R$ 5,00.
	Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos),
	e quanto deve guardar numa conta de poupança (10% do total arrecadado).
	Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
	quantidades de pães e de broas, e depois calcular os dados solicitados.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paesV;
		int broasV;
		int numeroUm;
		int numeroDois;
		double pao;
		double broa;
		double dia;
		double poupanca;
		
		System.out.println("Quantos pães foram vendidos? ");
		paesV = sc.nextInt();
		System.out.println("Quantas broas foram vendidas? ");
		broasV = sc.nextInt();
		pao = 0.5;
		broa = 5.0;
		dia = (paesV*pao)+(broasV*broa);
		poupanca = dia/10;
		
		System.out.println("O total vendido foi: R$ " + dia);
		System.out.printf("\nO valor a ser depositado na poupança é: R$%.2f ", poupanca);
		
		sc.close();
	}

}
