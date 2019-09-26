/**
 * Purpose: simulate gender ratio based on the population entered
 * 
 * @author Birkhoff Cheng
 * @version 0.0.1
 * PMR:
 * I could have used for loop, but anyway, this session is about while
 * Just a little practice.
 */
import java.util.Scanner;
public class PopulationRatio
{
	public static void main(String[] args)
	{
		//declare variables
	    int male = 0;
	    int female = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    //get population size
	    System.out.print("Total population you want to simulate: ");
	    int ppl = in.nextInt();
	    
	    while(counter <= ppl)
	    {
		//generate a random number
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        //calculate ratio
	        if(randNum < 0.463087)
	        {
	            male++;
	            System.out.println("\t males");
	        }
	        else
	        {
	            female++;
	            System.out.println("\t females");
	           }
	        counter++;      
	    }
		//print statistics
	    System.out.println();
	    System.out.println("Number of Males = " + male);
	    System.out.println("Number of Females = " + female);
	}
}
