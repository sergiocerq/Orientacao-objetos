package entities;

import java.util.ArrayList;

public class Torneio {
	private ArrayList <Partida> rodada1;
	private ArrayList <Partida> rodada2;
	private ArrayList <Jogador> jogadores;

	public Torneio() {
		this.rodada1 = new ArrayList();
		this.rodada2 = new ArrayList();
		this.jogadores = new ArrayList();
	}
	
	public Jogador getVencedorTorneio() {
		Jogador vencedor = new Jogador();
		for(Jogador jog: jogadores) {
			if(jog.getPontos() > vencedor.getPontos()) {
				vencedor = jog;
			}
		}
		return vencedor;
	}
	
	



}
