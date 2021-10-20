package aula03;

import java.util.Scanner;

public class Atv_10_For_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner num1 = new Scanner(System.in);		
		int numprimo;
		int numdivisores = 0;
		
		System.out.print("Digite um número inteiro: ");
		numprimo = num1.nextInt();
		
		for(int i = 1; i <= numprimo; i++ ) {
			if(numprimo % i ==0 ) {
				numdivisores++;
			}
		} 	
		if(numdivisores == 2) {
			System.out.println("O número " + numprimo + " é primo.");
		} else {
			System.out.println("O número " + numprimo + " não é primo.");
		}
		num1.close(); 
		
    }	
}

