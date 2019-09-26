/**
 * Generate Prime Numbers
 * @author birkhoff
 * @version 02/22/2018
 */
import java.util.ArrayList;
public class Prime {

	private int max;
	private ArrayList<Integer> prime = new ArrayList<Integer>();

	/**
	 * @param max The upper limit of prime numbers
	 */
	public Prime(int max){
		this.max = max;
	}

	/**
	 * Generate prime numbers under the given limit
	 * @return an array of prime numbers under the upper limit
	 */
	public void generate() {
		int p, i;
		boolean isPrime;
		
		// Initilize first two prime numbers
		this.prime.add(2);
		this.prime.add(3);
		
		// Set the loop to only check odd numbers
		for ( p = 5; p <= this.max; p = p + 2 ) {
			isPrime = true;
			
			// Loop and ensure current number does not exceed the square root of any previous prime number
			for ( i = 0; isPrime && p / this.prime.get(i) >= this.prime.get(i); i++ )
				if ( p % this.prime.get(i) == 0)
					isPrime = false;

			if ( isPrime )
				this.prime.add(p);

		}
	}

	public ArrayList<Integer> getPrime() {
		return this.prime;
	}
}
/*
PMR:
I did a few refinement to speed up the process of generating prime numbers.
As you know, Java first compiles code into bitcode which is then translated again into machine code by JVM upon execution.
This design makes Java .class file executable on any CPU or platform but greatly lower the performance.
In contrast, C just compiles code directly into machine code and execute. So C is faster.
But code compiled on one CPU architecture can only be run on that specific type of CPU.
So I have to manage to improve performance when writing Java code.
*/
