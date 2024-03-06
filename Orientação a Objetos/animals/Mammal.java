package animals;

public class Mammal extends Animal {
	
	private String favoriteFood;
	
	public Mammal() {
		this.setEnvironment("Earth");
		this.favoriteFood = "None";
	}
	
	public void setFavoriteFood(String food) {
		this.favoriteFood = food;
	}
	
	public String getFavoriteFood() {
		return "Favorite food: " + this.favoriteFood;
	}
}