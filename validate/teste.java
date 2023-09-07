//Faça um programa que valide dados de uma pessoa como:
//Nome, salário, idade, sexo e estado civil
package validate;

import java.util.Scanner;

public class teste {
	public static void main(String args[]) {
		Person persons = new Person();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Informe um nome: ");
			persons.setName(sc.nextLine());

			System.out.println("Informe uma idade: ");
			persons.setAge(sc.nextInt());
			sc.nextLine();
			System.out.println("Informe o seu sexo: ");
			persons.setSex(sc.nextLine());
			
			System.out.println("Informe o seu salário: ");
			persons.setSalary(sc.nextDouble());
			sc.nextLine();
			System.out.println("Informe o seu estado civil: ");
			persons.setMaritalStatus(sc.nextLine());
			
			persons.getData();
		}
		sc.close();
	}
}
