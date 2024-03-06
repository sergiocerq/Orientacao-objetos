package entities;

import exceptions.ValorNegativoException;

public class Sistema {
	
	private Tanque tanque1;
	private Tanque tanque2;
	
	public Sistema() {
		this.tanque1 = new Tanque();
		this.tanque2 = new Tanque();
	}
	
	public void acrescentarValor(Tanque t, int valor) throws ValorNegativoException {
		if(valor > 0 && valor <= 100000) {
			t.acrescentarValor(valor);
		} else {
			throw new ValorNegativoException();
		}
	}

}
