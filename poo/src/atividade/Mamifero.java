package atividade;

public class Mamifero extends Animal {

	private String porte;

	public Mamifero() {
		this.setTipoAnimal("Gato");
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public String getPorte() {
		return porte;
	}

	@Override
	public void comunicar() {

		System.out.println("Miau Miau");
	}

	@Override
	public void movimentar() {
		super.movimentar();

		System.out.println("Deita e dormi");
	}
}
