package contabancaria;

public class SpecialAccount extends BankAccount {
	private double limit;
	
	public SpecialAccount() {
		super();
		this.limit = 0;
	}
	
	public SpecialAccount(double limit) {
		super();
		this.limit = limit;
	}
	
	public void withdraw(double value) throws Exception {
		if((this.limit + this.balance) >=  value) {
			this.balance -= value;
		} else {
			throw new Exception();
		}
	}
	
}