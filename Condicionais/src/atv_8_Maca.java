import java.util.Scanner;

public class atv_8_Maca {

	public static void main(String[] args) {
		
		System.out.println("Qual o total de ma�as para compra: ");
		Scanner sc = new Scanner(System.in);
		
		double tMaca = sc.nextDouble();
		
		double maiorpreco = tMaca * 0.30;
		double precomenor = tMaca * 0.25;
		
		if (tMaca < 12) {
			System.out.printf("O total de ma�a(s) compradas � %.0f e o pre�o final � R$ %.2f.", tMaca, maiorpreco);
		} else {
			System.out.printf("O total de ma�a(s) compradas � %.0f e o pre�o final � R$ %.2f.", tMaca, precomenor);
		}
	
		sc.close();
	}
}