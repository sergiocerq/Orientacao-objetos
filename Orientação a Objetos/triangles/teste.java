package triangles;
import java.util.Scanner;

public class teste {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Triangles triangles1 = new Triangles();
		double aux;
		
		System.out.println("Informe o valor do lado a: ");
		aux = sc.nextDouble();
		triangles1.setA(aux);
		System.out.println("Informe o segundo valor: ");
		aux = sc.nextDouble();
		triangles1.setB(aux);
		System.out.println("Informe o terceiro valor: ");
		aux = sc.nextDouble();
		triangles1.setC(aux);

		triangles1.returnValues();
		System.out.println("Valor da soma de todos os lados: " + triangles1.calculaPerimetro());
		
		sc.close();
	}
}
