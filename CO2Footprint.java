/**
 * Library for CO2FootprintTester
 * Calculate families' annual CO2 footprint.
 * @author Birkhoff Cheng
 * @version 0.0.2
 */
class CO2Footprint {
	
	private double myGas, myElectricity, myElectricityBill, myElectricityPrice, myWaste, myEmissions, myReduction;
	private double reducedBulbs;
	private double co2FromElectricity, co2FromGas;
	private boolean myPaper, myPlastic, myGlass, myCans;
	private int myBulbs, myNumPeople;
	
	/**
	 * @param annual gasoline used
	 * @param average electricity bill
	 * @param average electricity price
	 * @param number of people in home
	 * @param recycle paper
	 * @param recycle plastic
	 * @param recycle glass
	 * @param recycle cans
	 * @param number of light bulbs replaced 
	 */
	CO2Footprint (double annualGas, double electricityBill, double electricityPrice, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numBulbs) {
		myGas = annualGas;
		myElectricityBill = electricityBill;
		myElectricityPrice = electricityPrice;
		myElectricity = myElectricityBill / myElectricityPrice;
		myNumPeople = numPeople;
		myPaper = paper;
		myPlastic = plastic;
		myGlass = glass;
		myCans = cans;
		myBulbs = numBulbs;
	}
	
	public void calculate() {
		co2FromElectricity = myElectricity * 1.37 * 12.0;
		co2FromGas = myGas * 0.00878 * 2204.62;
		myEmissions = (double)myNumPeople * 1018;
		
		if(myPaper)
		{
			myReduction += (184.0 * (double)myNumPeople);
		}
		
		if(myPlastic)
		{
			myReduction += (25.6 * (double)myNumPeople);
		}
		
		if(myGlass)
		{
			myReduction += (46.6 * (double)myNumPeople);
		}
		
		if(myCans)
		{
			myReduction += (165.8 * (double)myNumPeople);
		}
		
		reducedBulbs = (double)myBulbs * 1.37 * 73.0;
		myWaste = myEmissions - myReduction - reducedBulbs;
	}
	
	public double getGaCO2s() {
		return co2FromGas;
	}
	
	public double getElectricityCO2() {
		return co2FromElectricity;
	}
	
	public double getWasteCO2() {
		return myEmissions;
	}
	
	public double getRecyclingReduction() {
		return myReduction;
	}
	
	public double getBulbsReduction() {
		return reducedBulbs;
	}
	
	public double getWaste() {
		return myWaste;
	}
}

/*
 * Class Diagram
 * 
 * 		CO2Footprint
 * 
 * 		Constructor:
 * CO2Footprint (double annualGas, double electricityBill, double electricityPrice, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numBulbs)
 * 
 * 		Methods:
 * void calculate()
 * double getGaCO2s()
 * double getElectricityCO2()
 * double getWasteCO2()
 * double getRecyclingReduction()
 * double getBulbsReduction()
 * double getWaste()
 * 
 */

/*
 * Pseudocode
 * calculate electricity CO2 emission
 * calculate gas CO2 emission
 * if (recycle paper)
 * {reduce paper waste}
 * if (recycle plastic
 * {reduce plastic waste}
 * if (recycle glass)
 * {reduce glass waste}
 * if (recycle cans)
 * {reduce cans waste}
 * calculate bulbs replacement reduction
 * calculate net waste
 */