package aula03;

import java.util.Scanner;

public class Atv_9_While {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		double total = 0.0;
		double nota = 0.0;
		while (true) {
			System.out.println("Digite a proxima nota: ( ou digitar -1 para finalizar)");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				quantidadeNotas++;
				total += nota;
			} else if (nota == -1) {
				double media = total / quantidadeNotas;
				System.out.println("Quantidades de notas totais: " + quantidadeNotas);
				System.out.printf("Média = %.2f %n", media);
				break;
			} else {
				System.out.println("Nota invalida");
			}
		}
		entrada.close();
	}

}
