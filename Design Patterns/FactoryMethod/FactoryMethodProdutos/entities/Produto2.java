package entities;

public class Produto2 implements Product {

	private String nome;
	
	public Produto2(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
 
}
