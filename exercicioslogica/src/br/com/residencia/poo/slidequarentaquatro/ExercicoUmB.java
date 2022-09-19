package br.com.residencia.poo.slidequarentaquatro;

import java.util.Scanner;

public class ExercicoUmB {

	/*Criar um algoritmo que receba quatro notas e calcule a média. Se a média for maior que 7 deverá ser exibida a mensagem aprovado
	caso contrário deverá ser exibida a mensagem reprovado.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeAluno;
		double notaUm;
		double notaDois;
		double notaTres;
		double notaQuatro;
		double media;
		
		System.out.println("Escreva o nome do aluno: ");
		nomeAluno = sc.next();
		System.out.println("Qual foi a nota da primeira prova? ");
		notaUm = sc.nextDouble();
		System.out.println("Qual foi a nota da segunda prova? ");
		notaDois = sc.nextDouble();
		System.out.println("Qual foi a nota da terceira prova? ");
		notaTres = sc.nextDouble();
		System.out.println("Qual foi a nota da quarta prova? ");
		notaQuatro = sc.nextDouble();
		media = (notaUm + notaDois + notaTres + notaQuatro)/4;
		
		if(media > 7) {
			System.out.println("Parabéns, " + nomeAluno + "! " + "Você foi aprovado! :) \nSua média é: " + media + "!");
		} else {
			System.out.println("Oh, não! Você foi reprovado! \nSua média é: " + media + "!");
		}
		sc.close();
	}

}
