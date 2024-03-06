package calculatetax;

import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PhysicalPerson person = new PhysicalPerson();
		for(int i=0; i<3; i++) {
			System.out.println("Tell your name: ");
			person.setName(sc.nextLine());
			System.out.println("Tell your salary: ");
			try {
				person.setIncome(sc.nextDouble());				
			} catch (Exception e) {
				System.out.println("Error in receiving your salary.");
			}
			sc.nextLine();
			System.out.println("Name informed: " + person.getName());
			System.out.println("Salary informed: " + person.getIncome());
			System.out.println("Tax value: " + person.calculateTax());
		}
		sc.close();
	}
}