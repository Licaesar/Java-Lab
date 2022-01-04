package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// adicionando elementos na lista
		list.add("Maria");
		list.add("João");
		list.add("Calos");
		list.add("Jose");
		
		// Inserindo novo elemento entre os elemntos
		list.add(2, "Pedro");
		
		// Ver o tamanho da lista
		System.out.println(list.size());
		
		// Removendo da lista
		list.remove(1);
		
		// Removendo via predicado, por exemplo todos os que começam com letra M
		list.removeIf(x -> x.charAt(0) == 'M'); // Função lambda
		
		// Localizar a posição do elemento
		System.out.println("Index of Jose:" + list.indexOf("Jose"));
		
		for (String lista : list) {
			System.out.println(lista);
		}

	}

}
