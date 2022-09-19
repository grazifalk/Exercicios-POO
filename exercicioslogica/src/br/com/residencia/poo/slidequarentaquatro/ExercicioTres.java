package br.com.residencia.poo.slidequarentaquatro;

import java.util.Scanner;

public class ExercicioTres {

	/*3) Escreva um programa que funcione como uma calculadora simples de soma (+), subtração(-), 
	multiplicação(*) e divisão(/) */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numeroUm;
		double numeroDois;
		String operacao;
		
		System.out.println("========== Calculadora da Grazi ==========");
		
		System.out.println("Digite o primeiro número: ");
		numeroUm = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		numeroDois = sc.nextDouble();
		System.out.println("Escolha a operação desejada: [+][-][*][/] ");
		operacao = sc.next();
		System.out.println("==========================================");
		
		switch(operacao) {
		case "+":
			System.out.println(numeroUm + " + " + numeroDois + " = " + (numeroUm+numeroDois));
			break;
		case "-":
			System.out.println(numeroUm + " - " + numeroDois + " = " + (numeroUm-numeroDois));
			break;
		case "*":
			System.out.println(numeroUm + " * " + numeroDois + " = " + (numeroUm*numeroDois));
			break;
		case "/":
				if(numeroDois == 0) {
					System.out.println("Não é possível realizar divisões por zero.");
				} else {
					System.out.println(numeroUm + " / " + numeroDois + " = " + (numeroUm/numeroDois));
				}
			break;
		default:
			System.out.println("Opção inválida!");
		}
		sc.close();
	}

}
