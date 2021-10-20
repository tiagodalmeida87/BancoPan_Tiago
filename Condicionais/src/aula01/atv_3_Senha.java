package aula01;
// Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.	Devem ser	impressas as seguintes	mensagens: ACESSO	PERMITIDO	caso	a	senha	seja	válida. ACESSO	NEGADO	caso	a	senha	seja	inválida.

import java.util.Scanner;

public class atv_3_Senha {

	public static void main(String[] args) {
		System.out.println("Digite a senha: ");
		Scanner senha = new Scanner(System.in);
		
		int cod = senha.nextInt();
		senha.close();
		
		if(cod == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO!");
		}

	}

}
