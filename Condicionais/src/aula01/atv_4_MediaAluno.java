package aula01;
// Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
// A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
// A mensagem "Reprovado", se a m�dia for menor do que sete;
// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.

import java.util.Scanner;

public class atv_4_MediaAluno {

	public static void main(String[] args) {
		
		System.out.println("Digite a 1� nota: ");
		Scanner not1 = new Scanner(System.in);
		double n1 = not1.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		Scanner not2 = new Scanner(System.in);
		double n2 = not2.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		not1.close();
		not2.close();
		
		System.out.println("A m�dia das notas �: " + media);
		if(media >= 7 && media < 10) {
			System.out.println("Aprovado por m�dia.");
		} if(media == 10) {
			System.out.println("Aprovado com Distin��o.");
		} if(media < 7) {
			System.out.println("Reprovado por m�dia.");
		}

	}

}
