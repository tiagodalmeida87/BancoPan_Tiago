package aula02;
import java.util.Scanner;

public class atv_6_Poligono {

	public static void main(String[] args) {

		System.out.println("Digite o n�mero de lados: ");
		Scanner numero = new Scanner(System.in);
		int nLado = numero.nextInt();
		
		if (nLado < 3) {
			System.out.println("N�O � UM POL�GONO.");	
		} 
		else if (nLado == 3) {
			System.out.println("POL�GONO � um Tri�ngulo.");
		} 
		else if (nLado == 4) {
			System.out.println("POL�GONO � um Quadrado.");
		} 
		else if (nLado == 5) {
			System.out.println("POL�GONO � um Pent�gono.");
		} 
		else if (nLado >= 6) {
			System.out.println("POL�GONO N�O IDENTIFICADO.");
		}
		numero.close();
	}
}