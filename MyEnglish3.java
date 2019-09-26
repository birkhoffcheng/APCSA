/**
 * English Homework
 * @author birkhoff
 * @version 03/06/2018
 */
public class MyEnglish3 extends Homework3 {

	public MyEnglish3() {
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