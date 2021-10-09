
public class impostoRenda {

	public static void main(String[] args) {
		double salario = 3900.0;
		if (salario < 2500.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350,00.");
		} 
		else if (salario >= 2500 && salario <= 3800) {
			System.out.println("A sua aliquota é de 18%");
			System.out.println("Você pode deduzir até R$ 500,00.");			
		}
		else {
			System.out.println("A sua aliquota é de 23%");
			System.out.println("Você pode deduzir até R$ 630,00.");
		}
	}

}
