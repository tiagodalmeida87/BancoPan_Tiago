package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Diferenca quando a vila estiver cheia
		System.out.println(fila.add("Joao"));
		System.out.println(fila.add("Joao"));
		fila.offer("Maria"); //metodo para add, retorna true ou false
		fila.add("Gil");
		fila.offer("Daniela");
		fila.add("Jose");
		fila.offer("Mario");
		System.out.println(fila);
		
		System.out.println(fila.peek()); // retornar o primeiro elemento, sem remover, se vazia retorna null
		System.out.println(fila.element());//retorna o primeiro elemento, se vazia retorna excecao
		//diferenca no retorno quando a fila estiver vazia

		System.out.println(fila.poll()); // remove e retorna o proximo elemento, se vazia retorna null
		System.out.println(fila);
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // remove e retona o elemento removido, se vazia retorna exception 
		
		System.out.println(fila);
		
		
		System.out.println(fila.isEmpty()); //verificar se esta vazia
	}

}
