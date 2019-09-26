/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
	public static void main(String[] args)
	{
		CO2FromElectricity CO2 = new CO2FromElectricity();

		ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
		ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

		//Values to add to the monthly bill or use your own:
		//	209.60, 249.68. 222.59
		monthlyBill.add(209.60);
		monthlyBill.add(249.68);
		monthlyBill.add(222.59);

		// Values to add to the monthly Price or use your own:
		// (209.70 / 2464), (249.68 / 2948), (222.59 / 2621)
		monthlyPrice.add(209.70 / 2464.0);
		monthlyPrice.add(249.68 / 2948.0);
		monthlyPrice.add(222.59 / 2621.0);

		double avgBill = CO2.calcAverageBill(monthlyBill);
		double avgPrice = CO2.calcAveragePrice(monthlyPrice);
		double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

		System.out.printf("Average Monthly Electricity Bill:\t\t%.2f kWh%n", avgBill);
		System.out.printf("Average Monthly Electricity Price:\t\t$%.2f /kWh%n", avgPrice);
		System.out.printf("Annual CO2 Emissions from Electricity Usage:\t%3.1f pounds\n", emissions);
	}
}
/*
PMR:
In the CO2FromElectricity class, it's pretty weird and inefficient to write two functions to do the exact same thing--calculate the average of an ArrayList.
But the flexibility of ArrayList is great. This is certainly a very useful pre-written class.
Sometimes I find Tabs are more efficient in keeping output in order.
DIAGRAM
-------------------------------------------------
|	CO2FromElectricityTester		|
-------------------------------------------------
|	In main() Method			|
|+ CO2FromElectricity CO2			|
|+ ArrayList<Double> monthlyBill		|
|+ ArrayList<Double> monthlyPrice		|
|+ double avgBill				|
|+ double avgPrice				|
|+ double emissions				|
-------------------------------------------------
*/
