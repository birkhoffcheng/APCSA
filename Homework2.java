/**
 * @author birkhoff
 * @version 03/05/2018
 */
public abstract class Homework2 implements Processing {
	
	private int pagesRead;
	private String typeHomework;
	
	public Homework2() {
		this.pagesRead = 0;
		this.typeHomework = "none";
	}
	
	public abstract void createAssignment( int p );
	
	public void setPagesRead( int pagesRead ) {
		this.pagesRead = pagesRead;
	}
	
	public void setTypeHomework( String typeHomework ) {
		this.typeHomework = typeHomework;
	}
	
	public int getPagesRead() {
		return this.pagesRead;
	}
	
	public String getTypeHomework() {
		return this.typeHomework;
	}
	
}