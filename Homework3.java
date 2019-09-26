/**
 * Structure for homework assignments
 * @author birkhoff
 * @version 03/06/2018
 */
public abstract class Homework3 implements Comparable<Homework3> {
	
	private int pagesRead;
	private String typeHomework;
	
	public Homework3() {
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
	
	public int compareTo( Homework3 obj ) {
		if ( this.pagesRead < obj.pagesRead )
	        return -1;
	    else if ( this.pagesRead == obj.pagesRead )
	        return 0;
	    else
	        return 1;
	}
	
}