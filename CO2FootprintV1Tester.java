/**
 * This class tests the CO2FootprintV1 class. 
 * 
 * An object cfp is declared with annual gas use as parameter.
 * 
 * calcTonsCO2 and convertTonsToPoundsCO2 are called to calculate the CO2 emission in tons and pounds.
 * The result of calculation is printed on the screen with the getter methods.
 * 
 * @author Birkhoff Cheng
 * @version 0.0.1
 */
public class CO2FootprintV1Tester
{
	public static void main (String[] args)
	{
		double gals = 391.85;
		CO2FootprintV1 cfp = new CO2FootprintV1(gals);
		
		cfp.calcTonsCO2();
		cfp.convertTonsToPoundsCO2();
		
		System.out.printf("\t\tCO2 Emissions\n");
		System.out.printf("Gallons of Gas\tPounds from Gas\tTons from Gas\n");
		for (int i = 0; i < 45; i++)
			System.out.printf("*");
		System.out.printf("\n%.1f\t\t%.2f\t\t%.3f\n", gals, cfp.getPoundsCO2(), cfp.getTonsCO2());
	}
}

/*
PMR:
This documentation for methods and classes are great for archiving and keyword searching in the Java library.
So on Linux you can easily search through text files with "find" command. So if I have a large volume of Java classes, I can just use this to search through different properties of functions.
*/
