/**
 * Cube3 with override methods
 * @author birkhoff
 * @version 02/14/2018
 */
public class Cube3 extends Box3{
	Cube3(int l) {
		super(l, l, l);
	}
	
	public String toString()
	{
	    return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}
