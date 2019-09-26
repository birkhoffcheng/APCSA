/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
public class TestCandidate {
	
	public static void printVotes(Candidate[] candidates) {
		System.out.println("Results per candidate:\n");
		for ( Candidate c : candidates ) {
			System.out.println(c);
		}
	}
	
	public static int getTotal(Candidate[] candidates) {
		int total = 0;
		for ( Candidate c : candidates ) {
			total += c.getNumVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate[] candidates) {
		int total = getTotal(candidates);
		System.out.println("Candidate\tVotes Received\t% of Total Votes");
		double percent;
		for ( Candidate c : candidates ) {
			System.out.print( c.getName() + "\t" + c.getNumVotes() + "\t\t" );
			percent = (double)c.getNumVotes() / (double)total * 100.0;
			System.out.printf("%.2f\n", percent);
		}
		System.out.println( "\nTotal\t\t" + total );
	}
	
	public static void main(String[] args) {
		
		Candidate[] election = new Candidate[5];
		
		election[0] = new Candidate("John Smith", 5000);
		election[1] = new Candidate("Mary Miller", 4000);
		election[2] = new Candidate("Michael Duffy", 6000);
		election[3] = new Candidate("Tim Robinson", 2500);
		election[4] = new Candidate("Joe Ashtony", 1800);
		
		printVotes(election);
		System.out.println();
		printResults(election);
	}
	
}