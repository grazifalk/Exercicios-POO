package br.com.residencia.poo.slidevintenove;

import java.util.Scanner;

public class ExercicioQuatro {
	
	/*4) Faça um programa com duas variáveis ano_nascimento que receberá o ano
	que você nasceu e outra variável com o nome ano_futuro que deverá ser
	atribuído o valor 2035. Criar uma variável com o nome resultado para calcular
	a diferença. No final escreva na tela qual será a sua idade em 2035.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoFuturo = 2035;
		int anoNascimento;
		int anoSoma;

		System.out.println("Em que ano você nasceu? ");
		anoNascimento = sc.nextInt();
		anoSoma = anoFuturo - anoNascimento;
		System.out.println("Sua idade em 2035 será: " + anoSoma + " anos!");
		
		sc.close();
	}

}
