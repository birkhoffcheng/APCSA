public class CarV7
{
	//private instance variables
	private int endMiles, startMiles;
	private double gallonsUsed, pricePerGallon;
	private String carType;
	
	//default constructor
	CarV7()
	{
	}

	//constructor with parameters
	CarV7 (String carType1, int endMiles1, int startMiles1, double gallonsUsed1, double pricePerGallon1)
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
}
