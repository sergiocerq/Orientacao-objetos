package entities;

public class Pessoa {

	private int id;
	private String nome;
	private double altura;
	private double peso;
	private double imc;
	
	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.imc = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public int getId() {
		return this.id;
	}
	public double calculaIMC() {
		this.setImc(this.getPeso() / Math.pow(altura, 2));
		return this.imc;
	}
	
}