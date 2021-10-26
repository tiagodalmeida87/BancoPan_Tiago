package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mapaUsuarios = new HashMap<Integer, String>();
		
		//metodo para adicionar ou SUBSTITUIR elementos
		mapaUsuarios.put(1, "Valeria");
		System.out.println(mapaUsuarios);
		mapaUsuarios.put(1, "Ana");
		mapaUsuarios.put(1, "Maria");
		mapaUsuarios.put(2, "Maria");
		System.out.println(mapaUsuarios);
		
		System.out.println(mapaUsuarios.size());
		
		mapaUsuarios.put(3, "Joao");
		mapaUsuarios.put(4, "Geovana");
		mapaUsuarios.put(5, "Carlos");
		mapaUsuarios.put(6, "Luciana");
		
		//retorna as chaves presentes
		System.out.println(mapaUsuarios.keySet());
		
		//retorna os valores presentes
		System.out.println(mapaUsuarios.values());
		
		//retorna as chaves e os valores
		System.out.println(mapaUsuarios.entrySet());
		
		// retornar objeto especifico a partir da chave
		System.out.println(mapaUsuarios.get(6));
		
		//exclui a partir da chave
		System.out.println(mapaUsuarios.remove(1));
		System.out.println(mapaUsuarios);
		
		//Percorre atraves da chave
		for(int chave: mapaUsuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: mapaUsuarios.values()) {
			System.out.println(valor);
		}
		
		// percorrer atraves das chaves E valores **java.util.Map.Entry 
		for(Entry<Integer, String> usuario : mapaUsuarios.entrySet()) {
			System.out.println(usuario.getKey());
			System.out.println(usuario.getValue());
		}
		
		
	}

}
