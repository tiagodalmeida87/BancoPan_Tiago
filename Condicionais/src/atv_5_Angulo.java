import java.util.Scanner;

public class atv_5_Angulo {

	public static void main(String[] args) {
		
		System.out.println("Digite o 1� �ngulo: ");
		Scanner num1 = new Scanner(System.in);		
		double ang1 = num1.nextDouble();
		
		System.out.println("Digite o 2� �ngulo: ");
		Scanner num2 = new Scanner(System.in);		
		double ang2 = num2.nextDouble();
		
		System.out.println("Digite o 3� �ngulo: ");
		Scanner num3 = new Scanner(System.in);		
		double ang3 = num3.nextDouble();
		
		double totalAng = ang1 + ang2 + ang3 ;
		
		System.out.println("A soma dos �ngulos �: " + totalAng);
		
		if (totalAng != 180) {
			System.out.println("A soma dos �ngulos n�o define um tri�ngulo");
			}
			else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
				System.out.println("O tri�ngulo � Ret�ngulo: possui um �ngulo reto de 90�.");
			} 
			else if (ang1 == 60 && ang2 == 60 && ang3 == 60) {
				System.out.println("O tri�ngulo � equilatero: possui todos �ngulos iguais a 60�.");
			} 
			else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
				System.out.println("O tri�ngulo � Obtus�ngulo: possui um dos �ngulos obtuso maior do que 90�.");		 
			}		
			else if (ang1 < 90 || ang2 < 90 || ang3 < 90) {
				System.out.println("O tri�ngulo � Acut�ngulo: possui um dos �ngulos agudo menor do que 90�.");		 
			}
			
		num1.close();
		num2.close();
		num3.close();
	}
	
}