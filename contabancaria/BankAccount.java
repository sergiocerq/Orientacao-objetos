package contabancaria;

public class BankAccount {
	private String name;
	private String code;
	protected double balance;
	
	public BankAccount() {
		super();
		name = "Unnamed";
		code = "XYZ" + 0;
		balance = 0;
	}
	
	public BankAccount(String name, String code, double balance) {
		super();
		this.name = name;
		this.code = code;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double value) throws Exception{
		if(value <= this.balance) {
			this.balance -= value;
		} else {
			throw new Exception();
		}
	}
	
	public void deposit(double value) throws Exception{
		if(value > 0) {
			this.balance += value;
		}
		else {
			throw new Exception();
		}
	}
}