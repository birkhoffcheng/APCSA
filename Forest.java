/**
 * Forest terrain
 * @author birkhoff
 * @version 02/15/2018
 */
public class Forest extends Terrain {
	
	private int numTrees;
	
	public Forest(int l, int w, int numberOfTrees) {
		super(l, w);
		numTrees = numberOfTrees;
	}
	
	public int getNumTrees() {
		return numTrees;
	}
}