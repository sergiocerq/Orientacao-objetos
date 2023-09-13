package contabancaria;

public class SavingsAccount extends BankAccount {
	private double incomeValue;
	
	public SavingsAccount() {
		super();
		this.incomeValue = 0;
	}
	public SavingsAccount(double value) {
		super();
		this.incomeValue = value;
	}
	public void calculateNewBalance(double value) throws Exception {
		if(value > 0) {
			double income = value * (this.incomeValue / 100);		
			this.deposit(income);
		} else {
			throw new Exception();
		}
	}
}
