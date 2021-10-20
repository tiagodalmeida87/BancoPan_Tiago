package heranca;

public class Animal {

	private int peso;
	private int membros;
	private String porte;
	private boolean comunicar;
	private boolean movimentar;
	
	
	public Animal(boolean comunicar, boolean movimentar) {
		
		this.comunicar = false;
		this.movimentar = false;
	}

	public boolean getComunicar() {
		return comunicar;
	}

	public void setComunicar(boolean comunicar) {
		this.comunicar = comunicar;
	}

	public boolean getMovimentar() {
		return movimentar;
	}

	public void setMovimentar(boolean movimentar) {
		this.movimentar = movimentar;
	}
	
	
}
