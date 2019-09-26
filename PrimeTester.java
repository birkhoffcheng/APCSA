/**
 * Tester for Prime
 * @author birkhoff
 * @version 02/22/2018
 */
import java.util.Scanner;
public class PrimeTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Prime numbers generator");
		System.out.print("Input your limit: ");
		int limit = in.nextInt();
		in.close();
		Prime prime = new Prime(limit);
		prime.generate();
		System.out.println("Number of prime numbers under " + limit + ": " + prime.getPrime().size() );
		for ( int i = 0; i < prime.getPrime().size(); i++ ) {
			System.out.print( prime.getPrime().get(i) + "\t" );
		}
		System.out.println();
	}
}
