//2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano (n�o	�	necess�rio	considerar	o	m�s	em	que	ela nasceu).

import java.util.Scanner;

public class atv_2_Votacao {

	public static void main(String[] args) {
		
		System.out.println("Digite seu ano de nascimento: ");
		Scanner anoNasc = new Scanner(System.in);
		
		int ano = anoNasc.nextInt();
		
		int anoAtual = 2021;
		int idade = anoAtual - ano;
		
		System.out.println("Voc� tem " + idade + " anos.");
		anoNasc.close();
		
		if(idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Pode votar, por�m n�o � obrigat�rio.");
		}
		if(idade >= 18 && idade < 70) {
			System.out.println("Voto � obrigat�rio, voc� tem mais de 18 anos.");
		} 
		if(idade <= 15) {
			System.out.println("Proibido votar, voc� tem menos de 16 anos.");
		}
	}

}
