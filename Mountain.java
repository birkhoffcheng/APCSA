/**
 * Mountain terrain
 * @author birkhoff
 * @version 02/15/2018
 */
public class Mountain extends Terrain {
	
	private int numMountains;
	
	public Mountain(int l, int w, int numberOfMountains) {
		super(l, w);
		numMountains = numberOfMountains;
	}
	
	public int getNumMountains() {
		return numMountains;
	}
}