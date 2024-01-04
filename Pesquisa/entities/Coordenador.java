package entities;

public class Coordenador extends Pesquisador {
	private String nome;
	
	public Coordenador() {
		super();
		this.nome = "Sem nome";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}