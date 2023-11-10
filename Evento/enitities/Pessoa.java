package enitities;

public class Pessoa {
	
	private double saldo;
	private int id;
	private String nome;
	
	public Pessoa() {
		this.saldo = 0;
	}
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.saldo = 0;
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double sacaSaldo() {
		return this.getSaldo();
	}
	
	private void setSaldo(double value) {
		this.saldo = 0;		
	}

}
