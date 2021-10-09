//2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não	é	necessário	considerar	o	mês	em	que	ela nasceu).

import java.util.Scanner;

public class atv_2_Votacao {

	public static void main(String[] args) {
		
		System.out.println("Digite seu ano de nascimento: ");
		Scanner anoNasc = new Scanner(System.in);
		
		int ano = anoNasc.nextInt();
		
		int anoAtual = 2021;
		int idade = anoAtual - ano;
		
		System.out.println("Você tem " + idade + " anos.");
		anoNasc.close();
		
		if(idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Pode votar, porém não é obrigatório.");
		}
		if(idade >= 18 && idade < 70) {
			System.out.println("Voto é obrigatório, você tem mais de 18 anos.");
		} 
		if(idade <= 15) {
			System.out.println("Proibido votar, você tem menos de 16 anos.");
		}
	}

}
