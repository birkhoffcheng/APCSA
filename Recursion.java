/**
 * @author birkhoff
 * @version 0.0.1
 * purpose: do some recursive calculation.
 */
public class Recursion {

	public Recursion() {}
	
	public int f1(int x) {
		if ( x <= 10 ) {
			return -7;
		}
		else {
			return f1( x - 4 ) + 2;
		}
	}
	
	public double f2(double x) {
		if ( x <= 25 ) {
			return 20.0;
		}
		else {
			return f2( x / 12.0 + 5.0 ) - 3.0;
		}
	}
	
	public int f3(int x) {
		if ( x > 20 ) {
			return -100;
		}
		else {
			return f3( x * 2 ) - 4;
		}
	}
}
