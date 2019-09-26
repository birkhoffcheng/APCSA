/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/15/2018
 */
public class TestCandidate7 {
	
	public static int getTotal(Candidate[] candidates) {
		int total = 0;
		for ( Candidate c : candidates ) {
			if ( c != null )
				total += c.getNumVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate[] candidates) {
		int total = getTotal(candidates);
		System.out.println("Candidate\tVotes Received\t% of Total Votes");
		double percent;
		for ( Candidate c : candidates ) {
			if ( c != null ) {
				System.out.print( c.getName() + "\t" + c.getNumVotes() + "\t\t" );
				percent = (double)c.getNumVotes() / (double)total * 100.0;
				System.out.printf("%.2f\n", percent);
			}
		}
		System.out.println( "\nTotal\t\t" + total );
	}
	
	public static void deleteByLoc(Candidate[] candidates, int location) {          
		if ((location > 0) && (location < candidates.length)) {
			for(int i = location; i < candidates.length -1; i++)
				candidates[i] = candidates[i + 1];
			candidates[candidates.length-1] = null;
		}
	}


	public static void deleteByName(Candidate[] candidates, String find) {
		int location = 0;
		int i;

		for( i = 0; i < candidates.length; i++ )
			if ( (candidates[i] != null) && (candidates[i].getName().equals(find)) ) { 
				location = i;
				break;
			}
			else if (candidates[i] == null) {
				location = -1;
				break;
			}

		if ( (i != candidates.length) && (location >= 0) ) {
			for( i = location; i < candidates.length -1; i++ )
				candidates[i] = candidates[i + 1];
			candidates[candidates.length-1] = null;
		}
	}
	
	public static void main(String[] args) {
		
		Candidate[] election = new Candidate[10];
		
		election[0] = new Candidate("John Smith", 5000);
		election[1] = new Candidate("Mary Miller", 4000);
		election[2] = new Candidate("Michael Duffy", 6000);
		election[3] = new Candidate("Tim Robinson", 2500);
		election[4] = new Candidate("Joe Ashtony", 1800);
		election[5] = new Candidate("Mickey Jones", 3000);
		election[6] = new Candidate("Rebecca Morgan", 2000);
		election[7] = new Candidate("Kathleen Turner", 8000);
		election[8] = new Candidate("Tory Parker", 500);
		election[9] = new Candidate("Ashton Davis", 10000);
		
		System.out.println("Original Results:\n");
		printResults(election);
		System.out.println();
		
		deleteByLoc(election, 6);
		System.out.println("Deleted location 6:\n");
		printResults(election);
		System.out.println();
		
		deleteByName(election, "Kathleen Turner");
		System.out.println("Deleted Kathleen Turner:\n");
		printResults(election);
		System.out.println();
	}
	
}
/*
 * PMR:
 * Today I learned a very important lesson:
 * In Java, there is no passing by value.
 * There is only passing by reference.
 * Passing by value or reference is a concept in C.
 * Passing by value makes function called unable to change the argument variable.
 * Passing by reference makes function capable of changing the value of the variable passed,
 * since we give it the variable's memory address.
 * 
 * So I always thought we have to have return the new value in Java.
 * But I was wrong, an argument in Java is passed as reference.
 */