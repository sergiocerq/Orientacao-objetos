package entities;

import exceptions.ValorNegativoException;

public interface Acrescentar<T> {
	public void acrescentarValor (int valor) throws ValorNegativoException;
}
