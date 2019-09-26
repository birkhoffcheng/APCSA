/**
 * Rectangle3 with override methods
 * @author Birkhoff
 * @version 02/18/2018
 */
public class Rectangle3
{
	private int length;
	private int width;

	public Rectangle3(int l, int w)
	{
		length = l;
		width = w;
	}

	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
}
