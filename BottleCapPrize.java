//Purpose: calculate the number of drinks to have for a prize
// author: Birkhoff Cheng
// version: 0.0.1
//PMR:
// I'm more careful with casting this time.
// and I have to keep it because it's important both in C and Java.
// But I heard it doesn't matter in JavaScript because there is no data types in js.
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
class BottleCapPrize
{
   public static void main (String [] args) throws IOException
   {
	PrintWriter file = new PrintWriter(new File("result.txt"));	//open file
	Scanner in = new Scanner(System.in);	//new scanner
	Random rand = new Random();
	
	//get the number
	System.out.print("Please enter the number of bottles of e-Boost you want to drink: ");
	int numDrink = in.nextInt();
	int prize = 0;
	double random;
	
	//drink
	for (int i = 1; i <= numDrink; i++) {
		random = rand.nextInt(5);
		if (random == 2) {
			file.println("Prize");
		}
		else {
			file.println("No prize");
		}
	}
	
	file.close();	//close file
	
	File fileName = new File("result.txt");
	Scanner inFile = new Scanner(fileName);
	
	String token;
	
	while ( inFile.hasNext() )
	{
		token = inFile.next();
		if ( token.equals("Prize") ) {
			prize++;
		}
	}
	
	//count
	int avg = (int)( (double)numDrink / (double)prize );
	
	//print
	System.out.println("You get a prize for every " + avg + " drinks.");
	
    }
}
