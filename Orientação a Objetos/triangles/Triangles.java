package triangles;

public class Triangles {
	
	double a, b, c;
	public Triangles (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangles () {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public void returnValues() {
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);
		System.out.println("Valor de c: " + c);
	}
	
	public double calculaPerimetro() {
		return (a + b + c);
	}
	
}
