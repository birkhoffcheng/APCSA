/**
 * Form a isosceles right triangle
 * @author birkhoff
 * @version 02/14/2018
 */
public class IsoscelesRight extends Triangle {
	/**
	 * @param a one side of the right angle
	 */
	public IsoscelesRight(double a) {
		super(a, a, Math.sqrt(2.0) * a);
	}

}
