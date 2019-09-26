/**
 * Test for Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
import java.util.ArrayList;
public class TestCandidate2 {
	
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
	
	public static void main(String[] args) {
		
		ArrayList<Candidate> election = new ArrayList<Candidate>(0);
		
		election.add( new Candidate("John Smith", 5000) );
		election.add( new Candidate("Mary Miller", 4000) );
		election.add( new Candidate("Michael Duffy", 6000) );
		election.add( new Candidate("Tim Robinson", 2500) );
		election.add( new Candidate("Joe Ashtony", 1800) );
		
		printVotes(election);
		System.out.println();
		printResults(election);
	}
	
}
/*
 * PMR:
 * After experimenting with two types of arrays, I think the built-in array works better when the number of items is fixed.
 * Because then you can use the for ( type a : array ) structure to make loops a lot easier.
 */