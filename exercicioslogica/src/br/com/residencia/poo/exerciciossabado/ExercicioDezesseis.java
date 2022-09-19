package br.com.residencia.poo.exerciciossabado;

/* 16- Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class ExercicioDezesseis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String turno;
		
		System.out.println("Em que turno você estuda? [M - Matutino][V - Vespertino][N - Noturno]");
		turno = sc.nextLine();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia! =)");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde! =)");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite! =)");
		} else {
			System.out.println("Valor inválido!");
		}
		
		sc.close();
	}

}
