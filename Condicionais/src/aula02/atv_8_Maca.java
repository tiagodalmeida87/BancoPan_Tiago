package aula02;
import java.util.Scanner;

public class atv_8_Maca {

	public static void main(String[] args) {
		
		System.out.println("Qual o total de ma�as para compra: ");
		Scanner sc = new Scanner(System.in);
		
		double tmaca = sc.nextDouble();
		
		double maiorpreco = tmaca * 0.30;
		double precomenor = tmaca * 0.25;
		
		if (tmaca < 12) {
			System.out.printf("O total de ma�a(s) compradas � %.0f e o pre�o final � R$ %.2f.", tmaca, maiorpreco);
		} else {
			System.out.printf("O total de ma�a(s) compradas � %.0f e o pre�o final � R$ %.2f.", tmaca, precomenor);
		}
	
		sc.close();
	}
}