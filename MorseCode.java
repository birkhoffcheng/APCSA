/**
 * Morse encoder.
 * @author birkhoff
 * @version 02/20/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode {

	public MorseCode(){}

	public String convert(String input) throws IOException
	{
		input = input.toLowerCase();
		File file = new File("morsecode.txt");
		Scanner inFile = new Scanner(file);
		String[] morseCode = new String[36];
		char[] alphaNum = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
		int i, j, counter = 0;

		while ( inFile.hasNext() ) {
			morseCode[counter] = inFile.next();
			counter++;
		}
		inFile.close();

		String output = "";
		char[] message = input.toCharArray();

		for ( i = 0; i < message.length; i++ ) {
			for ( j = 0; j < alphaNum.length; j++ ) {
				if ( message[i] == alphaNum[j] )
					output += morseCode[j] + "\t";
			}
		}

		return output;
	}
}
/*
PMR:
This assignment is weird.
How is it possible to not use any object when reading from standard input or files?
And how to handle strings without using the String object?
There isn't any method to read input and directly store into char arrays like scanf in C.
I don't know how I am supposed to do this.
But anyway, I got it to work.
When reading 14.00 Lesson page, I though we are going to deal with Diffie-Hellman key exchange or RSA of some kind.
But it turned out not as I expected.
*/
