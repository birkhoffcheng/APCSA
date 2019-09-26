/**
 * @author birkhoff
 * @version 03/04/2018
 */
public class MyJava extends Homework {

	public MyJava() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Java");
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}