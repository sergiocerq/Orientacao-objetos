package entities;

public class Pesquisador {
	
	private int quantidade;
	private Coordenador coordenador;
	
	public Pesquisador() {
		this.quantidade = 0;
		this.coordenador = new Coordenador();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

}