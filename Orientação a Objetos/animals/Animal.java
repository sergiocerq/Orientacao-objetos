package animals;

public class Animal {
	private String name;
	private int length;
	private int paws;
	private String color;
	private String environment;
	private double speed;
	
	public Animal() {
		name = "Without name";
		length = 0;
		paws = 0;
		color = "Undefined";
		environment = "Undefined";
		speed = 0;
	}

	public Animal(String name, int length, int paws, String color, String environment, double speed) {
		super();
		this.name = name;
		this.length = length;
		this.paws = paws;
		this.color = color;
		this.environment = environment;
		this.speed = speed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(int length) {
		this.length = length;
	}
	protected void setPaws(int paws) {
		this.paws = paws;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getFullData() {
		return  "Name: " + this.name +
				"\nLength: " + this.length + " cm" +
				"\nQuantity of paws: " + this.paws +
				"\nColor: " + this.color +
				"\nEnvironment: " + this.environment + 
				"\nSpeed: " + this.speed + " m/s";
	}
}