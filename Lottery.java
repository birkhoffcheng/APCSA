/**
 * Description for 5.04 Lottery project
 * Online Lottery!
 * @author Birkhoff Cheng
 * @version 10/27/2017
 * PMR:
 * I used the "Thread.sleep()" function to wait. It's more effective. I don't have an IDE so I can't count time on my own.
 * Also the substring comparison was a little troublesome. I wish I could have a better way.
 */
import java.util.Scanner;
public class Lottery
{
	public static void main(String[] args) throws InterruptedException
	{
		//declare and initialized variables and objects
		Scanner in = new Scanner(System.in);
		
		String lotteryNum = "";
		String userGuess = "";
		int random, i;
				
		//Input: Ask user to guess 3 digit number
		System.out.print("Please enter your three numbers (e.g. 123): ");
		userGuess = in.next();
		int guess = Integer.parseInt(userGuess);
		Thread.sleep(1000);
		
		//Simulate a lottery by drawing one number at a time and concatenating it to the string
		System.out.print("Winner: ");
		for ( i = 0; i < 3; i++ )
		{
			Thread.sleep(2000);
			random = (int)( Math.random() * (double)9 );
			lotteryNum += Integer.toString(random);
			System.out.print( lotteryNum.substring(i,i+1) );
		}
		System.out.println();
		
		String lotFirstTwo = lotteryNum.substring(0,2);
		String usrFirstTwo = userGuess.substring(0,2);
		String lotLastTwo = lotteryNum.substring(1,3);
		String usrLastTwo = userGuess.substring(1,3);
		
		//Compare the user's guess to the lottery number and report results
		Thread.sleep(500);
		if ( lotteryNum.equals(userGuess) ) {
			System.out.println("Congratulations, both pair matched.");
		}
		else if ( lotFirstTwo.equals(usrFirstTwo) ) {
			System.out.println("Congratulations, the front pair matched.");
		}
		else if ( lotLastTwo.equals(usrLastTwo) ) {
			System.out.println("Congratulations, the end pair matched.");
		}
		else {
			System.out.println("Sorry, no matches. You only had one chance out of 100 to win anyway.");
		}
	}//end main
}//end class Lottery
