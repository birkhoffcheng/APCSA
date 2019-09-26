// Project Password Generator
// Purpose: Generate Pseudorandom Passwords
// Author: Birkhoff Cheng
// Version: 0.0.1
// PMR:
// My first practical Java program!
// Congratulations to myself!
// In C, converting ASCII value to number is much easier, just like a cast.
// But in Java, it's a function.
// If the text can be colored like in Python or in bash programs, it will be much cooler.
import java.util.Scanner;
public class Passwords
{
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
	
	public static void main(String[] args) throws InterruptedException
	{
		//variables and objects
		Scanner in = new Scanner(System.in);
		boolean exit = false;
		String lengthStr;
		int length, i, random;
		String passwd;
		String enter;
		String choice;
		
		while ( !exit ) {
			//user input
			System.out.print("Press Any Key To Continue...");
			enter = in.next();
			System.out.println("Random Passwords Generator. Choose the character set you want to use for password:\n");
			System.out.println("[0]0-9");
			System.out.println("[1]a-z, A-Z");
			System.out.println("[2]a-z, A-Z, 0-9");
			System.out.println("[3]a-z, A-Z, {[\\_`~|]}:;<=>?@");
			System.out.println("[4]a-z, A-Z. 0-9, {[\\_`~|]}:;<=>?@\n");
			System.out.println("[E]xit");
			System.out.print("\nEnter Your Choice: ");
			choice = in.next();
			
			//generate password
			if ( choice.equals("0") ) {
				System.out.print("Password length: ");
				lengthStr = in.next();
				if (containsDigit(lengthStr)) {
					length = Integer.parseInt(lengthStr);
					System.out.print("\n\nYour Password: ");
					for (i = 0; i < length; i++) {
						random = (int)(Math.random() * (double)10 + (double)48);
						passwd = Character.toString((char)random);
						System.out.print(passwd);
					}
					System.out.println("\n\n");
				}
				else {
					System.out.println("No number detected, enter again!");
				}
			}
			
			else if ( choice.equals("1") ) {
				System.out.print("Password length: ");
				lengthStr = in.next();
				if (containsDigit(lengthStr)) {
					length = Integer.parseInt(lengthStr);
					System.out.print("\n\nYour Password: ");
					for (i = 0; i < length; i++) {
						random = (int)(Math.random() * (double)57 + (double)65);
						if ( (random >= 91 && random <= 96) ) {
							i--;
						}
						else {
							passwd = Character.toString((char)random);
							System.out.print(passwd);
						}
					}
					System.out.println("\n\n");
				}
				else {
					System.out.println("No number detected, enter again!");
				}
			}
			
			else if ( choice.equals("2") ) {
				System.out.print("Password length: ");
				lengthStr = in.next();
				if (containsDigit(lengthStr)) {
					length = Integer.parseInt(lengthStr);
					System.out.print("\n\nYour Password: ");
					for (i = 0; i < length; i++) {
						random = (int)(Math.random() * (double)74 + (double)48);
						if ( (random >= 58 && random <= 64 ) || (random >= 91 && random <= 96) ) {
							i--;
						}
						else {
							passwd = Character.toString((char)random);
							System.out.print(passwd);
						}
					}
					System.out.println("\n\n");
				}
				else {
					System.out.println("No number detected, enter again!");
				}
			}
			
			else if ( choice.equals("3") ) {
				System.out.print("Password length: ");
				lengthStr = in.next();
				if (containsDigit(lengthStr)) {
					length = Integer.parseInt(lengthStr);
					System.out.print("\n\nYour Password: ");
					for (i = 0; i < length; i++) {
						random = (int)(Math.random() * (double)68 + (double)58);
						passwd = Character.toString((char)random);
						System.out.print(passwd);
					}
					System.out.println("\n\n");
				}
				else {
					System.out.println("No number detected, enter again!");
				}
			}
			
			else if ( choice.equals("4") ) {
				System.out.print("Password length: ");
				lengthStr = in.next();
				if (containsDigit(lengthStr)) {
					length = Integer.parseInt(lengthStr);
					System.out.print("\n\nYour Password: ");
					for (i = 0; i < length; i++) {
						random = (int)(Math.random() * (double)78 + (double)48);
						passwd = Character.toString((char)random);
						System.out.print(passwd);
					}
					System.out.println("\n\n");
				}
				else {
					System.out.println("No number detected!");
				}
			}
			
			else if ( choice.equalsIgnoreCase("E") ) {
				System.out.println("Thank you for using this program, catch you later!");
				exit = true;
			}
			
			else {
				System.out.println("Invalid Choice! Select again!");
			}
			
			lengthStr = "";
			length = 0;
		}
	}
}
