/**
 * Cash Register
 * @author birkhoff
 * @version 04.05
 */
public class CashRegister {
	
	private int cashOnHand;
	
	public CashRegister() {
		cashOnHand = 500;
	}
	
	public CashRegister(int cash) throws IllegalArgumentException {
		if (cash < 0)
			throw new IllegalArgumentException("Invalid amount of cash");
		else
			this.cashOnHand = cash;
	}
	
	public void CashRegister(int cash) throws IllegalArgumentException {
		if (cash < 0)
			throw new IllegalArgumentException("Invalid amount of cash");
		else
			this.cashOnHand = cash;
	}
	
	public void acceptAmount(int cash) throws IllegalArgumentException {
		if (cash < 0)
			throw new IllegalArgumentException("Invalid amount of cash");
		else
			this.cashOnHand += cash;
	}
	
	public int cashOnHand() {
		return cashOnHand;
	}
	
}
/*
 * PMR:
 * This assignment is weird as it uses a capital letter as the beginning of a function name.
 * I initially thought that might be copy and paste. But it is the same in the rubric.
 */