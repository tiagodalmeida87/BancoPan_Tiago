import java.util.Scanner;

public class atv_7_MedidaLado {

	public static void main(String[] args) {
		
		System.out.println("Digite a medida do 1º lado: ");
		Scanner num1 = new Scanner(System.in);		
		int mLado1 = num1.nextInt();
		
		System.out.println("Digite a medida do 2º lado: ");
		Scanner num2 = new Scanner(System.in);		
		int mLado2 = num2.nextInt();
		
		System.out.println("Digite a medida do 3º lado: ");
		Scanner num3 = new Scanner(System.in);		
		int mLado3 = num3.nextInt();
		
		if (mLado1 == mLado2 && mLado2 == mLado3 && mLado1 == mLado3) {
			System.out.println("Triângulo Equilátero: possui os 3 lados iguais.");
		} else if(mLado1 != mLado2 && mLado1 != mLado3 && mLado2 != mLado3) {
			System.out.println("Triângulo Escaleno: possui 3 lados diferentes.");
		} else {
			System.out.println("Triângulo Isóscele: possui 2 lados iguais.");
		}
		
		num1.close();
		num2.close();
		num3.close();
	}
}