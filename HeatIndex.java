/**
 * Heat Index description:
 * A program to read temperature and humidity from two text files, then calculate the Heat Index and display it.
 * 
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 * PMR:
 * I really want to try these formatting features of printf in C. And I will do it today after school.
 * It's fascinating because I haven't even learned anything about such feature of printf except keeping decimal digits in C.
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars

        String location = "Key West";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
            	t = temperature[n];
            	h = humidity[n];

		hI[n] = -42.379 + 2.04901523 * t + 10.14333127 * h - 0.22475541 * t * h -0.00683783 * t * t - 0.05481717 * h * h + 0.00122874 * t * t * h + 0.00085282 * t * h * h - 0.00000199 * t * t * h * h;
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
        	tempSum += temperature[n];
        }

        double tempAvg = tempSum/temperature.length;
        
        for(n = 0; n < humidity.length; n++)
        {
        	humidSum += humidity[n];
        }
        double humidAvg = (double)humidSum / (double)(humidity.length);
        
        for(n = 0; n < hI.length; n++)
        {
        	hISum += hI[n];
        }
        double hIAvg = hISum / hI.length;
        
        PrintWriter file = new PrintWriter(new File("Heat Index.txt"));

        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("     Heat Index: %15s \n ", location);
        file.printf("     Heat Index: %15s \n ", location);
        System.out.println();
        file.println();


        System.out.println("          Months ");
        file.println("          Months ");
        System.out.print("            ");
        file.print("            ");
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
            file.printf("   %3.3s", m);
        }


        System.out.println("  Avg");
        file.println("  Avg");
        System.out.println("******************************************************************************************");
        file.println("******************************************************************************************");


        System.out.print("Temp (F)    ");
        file.print("Temp (F)    ");
         //for:each loop to print temperature
	for (double d : temperature)
	{
		System.out.printf("%6.1f", d);
		file.printf("%6.1f", d);
	}
	System.out.printf("%6.1f", tempAvg);
	file.printf("%6.1f", tempAvg);
	
        System.out.println();
        file.println();

        System.out.print("Humidity (%)");
       	file.print("Humidity (%)");
        //for:each loop to print humidity
        for (int d : humidity)
	{
		System.out.printf("%6d", d);
		file.printf("%6d", d);
	}
	System.out.printf("%6.1f", humidAvg);
	file.printf("%6.1f", humidAvg);
        
        System.out.println();
        file.println();

        System.out.print("HI (F)      ");
        file.print("HI (F)      ");
        //for:each loop to print HI
        for (double d : hI)
	{
		System.out.printf("%6.1f", d);
		file.printf("%6.1f", d);
	}
	System.out.printf("%6.1f", hIAvg);
	file.printf("%6.1f", hIAvg);
	file.println();
	file.close();
        
        System.out.println();
    } //end main()
}//end HeatIndex
