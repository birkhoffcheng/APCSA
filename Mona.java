/*
 * Project Name: Book Overdue Calculator / Mona
 * Purpose of Project: Get input from user, calculate the overdue fine, display it with email format
 * Created by: Birkhoff Cheng
 * Date: 09/27/2017
 * PMR:
 * No errors, good programming habit! Engineering and structure still need to be improved
 * Found a bad habit of mine: don't like to comment, have to change that
 */

import java.util.Scanner;	// import Scanner class
public class Mona {
	public static void main(String[] args)
	{
		// scanner object
		Scanner input = new Scanner(System.in);

		// get the name
		System.out.print("Enter the name (Last, First): ");
		String lastname = input.next();
		String firstname = input.next();
		System.out.println();

		// remove the comma
		if (lastname != null && lastname.length() > 0 && lastname.charAt(lastname.length() - 1) == ',')
			lastname = lastname.substring(0, lastname.length() - 1);

		// get other information
		System.out.print("Enter the phone number (XXX) XXX-XXXX: ");
		String phone = input.next();
		phone += input.nextLine();
		System.out.println();
		System.out.print("Enter the title of the book: ");
		String book = input.next();
		book += input.nextLine();
		System.out.println();
		System.out.print("Enter the date checked out (mm/dd/yyyy): ");
		String dateCO = input.next();
		System.out.println();
		System.out.print("Days late: ");
		String daysLatestr = input.next();
		int daysLate = Integer.parseInt( daysLatestr );
		System.out.println();
		System.out.print("Daily fine: ");
		String dailyFinestr = input.next();
		double dailyFine = Double.parseDouble( dailyFinestr );
		double fine = (double)daysLate * dailyFine;
		String tmp = firstname.substring(0,1) + lastname.substring(0,2);
		String email = tmp.toLowerCase() + phone.substring(phone.length()-4,phone.length()) + "@csamediacenter.com";
		String dateOut = dateCO.substring(0,2) + "-" + dateCO.substring(3,5) + "-" + dateCO.substring(6,dateCO.length());

		// output
		System.out.println("\n===============Text for email message===============\n");
		System.out.println("To: " + firstname + " " + lastname + " (" + email + ")\n");
		System.out.println("From: Mona (mona@csamediacenter.com)\n");
		System.out.println("Subject: Overdue Book Notice\n");
		for ( int i = 0; i <= 40; i++)
			System.out.print("=");
		System.out.println();
		System.out.println(book + " was checked out on: " + dateOut);
		System.out.print("This book is currently " + daysLate);
		if ( daysLate <= 1)
			System.out.print(" day");
		else
			System.out.print(" days");
		System.out.println(" late.");
		System.out.println("Your fine has accumulated to: $" + fine);
	}
}
