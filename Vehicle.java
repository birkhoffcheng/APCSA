/**
 * Vehicle Class
 * @author birkhoff
 * @version 03/07/2018
 */
public abstract class Vehicle implements Product {
	
	private String name = "";
	private double cost;
	
	public Vehicle(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCost() {
		return this.cost;
	}

}