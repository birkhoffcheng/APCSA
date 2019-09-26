/**
 * @author birkhoff
 * @version 03/04/2018
 */
public class MyScience extends Homework {

	public MyScience() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Science");
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}