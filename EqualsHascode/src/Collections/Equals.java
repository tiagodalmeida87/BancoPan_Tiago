package Collections;

public class Equals {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.nome = "Maria";
		c1.idade = 30;
		
		
		Cliente c2 = new Cliente();
		c2.nome = "Maria";
		c2.idade = 30;
		
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c1);
		
		System.out.println(c2.equals(c1));
		System.out.println(c1.equals(c2));
		
		
		
	}

}
