package questao1;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = scan.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O primeiro valor é o maior!");
		} else if(valor1 == valor2) {
			System.out.println("Os valores são iguais!");
		} else {
			System.out.println("O segundo valor é o maior!");
		}
	}
}
