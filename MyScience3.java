/**
 * Science Homework
 * @author birkhoff
 * @version 03/06/2018
 */
public class MyScience3 extends Homework3 {

	public MyScience3() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Science");
	}
	
	public void doReading() {
		setPagesRead( getPagesRead() - 3 );
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}

}