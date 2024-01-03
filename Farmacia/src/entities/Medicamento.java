package entities;

public class Medicamento {
	
	private int qtd;
	private double preco;
	private String codigo;
	
	public Medicamento() {
		this.qtd = 0;
		this.preco = 0;
		this.codigo = "Sem codigo";
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
