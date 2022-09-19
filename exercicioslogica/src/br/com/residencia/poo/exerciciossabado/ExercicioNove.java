package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioNove {
	/*9- Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    O produto do dobro do primeiro com metade do segundo.
    A soma do triplo do primeiro com o terceiro.
    O terceiro elevado ao cubo.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroUm;
		int numeroDois;
		double numeroTres;
		double rUm;
		double rDois;
		double rTres;
		
		System.out.println("Informe um número inteiro: ");
		numeroUm = sc.nextInt();
		System.out.println("Informe outro número inteiro: ");
		numeroDois = sc.nextInt();
		System.out.println("Informe um número real: ");
		numeroTres = sc.nextDouble();
		rUm = (numeroUm+numeroUm) + (numeroDois/2);
		rDois = (numeroUm*3) + numeroTres;
		rTres = (numeroTres*numeroTres*numeroTres);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + rUm + "\n");
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + rDois + "\n");
		System.out.println("O terceiro elevado ao cubo é: " + rTres);
		
		sc.close();

	}

}
