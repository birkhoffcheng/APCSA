/**
 * Java Homework
 * @author birkhoff
 * @version 03/06/2018
 */
public class MyJava3 extends Homework3 {

	public MyJava3() {
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