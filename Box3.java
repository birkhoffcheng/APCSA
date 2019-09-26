/**
 * Box3 with override methods
 * @author Birkhoff 
 * @version 02/18/2018
 */
public class Box3 extends Rectangle3
{
	private int height;

	public Box3(int l, int w, int h)
	{
		super(l, w);
		height = h;
	}

	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "Box - " + getLength() + " X " + getWidth() + " X " + height;
	}
	
	public boolean equals( Box3 box )
	{
		if ( getLength() == box.getLength() ) {
			if ( getWidth() == box.getWidth() ) {
				if ( getHeight() == box.getHeight() ) {
					return true;
				}
			}
		}
		return false;
	}
}
