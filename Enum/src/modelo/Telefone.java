package modelo;

public class Telefone {
	
//	public static final int AZUL = 10;    CONSTANTE DE CLASSE
	
	private Integer id;
	private String nome;
	private Cor cor; //agregação e muitos para um
	
	public Telefone() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", nome=" + nome + ", cor=" + cor + "]";
	}

	
}
