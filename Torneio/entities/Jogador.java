package entities;

import exceptions.PontosNegativosException;
import exceptions.PartidasNegativasException;

public class Jogador {
	
	private int pontos;
	private int partidas;
	
	public Jogador() {
		this.pontos = 0;
		this.partidas = 0;
	}
	
	public void addPontos(int valor) throws PontosNegativosException {
		if(valor > 0) {
			this.pontos += valor;
		} else {
			throw new PontosNegativosException();
		}
	}
	
	public void addPartidas (int valor) throws PartidasNegativasException {
		if(valor > 0) {
			this.partidas += valor;
		} else {
			throw new PartidasNegativasException();
		}
	}

	public int getPontos() {
		return pontos;
	}

	public int getPartidas() {
		return partidas;
	}

	public String toString() {
		return "Jogador pontos=" + pontos + " partidas=" + partidas;
	}

}
