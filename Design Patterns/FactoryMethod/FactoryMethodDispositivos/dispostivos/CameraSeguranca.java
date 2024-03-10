package dispostivos;

public class CameraSeguranca implements Dispositivo {

	private Boolean estaLigada = false;
	
	@Override
	public CameraSeguranca iniciar() {
		// TODO Auto-generated method stub
		this.estaLigada = true;
		System.out.println("Inicializando a câmera de segurança...");
		return this;
	}
	
}
