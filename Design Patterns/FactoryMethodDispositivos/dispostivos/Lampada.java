package dispostivos;

public class Lampada implements Dispositivo {

	private Boolean lampadaLigada = false;
	
	public Lampada() {
		
	}
	
	@Override
	public Lampada iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando a lâmpada...");
		this.lampadaLigada = true;
		return this;
	}
	
	public void desligarLampada() {
		this.lampadaLigada = false;
	}

}