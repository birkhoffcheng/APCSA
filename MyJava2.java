/**
 * @author birkhoff
 * @version 03/05/2018
 */
public class MyJava2 extends Homework2 implements Processing {

	public MyJava2() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Java");
	}
	
	public void doReading() {
		setPagesRead( getPagesRead() - 4 );
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}