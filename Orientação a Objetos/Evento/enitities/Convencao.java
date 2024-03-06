package enitities;

public class Convencao {
	
	private Partido ruy;
	private Partido barbosa;
	private double gastos;
	
	public Convencao() {
		ruy = new Partido();
		barbosa = new Partido();
		gastos = -20000;
	}
	
	private void setGastos(double valor) {
		this.gastos += valor;
	}
	
	public double getGastos() {
		return this.gastos;
	}
	
	public double getArrecadacaoPartido() {
		return ruy.getArrecadacao() + barbosa.getArrecadacao();
	}
	
	public boolean getGastoOuLucro() {
		if(ruy.depositaConvencao() + barbosa.depositaConvencao() > this.getGastos()) {
			return true;
		}
		return false;
	}
}