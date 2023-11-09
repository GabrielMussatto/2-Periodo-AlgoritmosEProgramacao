package modelo;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [getCnpj()=" + getCnpj() + ", getNome()=" + getNome() + "]";
	}

//	@Override
	public void imprimir() {
		System.out.println(this);
		
	}
}
