/**
 * MorseCode tester class.
 * @author birkhoff
 * @version 02/20/2018
 */
import java.util.Scanner;
import java.io.IOException;
public class MorseCodeTester {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		MorseCode morse = new MorseCode();
		System.out.println("Please enter your message:");
		String input = in.nextLine();
		System.out.println(morse.convert(input));
		in.close();
	}
}
