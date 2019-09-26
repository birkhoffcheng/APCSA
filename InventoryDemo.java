/**
 * Demo Class for Products
 * @author birkhoff
 * @version 03/07/2018
 */
import java.util.List;
import java.util.ArrayList;
public class InventoryDemo {
	
	public static void takeInventory(String name, List<Product> list) {
		int total = 0;
		double totalCost = 0.0;
		for ( Product item : list ) {
			if ( item.getName() == name ) {
				total++;
				totalCost += item.getCost();
			}
		}
		System.out.println( name + ": Quantity = " + total + ", Total cost = " + totalCost );
	}

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Car("Jaguar", 1000000.00));
		products.add(new Car("Neon", 17000.00));
		products.add(new Tool("JigSaw", 149.18));
		products.add(new Car("Jaguar", 110000.00));
		products.add(new Car("Neon", 17500.00));
		products.add(new Car("Neon", 17875.32));
		products.add(new Truck("RAM", 35700.00));
		products.add(new Tool("CircularSaw", 200.00));
		products.add(new Tool("CircularSaw", 150.00));
		
		takeInventory("JigSaw", products);
		takeInventory("Neon", products);
		takeInventory("Jaguar", products);
		takeInventory("RAM", products);
		takeInventory("CircularSaw", products);
		
		Tool saw1 = new Tool("Saw", 100.00);
		Tool saw2 = new Tool("Saw", 300.00);
		if ( saw1.compareTo(saw2) == -1 )
			System.out.println("The second saw is more expensive.");
		else if ( saw1.compareTo(saw2) == 0 )
			System.out.println("The two saws are equal in price.");
		else
			System.out.println("The first saw is more expensive.");
		
	}
	
}
