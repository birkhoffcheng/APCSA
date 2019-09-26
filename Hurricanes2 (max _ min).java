/**
 * Hurricane description: Collect hurricane data from a file, and make a summary.
 *
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 * PMR:
 * I want to know more about defining functions in Java, like how to pass variable by value or by address.
 * After all, using functions to do something is far more efficient than typing or copying it over and over again.
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Hurricanes2
{
    public static int findmin(int [] numbers)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
    
    public static int findmax(int [] numbers)
    {
      	int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > max)
                max = numbers[i];
        }
     	return max;
    }
    
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables


		int arrayLength = 59, i;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
	int [] pressure = new int[arrayLength];
	int [] windspeed = new int[arrayLength];
	int [] category = new int[arrayLength];
	String [] hurricane = new String[arrayLength];


        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windspeed[index] = inFile.nextInt();
            hurricane[index] = inFile.next();
            index++;
        }
        inFile.close();

		int ttlPressure = 0, ttlSpeed = 0, ttlCat = 0;
		//PROCESSING - calculate and convert values
		
		for (i = 0; i < arrayLength; i++)
		{
			ttlPressure += pressure[i];
		}
		
		// convert windspeed from knots to MPH
		for (i = 0; i < arrayLength; i++)	//I originally wanted to use for-each loop here, but it involves changing values of variables, so passing by value is not feasible.
		{
			windspeed[i] = (int)( (double)windspeed[i] * 1.15078 );
		}
		
		for (i = 0; i < arrayLength; i++)
		{
			ttlSpeed += windspeed[i];
		}
		
		// determine category
		for (i = 0; i < arrayLength; i++)
		{
			if ( windspeed[i] < 95 )
			{
				category[i] = 1;
			}
			else if ( windspeed[i] < 110 )
			{
				category[i] = 2;
			}
			else if ( windspeed[i] < 129 )
			{
				category[i] = 3;
			}
			else if ( windspeed[i] < 156 )
			{
				category[i] = 4;
			}
			else
			{
				category[i] = 5;
			}
			ttlCat += category[i];
		}
		// count number of each category
		int [] numCat = new int[6];
		for ( int integer : category )
		{
			numCat[integer]++;
		}

        //Find min, max and average for category, windspeed and pressure
	int avgCat = (int)( (double)ttlCat / (double)arrayLength );
	int maxCat = findmax(category);
	int minCat = findmin(category);
	int avgPressure = (int)( (double)ttlPressure / (double)arrayLength );
	int maxPressure = findmax(pressure);
	int minPressure = findmin(pressure);
	int avgSpeed = (int)( (double)ttlSpeed / (double)arrayLength );
	int maxSpeed = findmax(windspeed);
	int minSpeed = findmin(windspeed);
	
        //Output - print table using printf to format the columns
        PrintWriter file = new PrintWriter(new File("Summary.txt"));
        System.out.println("                      Hurricanes 1980 - 2006");
        file.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        file.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        file.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        file.println("=====================================================================");
        for (i = 0; i < arrayLength; i++)
        {
        	System.out.printf("%d%14s%9d%15d%19d\n", year[i], hurricane[i], category[i], pressure[i], windspeed[i]);
        	file.printf("%d%14s%9d%15d%19d\n", year[i], hurricane[i], category[i], pressure[i], windspeed[i]);
	}
        System.out.println("=====================================================================");
        file.println("=====================================================================");
        System.out.printf("Average%20d%15d%19d\n", avgCat, avgPressure, avgSpeed);
        System.out.printf("Maximum%20d%15d%19d\n", maxCat, maxPressure, maxSpeed);
        System.out.printf("Minimum%20d%15d%19d\n", minCat, minPressure, minSpeed);
        file.printf("Average%20d%15d%19d\n", avgCat, avgPressure, avgSpeed);
        file.printf("Maximum%20d%15d%19d\n", maxCat, maxPressure, maxSpeed);
        file.printf("Minimum%20d%15d%19d\n", minCat, minPressure, minSpeed);
        System.out.println();
        file.println();
        for (i = 1; i < numCat.length; i++)
        {
        	System.out.println("Number of Category " + i + ": " + numCat[i]);
        	file.println("Number of Category " + i + ": " + numCat[i]);
        }
        file.close();
    }//end main()
}//end Hurricanes2
