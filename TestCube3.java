/**
 * Tester class for Box3, Rectangle3, and Cube3
 * @author Birkhoff
 * @version 02/18/2018
 */
public class TestCube3
{
	public static void main(String[] args)
	{
		Rectangle3 one = new Rectangle3(5, 20);
		Box3 two = new Box3(4, 4, 4);
		Box3 three = new Box3(4, 10, 5);
		Cube3 four = new Cube3(4);

		showEffectBoth(one);
		showEffectBoth(two);
		showEffectBoth(three);
		showEffectBoth(four);
		compare(two, four);
		compare(three, four);
	}

	public static void showEffectBoth(Rectangle3 r)
	{
		System.out.println(r);
	}
	
	public static void compare( Box3 a, Box3 b ) {
		if ( a.equals(b) ) {
			System.out.println( a.toString() + " is the same size as " + b.toString() );
		}
		else {
			System.out.println( a.toString() + " is not the same size as " + b.toString() );
		}
	}
}
/*
PMR:
The overriding methods are powerful in case we need different methods with similar functions in accordance to different class.
So the basic rule is the method in the class/superclass closest to the class where the method called is chosen.
This is helpful in future programming.
*/
