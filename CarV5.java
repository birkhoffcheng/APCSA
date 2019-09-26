/*
Purpose: Calculate some stats about a car's gas consumption
Author: BIrkhoff Cheng
Version: 0.0.1
PMR: At first I set the private instance (or variable?) the same name as the constructor parameters. So it didn't work. But after I read the example code, I realized and removed the 1's in the end.
And I almost missed a bracket after a function ends. Carefulness needed.
*/
public class CarV5
{
	//private instance variables
	private int endMiles, startMiles;
	private double gallonsUsed, pricePerGallon;
	private String carType;
	
	//default constructor
	CarV5()
	{
	}

	//constructor with parameters
	CarV5 (String carType1, int endMiles1, int startMiles1, double gallonsUsed1, double pricePerGallon1)
	{
		carType = carType1;
		endMiles = endMiles1;
		startMiles = startMiles1;
		gallonsUsed = gallonsUsed1;
		pricePerGallon = pricePerGallon1;
	}
	
	public int calcDistance()
	{
		return endMiles - startMiles;
	}
	
	public double calcGPM(int dist)
	{
		return gallonsUsed / (double)dist;
	}
	
	public double calcMPG(int dist)
	{
		return (double)dist / gallonsUsed;
	}
	
	public double totalCost()
	{
		return gallonsUsed * pricePerGallon;
	}
	
	public void printCarType()
	{
		System.out.printf("%s", carType);
	}
	
	public static void main (String[] args)
	{
		//declaration and initialization
		int startMiles1 = 20015, endMiles1 = 20098;
		double gallonsUsed1 = 5.35, pricePerGallon1 = 2.99;
		String carType1 = "Peugeot 307";
		
		CarV5 car1 = new CarV5(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
		
		//calculation
		int distance1 = car1.calcDistance();
		double gpm1 = car1.calcGPM(distance1);
		double mpg1 = car1.calcMPG(distance1);
		double ttlCost = car1.totalCost();
		
		//output
		System.out.printf("\t\tGas Mileage Calculations\n");
		System.out.printf("Type of Car\tStart Miles\tEnd Miles\tDistance\tGallons\t\tPrice\t\tCost\t\tMiles/Gal\tGal/Mile\n");
		for (int i = 0; i < 150; i++) {
			System.out.printf("=");
		}
		System.out.printf("\n");
		car1.printCarType();
		System.out.printf("\t%d\t\t%d\t\t%d\t\t%f\t%f\t%f\t%f\t%f\n", startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, ttlCost, mpg1, gpm1);
	}
}
