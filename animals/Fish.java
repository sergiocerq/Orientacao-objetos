package animals;

public class Fish extends Animal{
	private String characteristics;
	
	public Fish() {
		super();
		this.characteristics = "Has a fin and tail";
		this.setEnvironment("Sea");
		this.setColor("Dark gray");
		this.setPaws(0);
	}
	
	public String getCharacteristics() {
		return "characteristics" + this.characteristics;
	}
}