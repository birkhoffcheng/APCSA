/**
 * @author birkhoff
 * @version 03/04/2018
 */
public class MyEnglish extends Homework {

	public MyEnglish() {
		super();
	}

	@Override
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("English");
	}
	
	public String toString() {
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}