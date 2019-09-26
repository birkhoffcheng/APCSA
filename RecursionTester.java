/**
 * @author birkhoff
 * @version 0.0.1
 * purpose: test Recursion class
 */
public class RecursionTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int function1Parameter = 25;
		double function2Parameter = 30.0;
		int function3Parameter = 500;
		
		Recursion functions = new Recursion();
		
		int function1Result = functions.f1(function1Parameter);
		double function2Result = functions.f2(function2Parameter);
		int function3Result = functions.f3(function3Parameter);
		
		System.out.println("f1(" + function1Parameter + ") = " + function1Result);
		System.out.println("f2(" + function2Parameter + ") = " + function2Result);
		System.out.println("f3(" + function3Parameter + ") = " + function3Result);
	}
}
/*
 * PMR: Recently I've read a lot of GitHub bash programs, and they seems to follow the rule of putting preset parameters at the beginning, so somebody who uses it
 * can easily find how to tweak it. And I used this in my program too.
 * 
 * The ability to call a function itself is amazing, but also dangerous. Remember how fork bomb works?
 * It defines a function that does nothing but calling itself twice a time.
 * In Linux, it is called forking (one process calling two or more subprocesses).
 * So once it is executed for the first time, it will call itself again and again until the computer runs out of memory and crashes.
 * The command for this is
 * :(){:|:&};:
 * So we define a function named ":", which takes no parameter().
 * The function executes itself, pumps the output to itself (twice).
 * And "&" means running it in the background (so it cannot be stopped by pressing Control-C).
 * Then ";" means end of the function.
 * After that we call the function for the first time ":".
 * You can try to run it on a virtual machine (or your friend's computer). Note this only works in Linux or Mac terminal.
 */
