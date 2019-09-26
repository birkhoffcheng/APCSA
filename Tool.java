/**
 * Compare Tool Class
 * @author birkhoff
 * @version 03/07/2018
 */
public class Tool implements Product, Comparable<Product> {
	
	private String name = "";
	private double cost;
	
	public Tool(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public int compareTo(Product obj) {
		if ( this.cost < obj.getCost() )
			return -1;
		if ( this.cost == obj.getCost() )
			return 0;
		else
			return 1;
	}
	
}