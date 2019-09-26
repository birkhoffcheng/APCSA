/**
 * Tester for triangles
 * @author birkhoff
 * @version 02/14/2018
 */
public class TestTriangles {
	public static void main(String[] args) {
		
		double sideA = 4.0, sideB = 5.0, sideC = 6.0;
		
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		System.out.printf("Triangle has side A = %.1f, B = %.1f, C = %.1f\n", triangle.getSideA(), triangle.getSideB(), triangle.getSideC());
		
		Equilateral equilateralTriangle = new Equilateral(sideB);
		System.out.printf("Equilateral triangle has side A = %.1f, B = %.1f, C = %.1f\n", equilateralTriangle.getSideA(), equilateralTriangle.getSideB(), equilateralTriangle.getSideC());
		
		IsoscelesRight isoscelesRightTriangle = new IsoscelesRight(sideA);
		System.out.printf("Isosceles right triangle has side A = %.1f, B = %.1f, C = %f\n", isoscelesRightTriangle.getSideA(), isoscelesRightTriangle.getSideB(), isoscelesRightTriangle.getSideC());
	}
}
/*
 * PMR:
 * Previously I didn't know what the superclass option in eclipse IDE means, it was set default to java.lang.Object.
 * Now I can change it to the class I want and it will automatically create the super statement and inherit abstract methods for me, although I don't know what an abstract method is yet.
 */
