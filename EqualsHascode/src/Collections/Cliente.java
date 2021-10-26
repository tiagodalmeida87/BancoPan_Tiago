package Collections;

public class Cliente {
	
	public String nome;
	public int idade;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Cliente) {
			Cliente outro = (Cliente) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean idadeIgual = outro.idade == this.idade;
			return nomeIgual && idadeIgual;
		} else {
			return false; 
		}
	}
}
