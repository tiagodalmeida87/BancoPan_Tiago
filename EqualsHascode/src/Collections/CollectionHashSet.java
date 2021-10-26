package Collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {

	public static void main(String[] args) {

		HashSet<Comparable> conjunto = new HashSet<Comparable>();
		// metodo para adicionar
		conjunto.add("Joao");
		conjunto.add(true);
		conjunto.add('j');
		conjunto.add(1);
		conjunto.add(123);
		conjunto.add(123.4);

		// metodo para verificar o tamanho
		System.out.println(conjunto.size()); // 6

		conjunto.add("Joao");// nao deve inserir
		conjunto.add("Maria");
		System.out.println(conjunto);
		System.out.println(conjunto.size()); // 7

		// metodo para remover
		System.out.println(conjunto.remove("Joao")); // retorna true ou false // true
		System.out.println(conjunto.remove("Joao")); // false

		System.out.println(conjunto.size()); // 6

		// metodo para verificar se existe
		System.out.println(conjunto.contains("Joao")); // false
		System.out.println(conjunto.contains("Joao")); // false

		Set<Integer> numeros = new HashSet<>();
//		TreeSet<Integer> numeros = new TreeSet<>(); // mantem a ordem de inclusao por tadao
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		// metodo para unir conjuntos
		conjunto.addAll(numeros);
		System.out.println("Unidos: " + conjunto);

		System.out.println(conjunto);
		System.out.println(numeros);

		// metodo para intersecao
		conjunto.retainAll(numeros);
		System.out.println(conjunto);

		// metodo para limpar
		conjunto.clear();
		System.out.println(conjunto);

	}

}
