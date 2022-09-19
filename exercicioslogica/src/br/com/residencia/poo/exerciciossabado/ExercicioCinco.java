package br.com.residencia.poo.exerciciossabado;

import java.util.Scanner;

public class ExercicioCinco {
	/*5- Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
	area = medida comprimento * medida largura */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double comprimento;
		double largura;
		double area;
		
		System.out.println("Informe o comprimento do seu quadrado: ");
		comprimento = sc.nextDouble();
		System.out.println("Informe a largura do seu quadrado: ");
		largura = sc.nextDouble();
		area = comprimento*largura;
		System.out.println("O dobro da área desse quadrado é: " + area*2);
		
		sc.close();

	}

}
