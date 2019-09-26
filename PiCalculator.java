/*
Purpose: Calculate the Pi
Author: Birkhoff Cheng
Version: 0.0.1
PMR: I messed up with variable initialization and long int, because I just used my knowledge in C to handle long int. Then I just changed back to int type because it easier and I guess not many people will choose numbers larger than 65535.
*/
import java.util.Scanner;
class PiCalculator
{
	public static boolean isIn(double x, double y)
	{
		if ( ( Math.pow(x, 2.0) + Math.pow(y, 2.0) ) <= 1.0 )
			return true;
		else
			return false;		
	}
	
	public static void main (String [] args)
	{
		int numDarts = 0, numTrials = 0;
		int index = 0, j = 0;
		int hit = 0;
		double x, y, piTotal = 0.0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many darts? ");
		numDarts = in.nextInt();
		System.out.print("How many trials? ");
		numTrials = in.nextInt();
		double [] pi = new double[numTrials];
		
		for ( index = 0; index < numTrials; index++ )
		{
			hit = 0;
			for ( j = 0; j < numDarts; j++ )
			{
				x = Math.random() * 2.0 - 1.0;
				y = Math.random() * 2.0 - 1.0;
				if ( isIn(x, y) )
				{
					hit++;
				}
			}
			pi[index] = 4.0 * ( (double)hit / (double)numDarts );
			piTotal += pi[index];
			System.out.println("Trial [" + index + "]: pi = " + pi[index]);
		}
		double piAvg = piTotal / (double)numTrials;
		System.out.printf("Estimate of pi = %.6f\n", piAvg);
	}
}
