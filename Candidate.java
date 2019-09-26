/**
 * Candidate structure
 * @author birkhoff
 * @version 03/14/2018
 */
public class Candidate {
	
	private int numVotes;
	private String name;
	
	public Candidate(String name, int numVotes) {
		this.name = name;
		this.numVotes = numVotes;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumVotes() {
		return this.numVotes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumVotes(int votes) {
		this.numVotes = votes;
	}
	
	public String toString() {
		return this.name + " received " + this.numVotes + " votes.";
	}
	
}