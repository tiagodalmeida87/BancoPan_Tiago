
public class impostoRenda {

	public static void main(String[] args) {
		double salario = 3900.0;
		if (salario < 2500.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350,00.");
		} 
		else if (salario >= 2500 && salario <= 3800) {
			System.out.println("A sua aliquota � de 18%");
			System.out.println("Voc� pode deduzir at� R$ 500,00.");			
		}
		else {
			System.out.println("A sua aliquota � de 23%");
			System.out.println("Voc� pode deduzir at� R$ 630,00.");
		}
	}

}
