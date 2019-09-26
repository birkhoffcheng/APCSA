public class TestPoly2
{
	public static void showCenter(Circle2 circle) {
		System.out.println("For " + circle.getClass().getName() + " " + circle.center());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Circle2 circle = new Circle2(2, 4, 2);
		Cylinder2 cylinder = new Cylinder2(10, 15, 5, 20);
		Oval2 oval = new Oval2(25, 10, 15, 20);
		OvalCylinder2 ovalCylinder = new OvalCylinder2(40, 10, 15, 20, 30);
		
		showCenter(circle);
		showCenter(cylinder);
		showCenter(oval);
		showCenter(ovalCylinder);
	}
}
/* 
 * PMR:
 * Basically, calling the superclass methods can also invoke subclass methods and retrieve information.
 * Java programming does have more fun than C.
 */