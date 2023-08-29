package pessoa;
import java.util.Scanner;

public class Pessoa {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		System.out.println("Informe um sexo: ");
		char sexo = teste.next().charAt(0);
		
		if(sexo == 'M' || sexo == 'm'){
			System.out.println("O sexo é masculino!");
		} else if(sexo == 'F' || sexo == 'f') {
			System.out.println("O sexo é feminino!");
		} else {
			System.out.println("O sexo é inválido");
		}
	}
}