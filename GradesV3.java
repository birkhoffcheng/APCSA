/**
 * Project Name: Grade Calculator / GradesV2
 * Purpose of Project: Get number of grades from user input,
 * record each grade from user input,
 * and automatically calculate the average grade of the user
 * Version: 2.0
 *
 * Created by: Birkhoff Cheng
 * Date: 09/05/2017
 *
 * *****************P M R*********************************
 * Getting user input is the key point of this program,
 * so I Googled it. And it works well.
 * *******************************************************
 */

import java.util.Scanner;

public class GradesV3 {

	public static void main(String[] args)
	{
		//local variables
		int i;
		int numTests = 0; //counts number of tests
		int testGrade = 0; //individual test grade
		int totalPoints = 0; //total points for all tests
		double average = 0.0; //average grade

		//Scanner function
		Scanner scan = new Scanner(System.in);
		
		//Get number of tests
		// System.out.print("How many grades do you want to calculate? ");
		// numTests = scan.nextInt();
		// System.out.println("Calculating average of " + numTests + " grades for you");

		System.out.println("Tips: enter 3817 and press Enter to exit");

		while ( testGrade != 3817 ) {
			System.out.print("Input your grade: ");
			testGrade = scan.nextInt();
			if ( testGrade == 3817 ) {
				System.out.println("Your final GPA is " + average + ". Thank you for using this program!");
				System.out.println("exit");
				break;
			}
			numTests++;
			totalPoints = totalPoints + testGrade;
			average = (double) totalPoints / (double) numTests;
			System.out.println("Grade " + testGrade + " added! Total Points: " + totalPoints + " Average Score: " + average);
		}
	}
}
