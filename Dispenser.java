/**
 * Sale Dispenser
 * @author birkhoff
 * @version 04.05
 */
public class Dispenser {
	
	private int numberOfItem, cost;
	
	public Dispenser() {
		numberOfItem = 50;
		cost = 50;
	}
	
	public Dispenser(int numItem, int cost) throws IllegalArgumentException {
		if (numItem < 0 || cost < 0)
			throw new IllegalArgumentException("Invalid argument for dispenser");
		else {
			this.numberOfItem = numItem;
			this.cost = cost;
		}
	}
	
	public int getCount() {
		return numberOfItem;
	}
	
	public int getProductCost() {
		return cost;
	}
	
	public void makeSale() {
		if (numberOfItem > 0)
			numberOfItem--;
	}
	
}