package entities;

public class Temperatura {
	
	private Double valorTemperatura;
	
	public Temperatura(Double valorInicial) {
		this.valorTemperatura = valorInicial;
	}
	
	public Double getTemperatura() {
		return this.valorTemperatura;
	}
	
	public void setTemperatura(Double valorNovo) {
		this.valorTemperatura = valorNovo;
	}

}
