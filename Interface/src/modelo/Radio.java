package modelo;

public class Radio implements InterRadio {
	private Float estacao;
	private boolean ligado;

	public Float getEstacao() {
		return estacao;
	}

	public void setEstacao(Float estacao) {
		this.estacao = estacao;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mudarEstacao(Float valor) {
		// TODO Auto-generated method stub

	}

}
