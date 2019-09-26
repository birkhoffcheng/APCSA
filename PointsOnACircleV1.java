// Purpose: showing the points on a circle of given radius
// author: Birkhoff Cheng
// version: 0.0.1
// date: 11/28/2017
// PMR:
// I did this very quickly.
// Probably because of fluency on logic and formatting.
// This is basically like #include <math.h> in C.
// Almost everything Java can be traced back to C.

public class PointsOnACircleV1
{
	public static void main(String [] args)
	{
		double r = 1.0, x, y1, y2;
		
		System.out.printf("Points on a Circle of Radius %.1f\n", r);
		System.out.printf("%5s%8s%10s%8s\n", "x1", "y1", "x1", "y2");
		System.out.printf("---------------------------------\n");
		
		for (x = 1.0; x >= -1.0; x -= 0.1)
		{
			y1 = Math.sqrt( Math.pow(r, 2.0) - Math.pow(x, 2.0) );
			y2 = (-1.0) * Math.sqrt( Math.pow(r, 2.0) - Math.pow(x, 2.0) );
			System.out.printf("%6.2f%8.2f%10.2f%8.2f\n", x, y1, x, y2);
		}
	}
}
