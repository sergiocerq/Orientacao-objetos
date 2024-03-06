package entities;
import exceptions.RodadaInvalidaException;

public class Partida {
	
	private Jogador jog1;
	private Jogador jog2;
	
	private String placar;
	private int rodada;
	
	public Partida() {
		this.jog1 = new Jogador();
		this.jog2 = new Jogador();
		this.placar = "0x0";
		this.rodada = 0;
	}
	
	public String getPlacar() {
		return placar;
	}

	public void setPlacar(int placarJogador1, int placarJogador2) {
		this.placar = placarJogador1 + "x" + placarJogador2;
	}

	public void setRodada(int valor) throws RodadaInvalidaException {
		if(valor > 0) {
			this.rodada = valor;
		} else {
			throw new RodadaInvalidaException();
		}
	}

	public String getJogadores() {
		return "Jogadores: " + this.jog1 + " " +this.jog2;
	}

	public void setJog2(Jogador jog2) {
		this.jog2 = jog2;
	}

	public void setJog1(Jogador jog1) {
		this.jog1 = jog1;
	}
	
	public Jogador getVencedorPartida() {
		int placarJogador1 = Integer.parseInt(placar.substring(0, placar.indexOf('x')));
	    int placarJogador2 = Integer.parseInt(placar.substring(placar.indexOf('x') + 1));

		if(placarJogador1 > placarJogador2) {
			if(this.rodada == 1) {
				jog1.addPontos(15);
			} else {
				jog1.addPontos(20);
			}
			return jog1;
		} else {
			if(this.rodada == 1) {
				jog2.addPontos(15);
			} else {
				jog2.addPontos(20);
			}
			return jog2;
		}
	}

	@Override
	public String toString() {
		int placarJogador1 = Integer.parseInt(placar.substring(0, placar.indexOf('x')));
	    int placarJogador2 = Integer.parseInt(placar.substring(placar.indexOf('x') + 1));

		return "Partida: " + placarJogador1 + "x" + placarJogador2;
	}
	
	
}
