/*1. Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
A. Retorno o valor total da soma de todos os elementos com foreach
B. Retorne a média de todos os elementos
C. Retorne o maior valor e o menor elemento
*/

package array;

import java.util.Arrays;

public class AulaArray {

	public static void main(String[] args) {

		int num[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		int qtdnum = num.length;
		int soma = 0;
		
		for(int i = 0; i< num.length; i++) {
			soma += num[i];
		}
		//Resposta (A)
		System.out.println("A) A soma de todos elementos: " + soma);
		
		//Resposta (B)
		System.out.println("B) A média de todos elementos: " + soma/qtdnum);

		Arrays.sort(num);
		int maior=num[9];
		int menor=num[0];
		
		//Resposta (C)
		System.out.println("C) O maior valor do Array é: " + maior + "\n   O menor valor do Array é: " + menor );
	}

}