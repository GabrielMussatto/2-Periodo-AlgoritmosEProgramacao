package modelo;

public enum Cor {
	PRETA(3, "Preta"),
	AZUL(1, "Azul"),
	BRANCA(2, "Branca");
	
	private final int id;
	private final String descricao;
	
	//ele ja é privado, por isso nao se coloca public ou private
	private Cor(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Cor valueOf(Integer id) {
		for (Cor cor : Cor.values()) {
			if(cor.getId() == id) {
				return cor;
			}
		}
		return null;
	}

//	@Override
//	private final int ordinal() {
//		return 1;
//	}  

}
