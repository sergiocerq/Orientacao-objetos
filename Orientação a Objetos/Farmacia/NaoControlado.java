package entities;

public class NaoControlado extends Medicamento {
	
	public NaoControlado() {
		super();
	}
	
	public void venderNaoControlado(int qtd) throws NaoPodeVenderException {
		if(super.getQtd() >= 0) {
			super.setQtd(super.getQtd() - qtd);
		} else {
			throw new NaoPodeVenderException();
		}
	}

}