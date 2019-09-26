/**
 * @author birkhoff
 * @version 03/04/2018
 */
public class MyMath extends Homework {

	public MyMath() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Math");
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}