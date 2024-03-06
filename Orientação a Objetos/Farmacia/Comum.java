package entities;

public class Comum extends Medicamento {
	
	public Comum() {
		super();
	}
	
	public void vendaComum(int qtd) throws NaoPodeVenderException {
		if(super.getQtd() - qtd > 0 && super.getPreco() >= 2.50) {
			super.setQtd(super.getQtd() - qtd);
		} else if(super.getQtd() - qtd - 2 > 0 && super.getPreco() >= 2.50) {
			super.setQtd(super.getQtd() - qtd - 2);
		} else {
			throw new NaoPodeVenderException();
		}
	}
}
