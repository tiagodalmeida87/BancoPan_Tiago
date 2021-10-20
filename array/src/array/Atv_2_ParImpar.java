/* 2. Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
125}; A. Retorne somente com números pares
B. Retorne somente com os números ímpares * 2.
*/

package array;

public class Atv_2_ParImpar {
	public static void main(String[] args) {

		int num[] = { 13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125 };

		System.out.println("Os números pares: ");
		for (int par : num) {
			if (par % 2 == 0) {
				System.out.print(par + " ");
			}
		}
		System.out.println("\n \nOs números ímpares e múltiplo de *2 : ");
		for (int imp : num) {
			if (imp % 2 == 1) {
				System.out.print(imp + " ");
				System.out.println(imp * 2 + " \n");
			}

		}

	}
}