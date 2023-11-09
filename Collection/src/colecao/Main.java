package colecao;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> listaPessoas = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			listaPessoas.add(Pessoa.cadastrar());
		}

		System.out.println("\nImprimindo todos os dados da lista:");
		Pessoa.imprimirTudo(listaPessoas);

		// Remover todas as pessoas do sexo masculino
		listaPessoas.removeIf(pessoa -> pessoa.getSexo() == Sexo.MASCULINO);

		System.out.println("\nApós remover as pessoas do sexo masculino:");
		Pessoa.imprimirTudo(listaPessoas);

	}

}