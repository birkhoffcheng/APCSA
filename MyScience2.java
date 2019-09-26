/**
 * @author birkhoff
 * @version 03/05/2018
 */
public class MyScience2 extends Homework2 implements Processing {

	public MyScience2() {
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