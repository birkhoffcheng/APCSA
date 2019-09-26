import java.util.Scanner;
/**
 * A simple class to run the Magpie class.
 * @author Birkhoff Cheng
 * @version 02/12/2018
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equalsIgnoreCase("Bye"))
		{
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
//	PMR: This is kind of good. Fun fact: I tried to use exit to quit at the first run. Later I know it is Bye.
