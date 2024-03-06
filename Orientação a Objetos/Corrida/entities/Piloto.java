package entities;

import exceptions.ValoresInvalidosException;

public class Piloto {
	private String nome;
	private int numeroVoltas;
	private int voltaMaisRapida;
	private int tempoCorrida;
	public Piloto(String nome, int numeroVoltas, int voltaMaisRapida, int tempoCorrida)throws ValoresInvalidosException {
		if(numeroVoltas > 0 && voltaMaisRapida > 0 && tempoCorrida > 0) {
			this.nome = nome;
			this.numeroVoltas = numeroVoltas;
			this.voltaMaisRapida = voltaMaisRapida;
			this.tempoCorrida = tempoCorrida;
		} else {
			throw new ValoresInvalidosException();
		}
	}
	
	public Piloto() {
	}

	public String getNome() {
		return nome;
	}
	
	public int getNumeroVoltas() {
		return numeroVoltas;
	}
	
	public int getVoltaMaisRapida() {
		return voltaMaisRapida;
	}
	
	public int getTempoCorrida() {
		return tempoCorrida;
	}

	public double calculaVelocidadeMedia (double kms) throws ValoresInvalidosException {
		double velocidade = 0;
		if(kms > 0) {
			velocidade = this.getTempoCorrida() / (kms / 360);
		} else {
			throw new ValoresInvalidosException();
		}
		
		return velocidade;
	}

	public String toString() {
		return "Piloto: nome=" + nome + " Numero de voltas=" + numeroVoltas + " Volta mais rapida=" + voltaMaisRapida
				+ " Tempo corrida=" + tempoCorrida;
	}
	
	
	
}
