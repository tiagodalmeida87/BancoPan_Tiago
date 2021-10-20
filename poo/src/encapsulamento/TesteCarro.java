package encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		//c1.cor = "Prata";
		//System.out.println(c1.cor);
		
		//c1.setPlaca("ABC-5000");
		//System.out.println(c1.getPlaca());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.getVelocidade());
		
		
		//Carro c2 = new Carro();
		//c2.setPlaca("JAP-1789");
		//System.out.println(c2.getPlaca());
	}

}
