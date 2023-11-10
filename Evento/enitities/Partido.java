package enitities;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	private List<Pessoa> lista;
	private double saldo;
	
	public Partido() {
		this.saldo = 0;
		lista = new ArrayList<Pessoa>();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double novoSaldo) {
		this.saldo += novoSaldo;
	}
	
	public double depositaConvencao() {
		double valor = 0;
		if (this.getSaldo() <= 100000) {
			valor = (this.getSaldo() * 0.15);
			this.setSaldo(this.getSaldo() - (this.getSaldo() * 0.15));
		} else if (this.getSaldo() > 100000) {
			valor = (this.getSaldo() * 0.18);
			this.setSaldo(this.getSaldo() - (this.getSaldo() * 0.18));
		}
		return valor;
	}
	
	public void depositaPessoa(Pessoa p) {
		lista.add(p);
		setSaldo(p.getSaldo());
	}
	
	public double getArrecadacao() {
		return this.getSaldo();
	}
	

}
