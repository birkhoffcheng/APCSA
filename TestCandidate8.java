/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/15/2018
 */
import java.util.ArrayList;
public class TestCandidate8 {
	
	public static int getTotal(ArrayList<Candidate> candidates) {
		int total = 0;
		for ( int i = 0; i < candidates.size(); i++ ) {
			total += candidates.get(i).getNumVotes();
		}
		return total;
	}
	
	public static void printResults(ArrayList<Candidate> candidates) {
		int total = getTotal(candidates);
		System.out.println("Candidate\tVotes Received\t% of Total Votes");
		double percent;
		for ( int i = 0; i < candidates.size(); i++ ) {
			System.out.print( candidates.get(i).getName() + "\t" + candidates.get(i).getNumVotes() + "\t\t" );
			percent = (double)candidates.get(i).getNumVotes() / (double)total * 100.0;
			System.out.printf("%.2f\n", percent);
		}
		System.out.println( "\nTotal\t\t" + total );
	}
	
	public static void deleteByLoc(ArrayList<Candidate> candidates, int location) {          
		candidates.remove(location);
	}

	public static void deleteByName(ArrayList<Candidate> candidates, String find) {
		int location = 0;
		int i;

		for( i = 0; i < candidates.size(); i++ )
			if ( (candidates.get(i) != null) && (candidates.get(i).getName().equals(find)) ) { 
				location = i;
				break;
			}
			else if (candidates.get(i) == null) {
				location = -1;
				break;
			}

		candidates.remove(location);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Candidate> election = new ArrayList<Candidate>(0);
		
		election.add( new Candidate("John Smith", 5000) );
		election.add( new Candidate("Mary Miller", 4000) );
		election.add( new Candidate("Michael Duffy", 6000) );
		election.add( new Candidate("Tim Robinson", 2500) );
		election.add( new Candidate("Joe Ashtony", 1800) );
		election.add( new Candidate("Mickey Jones", 3000) );
		election.add( new Candidate("Rebecca Morgan", 2000) );
		election.add( new Candidate("Kathleen Turner", 8000) );
		election.add( new Candidate("Tory Parker", 500) );
		election.add( new Candidate("Ashton Davis", 10000) );
		
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