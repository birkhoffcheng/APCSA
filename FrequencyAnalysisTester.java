/**
 * Tester class for FrequencyAnalysis
 * @author birkhoff
 * @version 02/25/2018
 */
//import java.util.Scanner;
//import java.io.File;
import java.io.IOException;
public class FrequencyAnalysisTester {
	
	public static void main(String[] args) throws IOException
	{
		FrequencyAnalysis frequency = new FrequencyAnalysis();
		frequency.readFile();
		frequency.print();
//		frequency.writeFile();
	}
}
