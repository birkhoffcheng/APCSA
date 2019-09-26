// author: Birkhoff Cheng
// version 0.0.1
// purpose: read family info from a file and calculate the percentage of each possibility
// PMR: I still don't know how to actually get the line number and how to scan enter and space.
// I will learn them.
// Plus, I plan to learn JavaScript recently.
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
	public static void main(String[] args) throws IOException
	{
		File fileName = new File("MaleFemaleInFamily.txt");	//open file
		Scanner inFile = new Scanner(fileName);	//create scanner
		
		//declare variables
		int sampleSize = 0;
		int twoBoys = 0;
		int twoGirls = 0;
		int oneEach = 0;
		String token = "";
		
		//reading file
		while ( inFile.hasNext() )
		{
			token = inFile.next();
			if ( token.equals("GB") || token.equals("BG") )
			{
				oneEach++;
			} else if ( token.equals("BB") ) {
				twoBoys++;
			} else if ( token.equals("GG") ) {
				twoGirls++;
			} else {
				System.out.println("Invalid sample in line " + (sampleSize + 1));
				sampleSize--;
			    }
			}
			sampleSize++;
		}
		
		//calculation
		double tb = (double)twoBoys / (double)sampleSize * 100.0;
		double oe = (double)oneEach / (double)sampleSize * 100.0;
		double tg = (double)twoGirls / (double)sampleSize * 100.0;
		
		//output result
		System.out.println("Sample Size: " + sampleSize);
		System.out.println("Two Boys: " + twoBoys + "		" + tb + "%");
		System.out.println("One Boy One Girl: " + oneEach + "		" + oe + "%");
		System.out.println("Two Girls: " + twoGirls + "		" + tg + "%");
		System.out.println("\nThank you for using this program created by Birkhoff!");
	}
}
