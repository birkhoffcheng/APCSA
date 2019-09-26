/**
 * A Candy Machine
 * @author birkhoff
 * @version 04.05
 */
public class CandyMachine {
	
	public static void sellProduct(Dispenser dispenser, CashRegister cashregister, int amount) throws IllegalArgumentException {
		dispenser.makeSale();
		cashregister.acceptAmount(amount);
		System.out.println("Collect your item at the bottom and enjoy!");
	}
	
	public static void main(String[] args) throws IllegalArgumentException {
		Dispenser dispenser = new Dispenser(100, 50);
		CashRegister cashregister = new CashRegister();
		sellProduct(dispenser, cashregister, 75);
	}
	
}