package app2;

import java.util.ArrayList;
import java.util.List;

import modelo.Carro;

public class Principal {

	public static void main(String[] args) {
		// list é um collection

		List lista = new ArrayList();

		lista.add(10);
		lista.add("blah");

		for (Object obj : lista) {
			System.out.println(obj);
		}

		lista.set(0, true);// alterando valor na lista

		System.out.println("");
		for (Object obj : lista) {
			System.out.println(obj);
		}

		System.out.println("");
		System.out.println(lista.size()); // retorna a quantidade de itens na lista

		System.out.println(lista.isEmpty()); // retorna se a lista é vazia ou nao
		System.out.println("");

		List<String> lista2 = new ArrayList<String>();

		lista2.add("Leandra");
		lista2.add("Fredson");

		for (Object obj2 : lista2) {
			System.out.println(obj2);
		}

		lista2.set(0, "Marco");

		System.out.println("");
		for (Object obj2 : lista2) {
			System.out.println(obj2);
		}

		System.out.println("");
		System.out.println("Quantidade de itens na lista: " + lista.size()); // retorna a quantidade de itens na lista
		System.out.println("A Lista é vazia: " + lista.isEmpty()); // retorna se a lista é vazia ou nao
		System.out.println("Contains: " + lista2.contains("Fredson") + "\n"); // retorna se existe na lista

		List<Carro> listaC = new ArrayList<>();
		listaC.add(new Carro("Argo", "Fiat"));
		listaC.add(new Carro("Gol", "VW"));
		listaC.add(new Carro("Ka", "Ford"));
		listaC.add(new Carro("Ferrari", "Fiat"));

		listaC.toArray();

		int indice = listaC.indexOf(new Carro("Ka", "Ford"));

		Carro carro = listaC.get(indice);
		carro.setNome("New Fiesta");

		listaC.set(indice, carro);
		for (Carro car : listaC) {
			System.out.println();
		}
		System.out.println(listaC.contains(new Carro("Gol", "VW")));

	}

	public static void imprimir(List<String> lista) {

	}
}
