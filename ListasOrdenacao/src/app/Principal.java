package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import aplicacao.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("B");
		lista.add("A");
		lista.add("d");
		lista.add("E");
		lista.add("C");		
	
		for (String valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		//ordenando
		Collections.sort(lista);  //ordena os valores da lista, se a letra começar com letra minuscula ele manda pro final da lista pois segue o valor da Tabela ASCII
		for (String valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		List<Integer> listaN = new ArrayList<>();
		
		listaN.add(4);
		listaN.add(1);
		listaN.add(5);
		listaN.add(2);
		listaN.add(3);		
		
		for (Integer valor : listaN) {
			System.out.println(valor);
		}
		System.out.println();
		
		//ordenando
		Collections.sort(listaN);  //ordena os valores da lista, seguindo o valor da Tabela ASCII
		for (Integer valor : listaN) {
			System.out.println(valor);
		}
		System.out.println();
		
		
		List<Pessoa> listaP = new ArrayList<>();
		
		listaP.add(new Pessoa("222" , "Leandra" , 30));
		listaP.add(new Pessoa("111" , "Marco" , 35));
		listaP.add(new Pessoa("555" , "Jocivan" , 32));
		listaP.add(new Pessoa("444" , "Fredson" , 28));
		listaP.add(new Pessoa("333" , "Carlos", 31));
		
		for (Pessoa valor : listaP) {
			System.out.println(valor);
		}
		System.out.println();
		
		System.out.println("Ordenando por CPF");
		
		//ordenando por cpf
//		listaP.sort(new Comparator <Pessoa>() {
//			@Override
//			public int compare(Pessoa o1, Pessoa o2) {
//				return o1.getCpf().compareTo(o2.getCpf());
//			}
//		});
		
		Pessoa.ordenarPorCpf(listaP);
		
		for (Pessoa valor : listaP) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		System.out.println("Ordenando por Nome");
		
		//ordenando por nome
//		listaP.sort(new Comparator <Pessoa>() {
//			@Override
//			public int compare(Pessoa o1, Pessoa o2) {
//				return o1.getNome().compareTo(o2.getNome());
//			}
//		});
		
//		Pessoa.ordenarPorNome(listaP);
		
		// EXPRESSÃO LAMBDA parametro -> codigo
		//listaP.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		
//		for (Pessoa valor : listaP) {
//			System.out.println(valor);
//		}

		//impressao
		//listaP.forEach(p -> System.out.println(p));
		
		//filtrando por idade
		listaP.stream()
			.filter(p -> p.getIdade() > 30)
				.sorted((p1, p2) -> {
					Integer valor = p1.getIdade();
					return valor.compareTo(p2.getIdade());
				})
					.forEach(p -> System.out.println(p));
		
		System.out.println();
		listaP.parallelStream()
		
			.limit(3).forEach(p -> System.out.println(p));
		
		System.out.println();
		
		System.out.println("Ordenando por Idade");
		//ordenando por idade
		
		Pessoa.ordenarPorIdade(listaP);
		
		for (Pessoa valor : listaP) {
			System.out.println(valor);
		}
		
	}
}
