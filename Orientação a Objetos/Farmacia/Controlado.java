package entities;

public class Controlado extends Medicamento {
	private double minimo;
	public Controlado() {
		super();
		this.minimo = super.getQtd() * 0.2;
	}

	private void calculaMinimo() {
		this.minimo = super.getQtd() * 0.2;
	}
	
	public void devolver(int qtd) {
		super.setQtd(super.getQtd() + qtd);
	}
	public void venda(int qtd) throws NaoPodeVenderException {
		if(super.getQtd() - qtd > this.minimo) {
			super.setQtd(super.getQtd() - qtd);
		} else {
			throw new NaoPodeVenderException();
		}
	}
}
