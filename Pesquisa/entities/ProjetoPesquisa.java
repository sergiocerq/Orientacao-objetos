package entities;

import java.util.ArrayList;

import exception.PesquisadorInvalidoException;

public class ProjetoPesquisa {

	private int qtdPesquisadores;
	private ArrayList<Pesquisador> pesquisadores;
	
	public ProjetoPesquisa() {
		this.qtdPesquisadores = 0;
		this.pesquisadores = new ArrayList();
	}
	
	public void inserirPesquisador(Pesquisador p) throws PesquisadorInvalidoException {
		if(p) {
			pesquisadores.add(p);
		} else {
			throw new PesquisadorInvalidoException();
		}
	}
	
	public int getQtdPesquisadores() {
		return this.qtdPesquisadores;
	}
	
	public double valorPagar() {
	    double valor = 0;
	    
	    for(Pesquisador pesquisador : pesquisadores) {
	        if(pesquisador instanceof Coordenador) {
	            valor += pesquisador.getQuantidade() * 0.025 + 300;
	        } else {
	            Coordenador coordenador = pesquisador.getCoordenador();
	            valor += 200 + (300 - coordenador.getQuantidade() * 0.25);
	        }
	    }
	    return valor;
	}

 }
