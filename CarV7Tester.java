/*
Purpose: contrast some gas consumption info about two cars
Author: Birkhoff Cheng
Version: 0.0.7
PMR:
This is great because now when I initilize an object, I only input parameters once, which makes programs more organized.
This is the great thing about Java. Now I can construct class types in separate files from my main method.
I remember previously I was taught to use "import" statement to import things from another file in Java on Codecademy. But I'm not very sure.
*/
public class CarV7Tester
{
	public static void main (String[] args)
	{
		//declaration and initialization for car1
		int startMiles1 = 20015, endMiles1 = 20098;
		double gallonsUsed1 = 6.05, pricePerGallon1 = 2.99;
		String carType1 = "Jeep Wrangler";
		
		//declaration and initialization for car2
		int startMiles2 = 20015, endMiles2 = 20098;
		double gallonsUsed2 = 4.71, pricePerGallon2 = 2.99;
		String carType2 = "TOYOTA Carola";
		
		//objects construction
		CarV7 car1 = new CarV7(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
		CarV7 car2 = new CarV7(carType2, endMiles2, startMiles2, gallonsUsed2, pricePerGallon2);
		
		//calculation for car1
		int distance1 = car1.calcDistance();
		double gpm1 = car1.calcGPM(distance1);
		double mpg1 = car1.calcMPG(distance1);
		double ttlCost1 = car1.totalCost();
		
		//calculation for car2
		int distance2 = car2.calcDistance();
		double gpm2 = car2.calcGPM(distance2);
		double mpg2 = car2.calcMPG(distance2);
		double ttlCost2 = car2.totalCost();
		
		//output
		System.out.printf("\t\tGas Mileage Calculations\n");
		System.out.printf("Type of Car\tStart Miles\tEnd Miles\tDistance\tGallons\t\tPrice\t\tCost\t\tMiles/Gal\tGal/Mile\n");
		for (int i = 0; i < 150; i++) {
			System.out.printf("=");
		}
		System.out.printf("\n");
		
		//print out info for car1
		car1.printCarType();
		System.out.printf("\t%d\t\t%d\t\t%d\t\t%f\t%.2f\t\t%.2f\t\t%f\t%f\n", startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, ttlCost1, mpg1, gpm1);
		
		//print out info for car2
		car2.printCarType();
		System.out.printf("\t%d\t\t%d\t\t%d\t\t%f\t%.2f\t\t%.2f\t\t%f\t%f\n", startMiles2, endMiles2, distance2, gallonsUsed2, pricePerGallon2, ttlCost2, mpg2, gpm2);
	}
}
