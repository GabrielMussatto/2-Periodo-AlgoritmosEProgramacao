package modelo;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [getCpf()=" + getCpf() + ", getNome()=" + getNome() + "]";
	}
	
	//esta fazendo uma sobrescita do metodo imprimir da classe pai
	//@Override
	public void imprimir() {
		System.out.println(this);
	}
}
