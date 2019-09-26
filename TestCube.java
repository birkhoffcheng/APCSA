/**
 * Tester for Cube
 * @author birkhoff
 * @version 02/14/2018
 */
public class TestCube {
	public static void main(String[] args) {
		int a = 1, b = 2;
		Cube testCube = new Cube(b);
		System.out.println("One's dimensions are " + a + " * " + b);
		System.out.println();
		System.out.println("Cube's dimensions are " + testCube.getLength() + " * " + testCube.getWidth() + " * " + testCube.getHeight());
	}

}
