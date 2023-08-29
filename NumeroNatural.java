package questao2;
import java.util.Scanner;

public class NumeroNatural {

	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = teste.nextInt();
		if(valor > 0) {
			System.out.println("O número é positivo!");
		} else if(valor == 0) {
			System.out.println("O número é 0");
		} else {
			System.out.println("O número é negativo!");
		}
	
	}

}
