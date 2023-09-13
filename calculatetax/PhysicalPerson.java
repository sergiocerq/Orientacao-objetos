package calculatetax;

public class PhysicalPerson extends Person {
	private double income;
	
	public PhysicalPerson() {
		income = 0;
	}
	
	public PhysicalPerson(double income) {
		this.income = income;
	}
	
	public void setIncome(double value) throws Exception {
		if(value > 0) {
			income = value;
		} else {
			throw new Exception();
		}
	}
	
	public double getIncome() {
		return income;
	}
	
	public double calculateTax() {
		double taxValue=0;
		if(income <= 1400) {
			taxValue = 0;
		} else if((income > 1400.01) && (income <= 2100)) {
			taxValue = income * 0.1 - 100;
		} else if((income > 2100.01 && (income <= 2800))) {
			taxValue = income * 0.15 - 270;
		} else if((income > 2800.01) && (income <= 3600)) {
			taxValue = income * 0.25 - 500;
		} else {
			taxValue = income * 0.3 - 700;
		}
		return taxValue;
	}
}