/**
 * @author birkhoff
 * @version 03/05/2018
 */
public class MyMath2 extends Homework2 implements Processing {

	public MyMath2() {
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