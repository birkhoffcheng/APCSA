/**
 * Annual Climate description: Show stats of Miami's annual climate
 * 
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 *
 * PMR:
 * Did it in the last hour, kind of procrastination. Will improve...
 * Pretty nice, no error. because I use Linux terminal to execute programs, I have to put a return at the end of the program, or a new line of command prompt will start from where the program left off.
 * So a good thing to remember. Because programs are made for practical use. They are not always run in IDE.
 */

import java.util.Scanner;
class AnnualClimate
{

   	public static void main (String [ ] args)
	{
		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Miami";
		String state = "Florida";
		int i;
//		String city = "Orlando";

		String month [] ={"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
		double temperature [] ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};	//initialize with Fahrenheit values
		double precipitation [] ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};	//initialize with inches values
		double totalTemp = 0, totalPrecip = 0, avgTemp, avgPrecip;
		
//		double temperature [] ={60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
//		double precipitation [] ={2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
		
		String tempLabel = "(F)";   //initialize to F
		String precipLabel = "(in)"; //initialize to inch

		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();

		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( i = 0; i < temperature.length; i++)
			{
				//code for assigning new C values to the temperature array
				temperature[i] = ( temperature[i] - (double)32 ) / 1.8;
			}
		}
		
		for( i = 0; i < temperature.length; i++)
		{
			totalTemp += temperature[i];
		}
		avgTemp = totalTemp / (double)temperature.length;
		
		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";
			for ( i = 0; i < precipitation.length; i++ )
			{
				precipitation[i] = precipitation[i] * 2.54;
				totalPrecip += precipitation[i];
			}
		}
		
		for( i = 0; i < precipitation.length; i++)
		{
			totalPrecip += precipitation[i];
		}
		avgPrecip = totalPrecip / (double)precipitation.length;

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s\n","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.printf("***************************************************\n");
		for ( i = 0; i < 12; i++ )
		{
			System.out.printf("%s%15.1f%18.1f\n", month[i], temperature[i], precipitation[i]);
		}
		System.out.printf("***************************************************\n");
		System.out.printf("Average:%11.1f%18.1f\n", avgTemp, avgPrecip);
	}//end main
}//end Annual Climate
