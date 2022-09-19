package br.com.residencia.poo.slidequarentacinco;

import java.util.Scanner;

/*Um motorista deseja colocar no seu tanque X reais de gasolina.
Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
e exibir quantos litros ele conseguiu colocar no tanque.*/

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorDesejado;
		double valorLitro;
		double litros;
		
		System.out.println("Qual é o valor que deseja colocar de gasolina? ");
		valorDesejado = sc.nextDouble();
		System.out.println("Informe qual é o valor do litro da gasolina: R$ ");
		valorLitro = sc.nextDouble();
		litros = valorDesejado/valorLitro;
		System.out.println("Você abasteceu " + litros + " litros.");
		
		sc.close();

	}

}
