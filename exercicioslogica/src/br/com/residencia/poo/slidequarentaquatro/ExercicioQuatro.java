package br.com.residencia.poo.slidequarentaquatro;

import java.util.Scanner;

/*4) Implemente um programa tomador de decisão que considera as seguintes opções para determinar se
o usuário usará a fila preferencial ou a fila comum.
O usuário usa a fila preferencial caso:
Possui mais de 60 anos : Usa fila preferencial
É deficiente físico : Usa fila preferencial
É mulher gestante : Usa fila preferencial
O programa recebe como entrada a Idade, Sexo e a condição especial do usuário, se houver.
Exemplo de entrada: 22 homem deficiente
Saída esperada: Fila preferencial
preferenciais: +60 / Deficiente / Gestante
*/

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String sexo;
		String necessidade;
		String gestante;
		System.out.println("Qual é a idade do usuário? ");
		idade = sc.nextInt();
		System.out.println("Qual é o sexo do usário?\n[F - Feminino][M - Masculino]");
		sexo = sc.next();
		System.out.println("O usuário possui necessidades especiais?\n[S - Sim][N - Não] ");
		necessidade = sc.next();
		System.out.println("O usuário é gestante?\n[S - Sim][N - Não] ");
		gestante = sc.next();
		
		if(idade < 60 && necessidade == "N" && gestante == "N") {
			System.out.println("Vá para a fila comum!");
		} else {
			System.out.println("Vá para a fila preferencial!");
		}
		sc.close();

	}

}
