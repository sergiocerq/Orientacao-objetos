package entities;

public class Corrida {
	private String local;
	private int numeroVoltas;
	private double kms;
	private Equipe ferrari;
	public Corrida (String local, int voltas, double kms) {
		this.local = local;
		this.numeroVoltas = voltas;
		this.kms = kms;
		this.ferrari = new Equipe();
	}
	public String getLocal() {
		return local;
	}
	
	public int getNumeroVoltas() {
		return numeroVoltas;
	}
	
	public double getKms() {
		return kms;
	}
	
	public Equipe getFerrari() {
		return ferrari;
	}
	
}