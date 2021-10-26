package Collections;

import java.util.ArrayList;

public class CollectionList {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		
		Usuario u1 = new Usuario("Maria");
		
		lista.add(u1);
		
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Isabel"));
		lista.add(new Usuario("Pedro"));
		// 0      1     2       3
//		[maria, joao, isabel, 
				
		// percorrer a lista
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		// pegar o elemento em determinado index
		System.out.println(lista.get(3).nome);
		System.out.println(lista.get(2));
		
		//remover por index
		
		System.out.println(lista.remove(3).nome);//remove o objeto excluido
		
		//verificar se existe
		System.out.println(lista.contains(new Usuario("Isabel")));
		
		
		for(Usuario u: lista) {
			
			System.out.println(u.comprimentar() + u);
		}
		
	}

}
