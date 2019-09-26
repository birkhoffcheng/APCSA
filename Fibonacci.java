/**
 * @author birkhoff
 * @version 02.06
 * Purpose: calculate the nth fibonacci number based on user-entered n.
 */
import java.util.Scanner;
public class Fibonacci {
	
	public static boolean containsDigit(String s) {
		boolean containsDigit = false;
		if (s != null && !s.isEmpty()) {
			for (char c : s.toCharArray()) {
				if (!Character.isDigit(c)) {
					containsDigit = false;
					break;
				}
				else {
					containsDigit = true;
				}
			}
		}
		return containsDigit;
	}
	
	public static int fibonacci(int index) {
		if ( index == 0 ) {
			return 0;
		}
		else if ( index == 1 ) {
			return 1;
		}
		else {
			return fibonacci(index - 2) + fibonacci(index - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Which fibonacci number do you want to calculate (nth, n>=1)? ");
		String indexStr = input.next();
		input.close();
		
		if ( !containsDigit(indexStr) ) {
			System.out.println("You may enter only numerical values!");
			return;
		}
		
		int index = Integer.parseInt(indexStr);
		
		if ( index < 1 ) {
			System.out.println("You may enter only integer value larger than or equal to 1");
			return;
		}
		
		if ( index != 11 && index % 10 == 1 ) {
			System.out.print("The " + index + "st fibonacci number is ");
		}
		else if ( index != 12 && index % 10 == 2 ) {
			System.out.print("The " + index + "nd fibonacci number is ");
		}
		else if ( index != 13 && index % 10 == 3 ) {
			System.out.print("The " + index + "rd fibonacci number is ");
		}
		else {
			System.out.print("The " + index + "th fibonacci number is ");
		}
		System.out.print( fibonacci(index - 1) );
		System.out.println();
	}
}
/*
 * PMR:
 * I think I should be more cautious while writing programs to prevent invalid user inputs from now on.
 * After all, if it was for commercial use, a failure to check a parameter could lead to a bug or a hack.
 * 
 * He washed 8 cows.
 */