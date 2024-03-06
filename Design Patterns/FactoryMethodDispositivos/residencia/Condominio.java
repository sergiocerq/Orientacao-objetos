package residencia;

import java.util.ArrayList;
import java.util.List;

import dispostivos.*;

public class Condominio implements Residencia {

	private List<Dispositivo> listaDispositivos;
	
	public Condominio () {
		this.listaDispositivos = new ArrayList();
	}
	
	@Override
	public void adicionaDispositivo(Dispositivo dispositivo) {
		// TODO Auto-generated method stub
		listaDispositivos.add(dispositivo);
	}
	
	public void run () {
		Dispositivo camera = new CameraSeguranca();
		Dispositivo lampada = new Lampada();
		Dispositivo termostato = new Termostato();
		
		this.adicionaDispositivo(camera);
		this.adicionaDispositivo(lampada);
		this.adicionaDispositivo(termostato);
		
		for(Dispositivo dispositivo : listaDispositivos) {
			dispositivo.iniciar();
		}
	}
	
	public static void main(String args[]) {
		(new Condominio()).run();
	}

}
