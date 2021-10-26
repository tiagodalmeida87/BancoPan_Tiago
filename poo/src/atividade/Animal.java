package atividade;

public class Animal {

	private String tipoAnimal;
	private String sexo;
	private boolean vertebrado;
	private int qtdPatas;

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getTipoAnimal() {
		return this.tipoAnimal;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setVertebrado(boolean vertebrado) {
		this.vertebrado = vertebrado;
	}

	public boolean getVertebrado() {
		return vertebrado;
	}

	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public int getQtdPatas() {
		return qtdPatas;
	}

	public void comunicar() {
		System.out.println("Comunição generica");
	}

	public void movimentar() {
		System.out.println("Se movimenta para todos os lados");
	}
}
