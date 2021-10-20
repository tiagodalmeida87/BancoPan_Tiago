package aula01;
// Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// A mensagem "Reprovado", se a média for menor do que sete;
// A mensagem "Aprovado com Distinção", se a média for igual a dez.

import java.util.Scanner;

public class atv_4_MediaAluno {

	public static void main(String[] args) {
		
		System.out.println("Digite a 1º nota: ");
		Scanner not1 = new Scanner(System.in);
		double n1 = not1.nextDouble();
		
		System.out.println("Digite a 2º nota: ");
		Scanner not2 = new Scanner(System.in);
		double n2 = not2.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		not1.close();
		not2.close();
		
		System.out.println("A média das notas é: " + media);
		if(media >= 7 && media < 10) {
			System.out.println("Aprovado por média.");
		} if(media == 10) {
			System.out.println("Aprovado com Distinção.");
		} if(media < 7) {
			System.out.println("Reprovado por média.");
		}

	}

}
