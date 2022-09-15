package br.com.residencia.poo.desafio;

import java.util.Scanner;

public class Arvore {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho desejado para a árvore: ");
		size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for (int j = 0; j < i; j++) {
				System.out.print("**");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < size - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("***\n");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < size - 3; j++) {
				System.out.print(" ");
			}
			System.out.print("*******\n");
		}
		
		sc.close();
	}

}
