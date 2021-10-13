import java.util.Scanner;

public class atv_5_Angulo {

	public static void main(String[] args) {
		
		System.out.println("Digite o 1º ângulo: ");
		Scanner num1 = new Scanner(System.in);		
		double ang1 = num1.nextDouble();
		
		System.out.println("Digite o 2º ângulo: ");
		Scanner num2 = new Scanner(System.in);		
		double ang2 = num2.nextDouble();
		
		System.out.println("Digite o 3º ângulo: ");
		Scanner num3 = new Scanner(System.in);		
		double ang3 = num3.nextDouble();
		
		double totalAng = ang1 + ang2 + ang3 ;
		
		System.out.println("A soma dos ângulos é: " + totalAng);
		
		if (totalAng != 180) {
			System.out.println("A soma dos ângulos não define um triângulo");
			}
			else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
				System.out.println("O triângulo é Retângulo: possui um ângulo reto de 90º.");
			} 
			else if (ang1 == 60 && ang2 == 60 && ang3 == 60) {
				System.out.println("O triângulo é equilatero: possui todos ângulos iguais a 60º.");
			} 
			else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
				System.out.println("O triângulo é Obtusângulo: possui um dos ângulos obtuso maior do que 90º.");		 
			}		
			else if (ang1 < 90 || ang2 < 90 || ang3 < 90) {
				System.out.println("O triângulo é Acutângulo: possui um dos ângulos agudo menor do que 90º.");		 
			}
			
		num1.close();
		num2.close();
		num3.close();
	}
	
}