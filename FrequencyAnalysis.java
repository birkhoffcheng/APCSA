/**
 * Analyze the letter occurrences in a text file and decipher a message.
 * @author Birkhoff
 * @version 02/25/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FrequencyAnalysis {
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private int[] occurrences = new int[ALPHABET.length()];
	private double[] frequencies = new double[ALPHABET.length()];
	
	public FrequencyAnalysis(){}
	
	public void readFile() throws IOException
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Filename: ");
		String filename = stdin.nextLine();
		Scanner inFile = new Scanner(new File(filename));
		String token = "";
		int i, charIndex, total = 0;
		
		while ( inFile.hasNext() ) {
			token = inFile.next();
			token = token.replaceAll("[^a-zA-Z]", "").toLowerCase();
			for ( i = 0; i < token.length(); i++ ) {
				charIndex = ALPHABET.indexOf(token.charAt(i));
				this.occurrences[charIndex]++;
				total++;
			}
		}
		
		for ( i = 0; i < occurrences.length; i++ ) {
			this.frequencies[i] = (double)this.occurrences[i] / (double)total;
		}
		
		inFile.close();
	}
	
	public void print() {
		System.out.println("Letter\tOccured\tFrequency");
		for ( int i = 0; i < ALPHABET.length(); i++ ) {
			System.out.println( ALPHABET.charAt(i) + "\t" + this.occurrences[i] + "\t" + this.frequencies[i] );
		}
	}
	
	public void writeFile() throws IOException
	{
		PrintWriter outFile = new PrintWriter(new File("plaintextfreq.txt"));
		outFile.println("Letter\tOccured\tFrequency");
		for ( int i = 0; i < ALPHABET.length(); i++ ) {
			outFile.println( ALPHABET.charAt(i) + "\t" + this.occurrences[i] + "\t" + this.frequencies[i] );
		}
		outFile.close();
	}
}
