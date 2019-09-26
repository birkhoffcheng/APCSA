/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
import java.util.ArrayList;
public class TestCandidate6 {
	
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
	
	public static ArrayList<Candidate> replaceName(ArrayList<Candidate> candidates, String find, String replacement) {
		for ( int i = 0; i < candidates.size(); i++ )
			if ( candidates.get(i).getName().equalsIgnoreCase(find) )
				candidates.get(i).setName(replacement);
		return candidates;
	}
	
	public static ArrayList<Candidate> replaceVotes(ArrayList<Candidate> candidates, String name, int votes) {
		for ( int i = 0; i < candidates.size(); i++ )
			if ( candidates.get(i).getName().equalsIgnoreCase(name) )
				candidates.get(i).setNumVotes(votes);
		return candidates;
	}
	
	public static ArrayList<Candidate> replaceCandidate(ArrayList<Candidate> candidates, String nameToFind, String replacementName, int votes) {
		for ( int i = 0; i < candidates.size(); i++ )
			if ( candidates.get(i).getName().equalsIgnoreCase(nameToFind) ) {
				candidates.get(i).setName(replacementName);
				candidates.get(i).setNumVotes(votes);
			}
		return candidates;
	}
	
	public static ArrayList<Candidate> insertPostion(ArrayList<Candidate> candidates, int location, String nameToInsert, int votes) {
		candidates.add( location, new Candidate(nameToInsert, votes) );
		return candidates;
	}
	
	public static ArrayList<Candidate> insertCandidate(ArrayList<Candidate> candidates, String find, String nameToInsert, int votes) {
		int location = 0;
		for ( int i = 0; i < candidates.size(); i++ )
			if ( candidates.get(i).getName().equalsIgnoreCase(find) ) {
				location = i;
				break;
			}
		
		candidates.add( location, new Candidate(nameToInsert, votes) );
		return candidates;
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
