/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
public class TestCandidate3 {
	
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
	
	public static Candidate[] replaceName(Candidate[] candidates, String find, String replacement) {
		for ( int i = 0; i < candidates.length; i++ )
			if ( candidates[i].getName().equalsIgnoreCase(find) )
				candidates[i].setName(replacement);
		return candidates;
	}
	
	public static Candidate[] replaceVotes(Candidate[] candidates, String name, int votes) {
		for ( int i = 0; i < candidates.length; i++ )
			if ( candidates[i].getName().equalsIgnoreCase(name) )
				candidates[i].setNumVotes(votes);
		return candidates;
	}
	
	public static Candidate[] replaceCandidate(Candidate[] candidates, String nameToFind, String replacementName, int votes) {
		for ( int i = 0; i < candidates.length; i++ )
			if ( candidates[i].getName().equalsIgnoreCase(nameToFind) ) {
				candidates[i].setName(replacementName);
				candidates[i].setNumVotes(votes);
			}
		return candidates;
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
		
		election = replaceName(election, "Michael Duffy", "John Elmos");
		election = replaceVotes(election, "Mickey Jones", 2500);
		election = replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
		
		System.out.println("Changing Michael Duffy to John Elmos:\n");
		printResults(election);
	}
	
}