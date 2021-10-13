import java.util.Scanner;

public class atv_8_Maca {

	public static void main(String[] args) {
		
		System.out.println("Qual o total de maças para compra: ");
		Scanner sc = new Scanner(System.in);
		
		double tMaca = sc.nextDouble();
		
		double maiorpreco = tMaca * 0.30;
		double precomenor = tMaca * 0.25;
		
		if (tMaca < 12) {
			System.out.printf("O total de maça(s) compradas é %.0f e o preço final é R$ %.2f.", tMaca, maiorpreco);
		} else {
			System.out.printf("O total de maça(s) compradas é %.0f e o preço final é R$ %.2f.", tMaca, precomenor);
		}
	
		sc.close();
	}
}