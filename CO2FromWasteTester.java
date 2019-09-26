/**
 * @purpose: Calculate the CO2 from household waste 8.11
 *
 * @author: Birkhoff Cheng
 * @version: 0.0.1
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
	public static void main(String[] args)
	{
		ArrayList<CO2FromWaste> cO2 = new ArrayList<CO2FromWaste>();
		cO2.add(new CO2FromWaste(1, true, true, false, true));
		cO2.add(new CO2FromWaste(3, true, true, true, true));
		cO2.add(new CO2FromWaste(7, false, true, true, true));
		cO2.add(new CO2FromWaste(5, false, false, false, true));
		cO2.add(new CO2FromWaste(4, true, true, true, false));
		cO2.add(new CO2FromWaste(2, false, true, false, true));

		for(CO2FromWaste dataRecord : cO2)
		{
			dataRecord.calcGrossWasteEmission();
			dataRecord.calcWasteReduction();
			dataRecord.calcNetWasteReduction();
		}

		System.out.println("|       |        |                                         |             Pounds of CO2             |");
		System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
		System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
		System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

		CO2FromWaste dataRecord;

		for(int index = 0; index < cO2.size(); index ++)
		{
			dataRecord = cO2.get(index);
			System.out.printf("|   %1d   |    %2d  |   %-5b  |  %-5b   |  %-5b  |  %-5b  |  %8.2f  |   %7.2f   |   %8.2f |%n", index, dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), dataRecord.getCans(), dataRecord.getEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());
		}
	}
}
/*
PMR:
The formatting table pre-written in this file is pretty good!
But one thing that is not cool is the formatting. They are all formatted by spaces, which is not preferred by me. So I had to manually replace spaces with tabs. Although this is troublesome, but I keep it all-tab for documenting use.
And one thing to mention: previously I thought ArrayList is some kind of its own class which acts like an array. But now I see it can be used the same way as normal array in for loop.
*/
