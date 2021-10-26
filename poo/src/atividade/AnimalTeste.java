package atividade;

public class AnimalTeste {

	public static void main(String[] args) {
		Ave azulao = new Ave();
		Mamifero siames = new Mamifero();

		System.out.println("Informações do animal 1:");
		System.out.println(azulao.getTipoAnimal());
		azulao.setCor("Azul");
		System.out.println("Cor da Ave: " + azulao.getCor());
		azulao.setQtdPatas(2);
		azulao.comunicar();
		azulao.movimentar();

		System.out.println("\nInformações do animal 2:");
		System.out.println(siames.getTipoAnimal());
		siames.setPorte("pequeno");
		System.out.println("Tamanho: " + siames.getPorte());
		siames.setQtdPatas(4);
		siames.comunicar();
		siames.movimentar();

	}
}