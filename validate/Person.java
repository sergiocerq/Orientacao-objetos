package validate;

public class Person {
	
	String name;
	int age;
	double salary;
	char sex;
	char status;
	
	public Person() {
		this.name = "";
		this.age = 0;
		this.salary = 0.0;
		this.sex = ' ';
		this.status = ' ';
	}
	public Person(String name, int age, double salary, char sex, char maritalStatus) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sex = sex;
		this.status = maritalStatus;
	}
	public void setName(String name) {
		if(name.length() >= 3) 			
			this.name = name;
		 else 
			System.out.println("Nome inválido");
		
	}
	public void setAge(int age) {
		if(age >=0 && age <= 130) 
			this.age = age;
		 else 
			System.out.println("Idade inválida");
		
	}
	public void setSex(String sex) {
		if (Character.toLowerCase(sex.charAt(0)) == 'f' || 
			Character.toLowerCase(sex.charAt(0))=='m'
		) 		
			this.sex = sex.charAt(0);
		 else 
			System.out.println("Sexo inválido");
		
	}
	public void setSalary(double salary) {
		if(salary > 0) 			
			this.salary = salary;
		 else 
			System.out.println("Salário inválido");
		
	}
	public void setMaritalStatus(String status) {
		if (Character.toLowerCase(status.charAt(0))== 's' ||
		    Character.toLowerCase(status.charAt(0)) =='c' ||
			Character.toLowerCase(status.charAt(0)) == 'd' ||
			Character.toLowerCase(status.charAt(0)) == 'v'
		)
			this.status = status.charAt(0);			
		else
			System.out.println("Estado civil inválido");
	}
	
	public void getData() {
		System.out.println("Nome: " + this.name);
		System.out.println("Idade: " + this.age);
		System.out.println("Salário: R$" + this.salary);
		System.out.println("Sexo: " + this.sex);
		System.out.println("Estado civil: " + this.status);
		System.out.println("\n\n");
	}
}