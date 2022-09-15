package br.com.poo.sistemabancario.principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import br.com.poo.sistemabancario.contas.Conta;
import br.com.poo.sistemabancario.contas.ContaCorrente;
import br.com.poo.sistemabancario.pessoas.Diretor;
import br.com.poo.sistemabancario.pessoas.Funcionario;
import br.com.poo.sistemabancario.pessoas.OperadorCaixa;
import br.com.residencia.poo.IO.LeituraEscrita;

public class Principal {
	
	public static void main(String[] args) {
		
	//  Map
	/*	Buscar informação de determinado objeto de forma rapida
		(no map não precisa ir campo a campo para procurar)
		Fazemos uma relação entre a chave e o valor, através do método put  */
		
		Funcionario f1 = new Funcionario("Grazi", "123", 100.0, 123, "grazifalk", "222");
		Funcionario f2 = new Funcionario("Kizy", "456", 1000.0, 124, "kizyfalk", "222");
		Map<String, Funcionario> mapaFuncionario = new HashMap<>();
		mapaFuncionario.put("funcionario", f1);
		mapaFuncionario.put("funcionarioDois", f2); //a chave "String" é única, se colocar igual irá sobrescrever a anterior
		
		Funcionario ff = mapaFuncionario.get("funcionario");
		System.out.println(ff.toString());

		
		
		
//	List<String> lista = new ArrayList<>();
//	lista.add("Sérgio");
//	lista.add("Paulo");
//	lista.add("Guilherme");
//	lista.add("Paulo");
//
//	System.out.println(lista);
//	Collections.sort(lista);
//	System.out.println(lista);
//	
//	//Set
//	Set<String> listaSet = new HashSet<>();
//	listaSet.add("Sérgio");
//	listaSet.add("Paulo");
//	listaSet.add("Guilherme");
//	listaSet.add("Paulo");
//
//	System.out.println(listaSet);
//	
//	Set<String> listaSetT = new TreeSet<>(); //Lista tipo "Set" em ordem alfabética
//	listaSetT.add("Sérgio");
//	listaSetT.add("Paulo");
//	listaSetT.add("Guilherme");
//	listaSetT.add("Paulo");
//
//	System.out.println(listaSetT);
		

//		ContaCorrente c1 = new ContaCorrente("corrente", 123, 123456, )
//		ContaCorrente c2 = new ContaCorrente("corrente", 456, )
//		List<ContaCorrente> contas = new ArrayList<>(); //o diamante de ArrayList considera o diamante inicial
//		contas.add(c1);
//		contas.add(c2)
//		System.out.println(contas);
		
				
//		Funcionario funcionario = new Funcionario();
//		ContaCorrente cc = new ContaCorrente();
//		List lista = new ArrayList();
//		lista.add("Vinícius");
//		lista.add("João");
//		lista.add(123);
//		lista.add(funcionario);
//		lista.add(cc);
//		System.out.println(lista);
		
				
//		List lista = new ArrayList(); //instanciamos lista
//		lista.add("Vinicius");
//		lista.add("Grazi");
//		lista.add("Breno");
//		lista.add("Quezia");
//		
//		System.out.println(lista);
//		System.out.println(lista.size());
//		lista.remove(0);
//		System.out.println(lista);
//		System.out.println(lista.get(1));
//		System.out.println(lista);
//		System.out.println(lista.isEmpty());
//		
//		System.out.println(lista);
//		Collections.sort(lista);   //Ordenar lista em ordem alfabética
//		System.out.println(lista); //Printar a lista em ordem alfabética
//		lista.clear(); //limpar lista
//		System.out.println(lista);
//		
//		
//		
//		
//		
//		
//		
//		//Datas e horas - Date
//		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date data = new Date();
//		System.out.println("Data antes de formatar " + data);
//		System.out.println("Data depois de formatar " + dataFormatada.format(data));
//		//Datas e horas - GregorianCalendar
//		GregorianCalendar calendar = new GregorianCalendar();
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.DAY_OF_YEAR);
//		System.out.println(calendar.get(calendar.DATE));
//		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
//		System.out.println(calendar.isLeapYear(2010)); //verificar se ano é bissexto
//		
//		//Datas e horas - LocalDate
//		LocalDate hoje = LocalDate.now(); //não possui construtor default
//		System.out.println(hoje);
//		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		System.out.println(hoje.format(formatar));
//		
//		LocalDateTime hojeHora = LocalDateTime.now(); //não possui construtor default
//		System.out.println(hoje);
//		DateTimeFormatter formatarLDT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//		System.out.println(hojeHora.format(formatarLDT));
//		
//		
//		LocalDate dataAniversario = LocalDate.of(1994, 07, 02);
//		Period idade = Period.between(dataAniversario, hoje);
//		System.out.println("Idade: " + idade.getYears());
//		
//		ler(); //chamar método ler
//	}
//	
//	public static void ler() { //método ler
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o nome do arquivo:");
//		String nome = sc.next();
//		try {
//			LeituraEscrita.leitor(nome);
//		} catch (FileNotFoundException e) {
//			System.out.println("O sistema não pode encontrar o arquivo especificado!");
//			ler();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sc.close();
//		
////		Funcionario objetoFuncionario = new Funcionario();
////		objetoFuncionario.setCpf(Funcionario.getCpf());
//		
//		
//		//instanciando um objeto funcionario
//		Funcionario objetoFunc = new Funcionario("Déby", "123", 1000.0, 111, "deby", "000");
//		Funcionario objetoFuncUm = new Funcionario();
//		System.out.println("Bonificação do Funcionário " + objetoFunc.bonificao());
//		
//		//instanciando um objeto operadorCaixa
//		OperadorCaixa objetoCaixa = new OperadorCaixa();
//		OperadorCaixa objetoOperCaixa = new OperadorCaixa(200.0, 10000.0, "Ana", "456", 5300.0, 222, "ana", "123-4");
//		System.out.println("Bonificação do Caixa " + objetoOperCaixa.bonificao());
//		
//		//instanciando um objeto diretor
//		Diretor objetoDir = new Diretor();
//		Diretor objetoDiretor = new Diretor("123-4", 500000.0, "Ana", "123", 3000.0, 111, "ana", "000");
//		System.out.println("Bonificação do Diretor " + objetoDiretor.bonificao());
		
	//	Funcionario objetoDiretorDois = new Diretor();
	//	System.out.println(objetoDiretorDois);
		
	//}
		
			
			
		
	//	Conta minhaConta = new Conta("Pedro");
	//	Conta minhaContaDois = new Conta("Maria");
		
	//	minhaConta.titular = "Pedro";
	//	minhaConta.saldo = 1000.0;
	//	minhaConta.numero = 123;
	//	minhaConta.sacar(0.0);
	//	minhaConta.depositar(0.0);
			
	//	minhaContaDois.titular = "Maria";
	//	minhaContaDois.saldo = 2000.0;
	//	minhaContaDois.numero = 124;
	//	minhaContaDois.sacar(0.0);
	//	minhaContaDois.depositar(0.0);
	//	minhaConta.transferir(minhaContaDois,200);
     
	//	System.out.println("Saldo atual: " + "\nNome do titular: " + minhaConta.titular + "\nNúmero da Conta:" + minhaConta.numero);
		
	//	System.out.println("\n\nSaldo atual: " + "\nNome do titular: " + minhaContaDois.titular + "\nNúmero da Conta:" + minhaContaDois.numero);

	}
}

