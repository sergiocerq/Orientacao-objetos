package entities;

public class Game {
	
	public void run() {
	   Level nivel1= new Level1();
	   nivel1.addPlugin(new Turbo());
	   Level nivel2 = new Level2();
	   nivel2.addPlugin(new Velocidade());
	   
	   System.out.println("Nivel 1: " + nivel1.toString());
	   System.out.println("Nivel 2: " + nivel2.toString());
	}
	
	public static void main(String args[]) {
		(new Game()).run();
	}

}
