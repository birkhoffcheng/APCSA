public class AnnualFuelUse
{
	//private instance variables
	private int endMiles, startMiles, dist, day;
	private double gallonsUsed, pricePerGallon, mpg, ttlCost;
	
	//default constructor
	AnnualFuelUse()
	{
	}

	//constructor with parameters
	AnnualFuelUse (int day1, int startMiles1, int endMiles1, double gallonsUsed1, double pricePerGallon1)
	{
		day = day1;
		startMiles = startMiles1;
		endMiles = endMiles1;
		dist = endMiles - startMiles;
		gallonsUsed = gallonsUsed1;
		pricePerGallon = pricePerGallon1;
		mpg = (double)dist / gallonsUsed;
		ttlCost = gallonsUsed * pricePerGallon;
	}
	
//	public void calcDistance()
//	{
//		dist = endMiles - startMiles;
//	}
	
	public void calcMPG()
	{
		mpg = (double)dist / gallonsUsed;
	}
	
	public void totalCost()
	{
		ttlCost = gallonsUsed * pricePerGallon;
	}
	
	public void printThingsOut()
	{
		System.out.printf("%3d%12d%13d%11d%14.2f%10.1f%8.2f%9.2f\n", day, startMiles, endMiles, dist, gallonsUsed, mpg, pricePerGallon, ttlCost);
	}
	
	public int findminInt(int [] numbers)
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
	
	public double findminDouble(double [] numbers)
	{
		double min = Double.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}
    
	public int findmaxInt(int [] numbers)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}
	
	public double findmaxDouble(double [] numbers)
	{
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}
	
	public int getDistance()
	{
		return dist;
	}
	
	public double getGallon()
	{
		return gallonsUsed;
	}
	
	public double getMPG()
	{
		return mpg;
	}
	
	public double getPrice()
	{
		return pricePerGallon;
	}
	
	public double getCost()
	{
		return ttlCost;
	}
	
	public double getDay()
	{
		return day;
	}
}
