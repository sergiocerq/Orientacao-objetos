package entities;

import exceptions.ValoresInvalidosException;

public class Equipe {
	private Piloto p1;
	private Piloto p2;
	
	public Equipe() {
		this.p1 = new Piloto();
		this.p2 = new Piloto();
	}
	
	public String mostraResultado(double kms) throws ValoresInvalidosException {
		if(p1.calculaVelocidadeMedia(kms) > p2.calculaVelocidadeMedia(kms)) {
			return p1.toString();
		} else if(p2.calculaVelocidadeMedia(kms) > p1.calculaVelocidadeMedia(kms)) {
			return p2.toString();
		} else {
			return "Empate";
		}
	}
}
