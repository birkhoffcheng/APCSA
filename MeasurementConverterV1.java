/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * 
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Birkhoff Cheng
 * Date: 09/04/2017
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi");


        //convert miles to feet
	miles = 1.179;
	feet = miles * feetPerMile;
	System.out.println(miles + "mi. = " + feet + "ft");

	//convert miles to kilometers
	double kilometers;
	double kilometersPerMile = 1.60934;
	miles = 10;
	kilometers = miles * kilometersPerMile;
	System.out.println(miles + "mi. = " + kilometers + "km");

	//convert kilometers to miles
	kilometers = 24986;
	miles = kilometers / kilometersPerMile;
	System.out.println(kilometers + "km = " + miles + "mi");

	//convert pounds to kilograms
	double kg;
	double lb = 5.6;
	double lbsPerKg = 2.20462;
	kg = lb / lbsPerKg;
	System.out.println(lb + "lbs = " + kg + "kg");

	//convert kilograms to pounds
	kg = 77;
	lb = kg * lbsPerKg;
	System.out.println(kg + "kg = " + lb + "lbs");

	//convert gallons to liters
	double gallons = 59;
	double liters;
	double litersPerGallon = 3.78541;
	liters = gallons * litersPerGallon;
	System.out.println(gallons + "gallons = " + liters + "liters");

	//convert liters to gallons
	liters = 55998;
	gallons = liters / litersPerGallon;
	System.out.println(liters + "liters = " + gallons + "gallons");

	//convert bit to byte
	double bits = 100;
	double bitsPerByte = 8;
	double bytes = bits / bitsPerByte;
	System.out.println(bits + "bits = " + bytes + "bytes");

	//convert byte to bit
	bytes = 1;
	bits = bytes * bitsPerByte;
	System.out.println(bytes + "bytes = " + bits + "bits");

    }//end of main method
}//end of class`
