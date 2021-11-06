package Aula301021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int nTab = 0;

		Scanner numero = new Scanner(System.in);
		
		do {
			System.out.println("Digite o número para tabuada ou digite Zero(0) para encerrar: ");
			try {

				nTab = numero.nextInt();

				if (nTab != 0) {
					int multiplicador = 0;
					while (multiplicador <= 10) {
						System.out.println(nTab + " x " + multiplicador + " = " + nTab * multiplicador);
						multiplicador++;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("*** Não é permitido inserir letras. ***\n");
				numero.nextLine();
			}
	
		} while (nTab != 0);
		System.out.println("Fim da execução");
		numero.close();
	}
}