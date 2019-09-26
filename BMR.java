// Project: BMR
// Author: Birkhoff Cheng
// Version: 0.0.1
// PMR:
// I figured out why the formatting won't work.
// I was previously working on a Ubuntu 17.04 Virtual Machine (the host is a Windows), so I got the newest update of vim.
// But recently I switched my host system to Ubuntu 16.04, since it's more stable and long-term supported.
// But the vim doesn't have fancy features as 17.04 do. I can still have partial function by typing ":set autoindent".
// However, this time I made quite an error by evaluating String as char. But later I changed it back to char.

import java.util.Scanner;
public class BMR
{
	public static void main (String[] args)
	{
		//scanner object
		Scanner input = new Scanner(System.in);

		//get user input
		System.out.print("Please enter your name: ");
		String name = input.next();
		boolean isMale = true;
		System.out.print("Gender (M or F): ");
		char sex = input.next().charAt(0);
		if ( sex == 'M' || sex == 'm' )
		{
			isMale = true;
		}
		else if ( sex == 'F' || sex == 'f' )
		{
			isMale = false;
		}
		else
		{
			System.out.println("Unrecognized input! Default Male.");
		}
		System.out.print("Please enter your age: ");
		String ageStr = input.next();
		int age = Integer.parseInt(ageStr);

		System.out.print("Height in inches: ");
		String heightStr = input.next();
		double height = Double.parseDouble(heightStr);

		System.out.print("Weight in pounds: ");
		String weightStr = input.next();
		double weight = Double.parseDouble(weightStr);

		//calculation
		System.out.println("\n\nCalculating your Basal Metabolism...\n");
		weight = weight * 0.453592;
		height = height * 2.54;
		double p;
		if ( isMale )
		{
			p = ( 13.7516 * weight + 5.0033 * height - 6.755 * (double)age + 66.4730 );
		}
		else
		{
			p = ( 9.5634 * weight + 1.8496 * height - 4.6756 * (double)age + 655.0955 );
		}
		
		//display output
		System.out.println("Name: " + name);
		System.out.println("Gender: " + sex);
		System.out.println("Age: " + age);
		System.out.printf("Weight (kg): %.1f\n", weight);
		System.out.printf("Height (cm): %.1f\n", height);
		System.out.printf("Basal Metabolic Rate: %.1f calories per day.\n", p);
	}
}
