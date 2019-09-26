/*
Purpose: Predict annual gas usage
Author: Birkhoff Cheng
Version: 0.0.8
PMR:
When I inserted the findmax / findmin function, I wondered if I should put it in the AnnualFuelUse class or this class. Then I still put it in AnnualFuelUse class, so this class is more compact.
*/
class AnnualFuelUseTester
{
	public static void main (String[] args)
	{
		int i = 0;
		AnnualFuelUse [] fuel = {new AnnualFuelUse(1, 20015, 20098, 5.35, 2.99), new AnnualFuelUse(7, 20098, 20175, 4.76, 2.98), new AnnualFuelUse(14, 20175, 20266, 4.92, 2.99)};
		int [] distances = new int[fuel.length];
		double [] gallons = new double[fuel.length];
		double [] mpgs = new double[fuel.length];
		double [] prices = new double[fuel.length];
		int distTtl = 0;
		double gallonTtl = 0.0, costTtl = 0.0, mpgTotal = 0.0;
		
		for (i = 0; i < fuel.length; i++)
		{
			distances[i] = fuel[i].getDistance();
			distTtl += distances[i];
			gallons[i] = fuel[i].getGallon();
			gallonTtl += gallons[i];
			mpgs[i] = fuel[i].getMPG();
			mpgTotal += mpgs[i];
			costTtl += fuel[i].getCost();
			prices[i] = fuel[i].getPrice();
		}
		
		double distAnnual = distTtl * 365 / fuel[fuel.length-1].getDay();
		double gallonAnnual = gallonTtl * 365 / fuel[fuel.length-1].getDay();
		double mpgAvg = mpgTotal / fuel.length;
		double costAnnual = costTtl * 365 / fuel[fuel.length-1].getDay();
		
		int distMax = fuel[0].findmaxInt(distances);
		int distMin = fuel[0].findminInt(distances);
		double mpgMax = fuel[0].findmaxDouble(mpgs);
		double mpgMin = fuel[0].findminDouble(mpgs);
		double priceMax = fuel[0].findmaxDouble(prices);
		double priceMin = fuel[0].findminDouble(prices);
		
		
		System.out.printf(" Fill Up   Days   Start Miles   End Miles   Distance   Gallons Used    MPG   Price     Cost\n");
		for (i = 0; i < fuel.length; i++)
		{
			System.out.printf("%5d      ", i+1);
			fuel[i].printThingsOut();
		}
		System.out.printf("\nMinimum:%42d%24.2f%8.2f\n", distMin, mpgMin, priceMin);
		System.out.printf("Minimum:%42d%24.2f%8.2f\n\n", distMax, mpgMax, priceMax);
		System.out.printf("Totals:%43d%14.2f%27.2f\n", distTtl, gallonTtl, costTtl);
		System.out.printf("Annual Projection:%32d%14.2f%10.2f%17.2f\n", (int)distAnnual, gallonAnnual, mpgAvg, costAnnual);
	}
}
