package aula01;
//1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor. Conseguem criar mais de uma solu��o?

import java.util.Scanner;

public class atv_1_TresInteiros {

	public static void main(String[] args) {
		
		System.out.println("Digite o 1� n�mero: ");
		Scanner num1 = new Scanner(System.in);		
		int n1 = num1.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		Scanner num2 = new Scanner(System.in);		
		int n2 = num2.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		Scanner num3 = new Scanner(System.in);		
		int n3 = num3.nextInt();
		
		num1.close();
		num2.close();
		num3.close();
		
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero � n1: " + n1);
		} 
		 if (n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero � n2: " + n2);		
		} 
		 if (n3 > n1 && n3 > n2) {
			System.out.println("O maior n�mero � n3: " + n3);
		}
		 if (n1 < n2 && n1 < n3) {
			System.out.println("O menor n�mero � n1: " + n1);
		}  
		 if (n2 < n1 && n2 < n3) {
			System.out.println("O menor n�mero � n2: " + n2);
		}
		 if (n3 < n1 && n3 < n1) {
			System.out.println("O menor n�mero � n3: " + n3);
		}
		 else if (n1 == n2 && n2 == n3 && n1 == n3) {
			 System.out.println("Os n�meros s�o iguais.");
		 }

	}

}
