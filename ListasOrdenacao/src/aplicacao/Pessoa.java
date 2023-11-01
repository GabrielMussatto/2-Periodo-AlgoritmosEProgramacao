package aplicacao;

import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String cpf;
	private int idade;

	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	
	//Para ordernar em ordem decrescente é so inverter o o2 pelo o1
	public static void ordenarPorNome(List<Pessoa> listaP) {
		listaP.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	}

	public static void ordenarPorCpf(List<Pessoa> listaP) {
		listaP.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getCpf().compareTo(o2.getCpf());
			}
		});
	}

	public static void ordenarPorIdade(List<Pessoa> listaP) {
		listaP.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				Integer valor = o1.getIdade();
				return valor.compareTo(o2.getIdade());
			}
		});
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase());
		// toLowerCase() -> ele ordena em ordem alfabetica msm se a primeira letra
		// estiver minuscula

	}

}
