/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
	CO2FromElectricity()
	{
	}

	public double calcAverageBill(ArrayList<Double> monthlyBill)
	{
		double total = 0;
		for (int i = 0; i < monthlyBill.size(); i++)
		{
			total += monthlyBill.get(i);
		}
		return total / (double)monthlyBill.size();
	}
	
	//This is so weird. Why can't we just have one calcAverage instead of two identical functions for two averages?
	public double calcAveragePrice(ArrayList<Double> monthlyPrice)
	{
		double total = 0;
		for (int i = 0; i < monthlyPrice.size(); i++)
		{
			total += monthlyPrice.get(i);
		}
		return total / (double)monthlyPrice.size();
	}

	public double calcElectricityCO2(double avgBill, double avgPrice)
	{
		return ( avgBill / avgPrice ) * 1.37 * 12.0;
	}
}
/*
DIAGRAM
-------------------------------------------------
|		CO2FromElectricity		|
-------------------------------------------------
|	Constructor				|
|+ CO2FromElectricity				|
|						|
|	Methods					|
|+ double calcAverageBill(ArrayList<Double> monthlyBill)
|+ double calcAveragePrice(ArrayList<Double> monthlyPrice)
|+ double calcElectricityCO2(double avgBill, double avgPrice)
-------------------------------------------------
*/
