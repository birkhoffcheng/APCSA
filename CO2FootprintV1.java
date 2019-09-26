/**
 * This class calculates CO2 emission of a car based on the given gallons of gas used.
 * 
 * @author Birkhoff Cheng
 * @version 0.0.1
 */
public class CO2FootprintV1
{
	//declaration of private instances
	private double myGallonsUsed, myTonsC02, myPoundsCO2;
	
	CO2FootprintV1()
	{}
	
	/**
	* Constructor for ojbects of type CO2FootprintV1
	* @param gals gallons of gas used in a year
	*/
	CO2FootprintV1(double gals)
	{
		myGallonsUsed = gals;
	}
	
	/**
	* Mutator method to calculate CO2 emitted in tons
	*/
	public void calcTonsCO2()
	{
		myTonsC02 = myGallonsUsed * 0.00878;
	}
	
	/**
	* Mutator method to convert tons to pounds
	*/
	public void convertTonsToPoundsCO2()
	{
		myPoundsCO2 = 2204.62 * myTonsC02;
	}
	
	/**
	* Getter method to return CO2 emission in tons
	* @return myTonsCO2 tons of CO2 emitted annually
	*/
	public double getTonsCO2()
	{
		return myTonsC02;
	}
	
	/**
	* Getter method to return CO2 emission in pounds
	* @return myPoundsCO2 pounds of CO2 emitted annually
	*/
	public double getPoundsCO2()
	{
		return myPoundsCO2;
	}
}
