package calculatetax;

public class LegalPerson extends Person {
	private double income;
	
	public LegalPerson() {
		income = 0;
	}
	
	public LegalPerson(double value) {
		income = value;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return income;
	}
	
	public double calculateTax() {
		return income / 10;
	}
}