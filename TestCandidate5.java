/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
public class TestCandidate5 {
	
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
	
	public static Candidate[] insertPostion(Candidate[] candidates, int location, String nameToInsert, int votes) {
		for(int i = candidates.length - 1; i > location; i--)
			candidates[i] = candidates[i-1];
		candidates[location] = new Candidate(nameToInsert, votes);
		return candidates;
	}
	
	public static Candidate[] insertCandidate(Candidate[] candidates, String find, String nameToInsert, int votes) {
		int location = 0;
		for ( int i = 0; i < candidates.length; i++ )
			if ( candidates[i].getName().equalsIgnoreCase(find) ) {
				location = i;
				break;
			}
		
		for(int i = candidates.length - 1; i > location; i--)
			candidates[i] = candidates[i-1];
		candidates[location] = new Candidate(nameToInsert, votes);
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
		
		election = insertPostion(election, 5, "Woody Pride", 19300);
		System.out.println("Added Woody Pride, 19300 votes:\n");
		printResults(election);
		System.out.println();
		
		election = insertCandidate(election, "Kathleen Turner", "Joy Anderson", 1100);
		System.out.println("Added Joy Anderson, 1100 votes:\n");
		printResults(election);
		System.out.println();
	}
	
}
/*
 * PMR:
 * In the array method, even if we cannot expand the array,
 * why don't we just create and return a new array?
 */
