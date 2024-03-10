package dispostivos;

import entities.Temperatura;

public class Termostato implements Dispositivo {

	private Temperatura temperatura;
	
	public Termostato() {
	}
	
	@Override
	public Termostato iniciar() {
		this.temperatura = new Temperatura(20.0);
		System.out.println("Ligando o termostato na temperatura " + this.temperatura.getTemperatura());
		return this;
	}
	
	public void regularTemperatura(Double valor) {
		this.temperatura.setTemperatura(valor);
	}

}
