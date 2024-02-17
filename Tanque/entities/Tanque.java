package entities;

import exceptions.ValorNegativoException;

public class Tanque implements Acrescentar {
	private int qtdLitros;
	private int id;
	private int qtdAcionamentos;
	
	public Tanque() {
		this.qtdLitros = 0;
		this.qtdAcionamentos = 0;
	}
	
	public Tanque(int qtdLitros, int id, int qtdAcionamentos) {
		super();
		this.qtdLitros = qtdLitros;
		this.id = id;
		this.qtdAcionamentos = qtdAcionamentos;
	}

	private void escoar() {
		this.qtdLitros -= this.qtdLitros * 0.10;
	}

	public int getQtdLitros() {
		return qtdLitros;
	}

	public int getQtdAcionamentos() {
		return qtdAcionamentos;
	}

	public int getId() {
		return id;
	}

	public void setQtdLitros(int qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public void setQtdAcionamentos(int qtdAcionamentos) {
		this.qtdAcionamentos += qtdAcionamentos;
	}

	public void acrescentarValor(int valor) throws ValorNegativoException {
		if(valor > 0 && valor <= 100000) {
			if(this.getQtdLitros() + valor <= 100000) {
				this.setQtdLitros(this.getQtdLitros() + valor);
			} else {
				this.escoar();
				this.acrescentarValor(valor);
				this.setQtdAcionamentos(1);
			}
		}
		
	}
	
	
}
