package contabancaria;

public class Teste {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Sérgio Cerqueira", "XYZ010", 1000);
		System.out.println(account.getName());
		System.out.println(account.getCode());
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(500);
		} catch (Exception e) {
			System.out.println("Error when withdrawing the value");
		}
		
		System.out.println(account.getBalance());

		try {
			account.deposit(400);
		} catch (Exception e2){
			System.out.println("Error with depositing the value.");
		}
		
		System.out.println(account.getBalance());	
		
		SpecialAccount special = new SpecialAccount();
		special.setName("Cristiano");
		special.setCode("HGJ876");
		
		try {
			special.withdraw(1000);
		} catch (Exception e3) {
			System.out.println("Error with withdeawing on the special account.");
		}
		
		try {
			special.deposit(100000);
		} catch (Exception e4) {
			System.out.println("Error with depositing on the special account.");
		}
		
		System.out.println(special.getName());
		System.out.println(special.getCode());
		System.out.println(special.getBalance());
	}
}
