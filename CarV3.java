/*
Purpose: Calculate the distance a car travelled and Mile Per Gallon
Author: Birkhoff Cheng
Version: 0.0.3
PMR: This is a complete new start for me. Object-Oriented Programming. But today I made a mistake by using %i in printf statement for int because it is so in C.
I will get more knowledge on OOP in this course.
*/
public class CarV3
{
	CarV3() {}	//default constructor
	
	public int calcDistance(int sMiles, int eMiles)
	{
		return eMiles - sMiles;
	}
	
	public double calcMPG(int dist, double gals)
	{
		return gals / (double)dist;
	}
	
	public static void main(String[] args)
	{
		//declaration and initialization
		int sMiles1 = 20015, eMiles1 = 20098;
		double gals1 = 5.35;
		
		CarV3 car1 = new CarV3();
		
		//calculation
		int distance1 = car1.calcDistance(sMiles1, eMiles1);
		double mpg1 = car1.calcMPG(distance1, gals1);
		
		//output
		System.out.printf("\t\tGas Mileage Calculations\n");
		System.out.printf("Type of Car\tStart Miles\tEnd Miles\tDistance\tGallons\t\tMiles/Gal\n");
		for (int i = 0; i < 90; i++) {
			System.out.printf("=");
		}
		System.out.printf("\n");
		System.out.printf("Peugeot\t\t%d\t\t%d\t\t%d\t\t%f\t%f\n", sMiles1, eMiles1, distance1, gals1, mpg1);
	}
}
