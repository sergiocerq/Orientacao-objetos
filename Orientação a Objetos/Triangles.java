package application;

import java.util.Scanner;

public class Triangles {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		System.out.println("Informe os valores dos lados do triângulo X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Informe os valores dos lados do triângulo Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double px = (x1  + x2 + x3)/2.0;
		double areaX = Math.sqrt(px * (px - x1) * (px - x2) * (px - x3));
		System.out.println("A área do triângulo X é: " + areaX);
		
		double py = (y1 + y2 + y3)/2.0;
		double areaY = Math.sqrt(py * (py - y1) * (py - y2) * (py - y3));
		System.out.println("A área do triângulo Y é: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do triângulo X é a maior!");
		} else {
			System.out.println("A área do triângulo y é a maior!");
		}
	}
}