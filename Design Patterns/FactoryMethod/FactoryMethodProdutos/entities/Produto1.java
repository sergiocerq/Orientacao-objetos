package entities;

public class Produto1 implements Product {
	
	private String nome;
	
	public Produto1(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
