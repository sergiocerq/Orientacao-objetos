package animals;

public class Teste {
	public static void main(String args[]) {
		Animal camel = new Animal();
		camel.setName("Camel");
		camel.setLength(150);
		camel.setPaws(4);
		camel.setColor("Yellow");
		camel.setEnvironment("Earth");
		camel.setSpeed(2.0);
		System.out.println(camel.getFullData() + "\n\n");
		
		Fish shark = new Fish();
		shark.setName("Shark");
		shark.setLength(300);
		shark.setSpeed(1.5);
		System.out.println(shark.getFullData());
		System.out.println(shark.getCharacteristics() + "\n\n");
		
		Mammal bear = new Mammal();
		bear.setName("Canadian bear");
		bear.setLength(180);
		bear.setPaws(4);
		bear.setColor("Red");
		bear.setSpeed(0.5);
		bear.setFavoriteFood("Honey");
		System.out.println(bear.getFullData());
		System.out.println(bear.getFavoriteFood());
		
	}
}