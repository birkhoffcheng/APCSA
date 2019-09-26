/**
 * Math Homework
 * @author birkhoff
 * @version 03/06/2018
 */
public class MyMath3 extends Homework3 {
	
	public MyMath3() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Math");
	}
	
	public void doReading() {
		setPagesRead( getPagesRead() - 2 );
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
	
}