package br.com.residencia.poo.slidequarentaseis;

import java.util.Scanner;

public class ExercicioUm {
	/*Calcule o IMC conforme tabela e fórmula abaixo:
	IMC = peso/(altura*altura)
<18.5 abaixo do peso normal
>= 18.5 e <= 24.0 peso normal
>= 25 e <= 29.9 exesso de peso
>= 30 e <= 34.9 obesidade classe I
>= 35 e <= 39.9 obesidade classe II
>= 40 obesidade classe III */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso;
		double altura;
		double imc;
		
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();
		imc = peso/(altura*altura);
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso normal!");
		} else if (imc >= 18.5 && imc <= 24.0) {
			System.out.println("Você está com peso normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está com excesso de peso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Você está com obesidade classe I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Você está com obesidade classe II");
		} else {
			System.out.println("Você está com obesidade classe III ");
		}
		sc.close();
	}

}
