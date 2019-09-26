/**
 * Description for 4.03 Target Zone project
 * 
 * @author Birkhoff Cheng
 * @version 0.0.1
 * PMR:
 * This program is so terribly formatted!
 * Maybe someone used Windows to edit it and changed the encoding format (after which I used Linux to edit it)
 * Therefore, during the programming, all of the auto-formatting tools in vim don't work at all.
 * It is not only about aesthetics, but errors.
 * Because the formatting doesn't work, I didn't notice two missing closing parentheses, causing two errors.
 * I should have rewritten this, but I am too lazy to do so.
 * But I feel like I should use Sublime Text to edit things on my Linux computer because I see so many people using it.
 */
import java.util.Scanner;
public class TargetZone
{
	public static void main(String[] args)
	{
		//Initialize and declare variables
		String target;
		Scanner in = new Scanner(System.in);
        
		//Prompt user for input
		System.out.println("Target Heart Rate Zone Calculator\n");
		System.out.print("Please enter your age: ");
		String ageStr = in.next();	//get age
		int age = Integer.parseInt(ageStr);
		System.out.print("Please enter your resting heart rate: ");
		String rhrStr = in.next();	//get RHR
		int rhr = Integer.parseInt(rhrStr);
		System.out.print("Please enter your heart rate after exercising: ");
		String hraeStr = in.next();	//get heart rate after exercising
		int hrae = Integer.parseInt(hraeStr);
 
		//Calculate heart rate target zone min and max
		int mhr = (int)( 206.9 - ( 0.67 * (double)age ) );	//Maximum Heart Rate
		int hrr = mhr - rhr;	//Heart Rate Reserve
		int min = (int)( ( (double)hrr * 0.65 ) + (double)rhr );	//Minimum Heart Rate
		int max = (int)( ( (double)hrr * 0.85 ) + (double)rhr );	//Maximum Heart Rate
		boolean within = hrae >= min && hrae <= max;

		//Determine if heart rate after exercise is between the min and max
		if ( within )
			target = "within";

		//If the heart rate is below, change the value of target to "below".
		else if ( hrae < min )
                        target = "below";

		//If the heart rate is above, change the value of target to "above".
		else
                        target = "above";

		//Print two output statements
		System.out.println();
		//The first stating the heart rate target zone
		System.out.println("Your heart rate target zone is between " + min + " and " + max + ".");

		//The second stating if the heart rate after exercise  was within, above or below
		System.out.println("After just exercising, your heart rate is " + target + " your target zone.");

		//the target zone. The variable "target" will have a value of within, above or below


	}	//end main
}	//end class TargetZone
