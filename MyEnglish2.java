/**
 * @author birkhoff
 * @version 03/05/2018
 */
public class MyEnglish2 extends Homework2 implements Processing {

	public MyEnglish2() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("English");
	}
	
	public void doReading() {
		setPagesRead( getPagesRead() - 1 );
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}