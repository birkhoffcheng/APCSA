/**
 * Tester for CO2Footprint
 * Calculates the CO2 emission and reduction of families and compare them.
 * @author Birkhoff Cheng
 * @version 0.0.2
 */
import java.util.ArrayList;
public class CO2FootprintTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CO2Footprint> footprint = new ArrayList<CO2Footprint>();
		//CO2Footprint (double annualGas, double electricityBill, double electricityPrice, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numBulbs)
		footprint.add(new CO2Footprint(50159.0, 3215.0, 0.3, 3, true, true, true, false, 20));
		footprint.add(new CO2Footprint(49680.0, 2368.5, 0.2, 4, false, true, true, true, 30));
		footprint.add(new CO2Footprint(57112.0, 3424.4, 0.3, 5, true, false, true, true, 28));
		footprint.add(new CO2Footprint(12343.7, 5327.8, 0.5, 6, true, true, false, true, 23));
		footprint.add(new CO2Footprint(43214.3, 3452.1, 0.4, 5, true, true, true, false, 26));
		
		System.out.printf("Pounds of CO2 Emitted from\t\t\tPounds of CO2 Reduced from\n");
		System.out.printf("Gas\t\tElectricity\tWaste\t\tRecycling\tNew Bulbs\tCO2 Footprint\n");
		
		for(CO2Footprint output : footprint)
		{
			output.calculate();
			System.out.printf("%.2f\t%.2f\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", output.getGaCO2s(), output.getElectricityCO2(), output.getWasteCO2(), output.getRecyclingReduction(), output.getBulbsReduction(), output.getWaste());
		}
	}
}

/*
 * 		Class Diagram
 * 		In main() method
 * ArrayList<CO2Footprint> footprint
 * CO2Footprint output
 */

/*
 * Pseudocode
 * declare an ArrayList of type CO2Footprint
 * add five rows of data
 * print out header
 * for (every object in ArrayList footprint)
 * {print out required data}
 */

/*
 * PMR:
 * This is basically the same structure with the last assignment. It is good to get some practice.
 * This time, I got a multilingual IDE named Eclipse.
 * It's compact (6.9MB on my Linux machine) and supports a lot of languages including Java, C/C++, PHP, JS, so I can do both my C projects and Java projects on this.
 * And it compiles and debugs code in real-time. So I if I type an error, I get a warning or error instantly. Convenient.
 * The only disadvantage is that it has to be ran as root, so I need to be extra careful.
 */

// PS: Sorry I don't have any data collected or time to collect so I had to make up some data.