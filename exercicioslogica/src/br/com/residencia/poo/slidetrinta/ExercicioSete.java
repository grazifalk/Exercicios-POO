package br.com.residencia.poo.slidetrinta;

import java.util.Scanner;

public class ExercicioSete {
	
	/*7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída:
	Dividendo, Divisor, Quociente e Resto.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroUm;
		int numeroDois;
		int quociente;
		int resto;
		System.out.println("Digite o primeiro número: ");
		numeroUm = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = sc.nextInt();
		quociente = numeroUm/numeroDois;
		resto = numeroUm%numeroDois;
		System.out.println("O dividendo é: " + numeroUm + " o divisor é: " + numeroDois + " o quociente é: " +
		quociente + " e o resto é: " + resto);
	
		sc.close();
	}

}
