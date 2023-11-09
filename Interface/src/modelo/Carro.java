package modelo;

import java.util.Objects;

public class Carro {
	private String nome;
	private String marca;

	public Carro(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
