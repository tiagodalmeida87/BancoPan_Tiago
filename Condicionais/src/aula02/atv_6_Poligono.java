package aula02;
import java.util.Scanner;

public class atv_6_Poligono {

	public static void main(String[] args) {

		System.out.println("Digite o número de lados: ");
		Scanner numero = new Scanner(System.in);
		int nLado = numero.nextInt();
		
		if (nLado < 3) {
			System.out.println("NÃO É UM POLÍGONO.");	
		} 
		else if (nLado == 3) {
			System.out.println("POLÍGONO é um Triângulo.");
		} 
		else if (nLado == 4) {
			System.out.println("POLÍGONO é um Quadrado.");
		} 
		else if (nLado == 5) {
			System.out.println("POLÍGONO é um Pentágono.");
		} 
		else if (nLado >= 6) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO.");
		}
		numero.close();
	}
}