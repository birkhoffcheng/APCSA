/**
 * Description for 5.05 Dice Probability project
 * Purpose: Calculate the dice probability
 * @author Birkhoff Cheng
 * @version 10/31/2017
 * PMR:
 * I don't think I fully understand this assignment. According to my possibly wrong understanding, there is no need to use nested loop.
 * But array is really useful in counting.
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
	//Declare and initialize variables and objects
	Scanner in = new Scanner(System.in);
	Random randNum = new Random();
	int sum = 0;
	int numSides = 0;
	int numRolls = 0;
//	int match = 0; //Number of times sum of dice matches the current sum
	int die1 = 0;
	int die2 = 0;
	double probability = 0.0;
	
	//Input: ask user for number of rolls and number of sides on a die
	System.out.print("Please enter the number of rolls: ");
	numRolls = in.nextInt();
	System.out.print("Please enter the number of sides on a die: ");
	numSides = in.nextInt();
	
	int numPossibilities = numSides * 2;
	int size = numSides * 2 + 5;
	int possibilities[] = new int[size];
	for (int i = 0; i < size; i++) {
		possibilities[i] = 0;
	}
	
	//Print heading for output table
	System.out.print("\nSum of dice\tProbability\n");

	//***************************************************************************************
	//Using nested loops, cycle through the possible sums of the dice.
	//Roll the dice the given number of times for each sum.
	//Count how many times the sum of the dice match the current sum being looked for.
	//***************************************************************************************
	//Loop to increment through the possible sums of the dice
		//Loop to throw dice given number of times
		for( int roll  = 0; roll < numRolls; roll++ )
		{
			//Randomly generate values for two dice		
			die1 = randNum.nextInt( numSides ) + 1;
			die2 = randNum.nextInt( numSides ) + 1;
			sum = die1 + die2;
			possibilities[sum] = possibilities[sum] + 1;
		}
	//After all throws, calculate percentage of throws that resulted in the given sum
	for( sum = 2; sum <= numPossibilities; sum++ )
	{
		probability = (double)possibilities[sum] / (double)numRolls * (double)100;	//forgot to cast again...
		System.out.println("    " + sum + "\t\t" + probability + "%");	//Print results
	}
    }
}
