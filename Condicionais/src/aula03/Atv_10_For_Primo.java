package aula03;

import java.util.Scanner;

public class Atv_10_For_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner num1 = new Scanner(System.in);		
		int numprimo;
		int numdivisores = 0;
		
		System.out.print("Digite um n�mero inteiro: ");
		numprimo = num1.nextInt();
		
		for(int i = 1; i <= numprimo; i++ ) {
			if(numprimo % i ==0 ) {
				numdivisores++;
			}
		} 	
		if(numdivisores == 2) {
			System.out.println("O n�mero " + numprimo + " � primo.");
		} else {
			System.out.println("O n�mero " + numprimo + " n�o � primo.");
		}
		num1.close(); 
		
    }	
}

