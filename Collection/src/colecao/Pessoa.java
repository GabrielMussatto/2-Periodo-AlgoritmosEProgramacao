package colecao;

import java.util.List;
import java.util.Scanner;

public class Pessoa {

	private String nome;
	private String cpf;
	private Sexo sexo;

	public Pessoa(String nome, String cpf, Sexo sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Pessoa() {

	}

	public static Pessoa cadastrar() {
		Pessoa pessoa = new Pessoa();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		pessoa.setNome(scanner.nextLine());
		System.out.print("Informe o CPF: ");
		pessoa.setCpf(scanner.nextLine());
		
		// Aqui eu to armazendo um dado do tipo Enum
		System.out.print("Sexo (MASCULINO ou FEMININO): ");
		String sexoInput = scanner.nextLine();
		pessoa.setSexo(Sexo.valueOf(sexoInput.toUpperCase()));

		return pessoa;

	}

	public static void imprimirTudo(List<Pessoa> lista) {
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

	// Sobrescrever o método toString para imprimir os dados da pessoa
	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Sexo: " + sexo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}