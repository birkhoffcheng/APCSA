/**
 * Description for 7.04 Weight project
 * Calculate your weight on other planets in the solar system.
 * @author Birkhoff Cheng
 * @version 0.0.2
 * PMR: I was basically thinking it in kilograms without considering the weight given is in pounds. So ratio always works.
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Weight
{
	// write static methods here
	// Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
	
	public static double [] getGravity() throws IOException
	{
		File file = new File("gravity1.txt");
		Scanner inFile = new Scanner(file);
		int i = 0;
		double [] gravity = new double[9];
		while ( inFile.hasNext() )
		{
			gravity[i] = inFile.nextDouble();
			i++;
		}
		return gravity;
	}
	
	public static double [] calcWeight(double earthWeight, double [] gravity)
	{
		double [] weightOnPlanet = new double[gravity.length];
		for (int i = 0; i < gravity.length; i++)
		{
			weightOnPlanet[i] = earthWeight * gravity[i] / gravity[2];
		}
		return weightOnPlanet;
	}
	
	public static void printResults(String [] planet, double [] gravity, double [] weight)
	{
		System.out.printf("Your Weight on Other Planets\n");
		System.out.printf("%8s%9s%13s\n", "Planet", "Gravity", "Weight(lbs)");
		System.out.printf("------------------------------------------\n");
		for (int i = 0; i < planet.length; i++)
		{
			System.out.printf("%8s%8.2f%11.2f\n", planet[i], gravity[i] / gravity[2], weight[i]);
		}
		return;
	}
	
	public static void main(String[] args) throws IOException
    	{
		Scanner input = new Scanner(System.in);
		System.out.print("What's your weight in pounds? ");
		
		double earthWeight = input.nextDouble();

		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] gravity = getGravity();					// static method you write
		double[] weight = calcWeight(earthWeight, gravity);			// static method you write
		printResults(names, gravity, weight);					// static method you write
	} //end main
}//end class
