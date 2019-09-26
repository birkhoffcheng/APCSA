/**
 * Form a triangle
 * @author birkhoff
 * @version 02/14/2018
 */
public class Triangle {
	
	private double sideA, sideB, sideC;
	Triangle(double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
}
