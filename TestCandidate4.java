/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
import java.util.ArrayList;
public class TestCandidate4 {
	
	public static void printVotes(ArrayList<Candidate> candidates) {
		System.out.println("Results per candidate:\n");
		for ( int i = 0; i < candidates.size(); i++ ) {
			System.out.println(candidates.get(i));
		}
	}
	
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
		
		election = replaceName(election, "Michael Duffy", "John Elmos");
		election = replaceVotes(election, "Mickey Jones", 2500);
		election = replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
		
		System.out.println("Changing Michael Duffy to John Elmos:\n");
		printResults(election);
	}
	
}
/*
 * PMR:
 * Now I found the shortcut to the conversion between array and ArrayList.
 * Basically I just replace all Candidate[] with ArrayList<Candidate>,
 * candidates[i] with candidates.get(i)
 * length with size()
 * then I change all election[i] to election.add() statement manually.
 * And that's it.
 */