/**
 * Music Structure
 * @author birkhoff
 * @version 03.28
 */
public class Music {
	
	private String title, singer;
	private int year;
	
	public Music(String title, int year, String singer) {
		this.title = title;
		this.year = year;
		this.singer = singer;
	}
	
	public String title() {
		return title;
	}
	
	public int year() {
		return year;
	}
	
	public String singer() {
		return singer;
	}
	
	public String toString() {
		return title + ", " + year + ", " + singer;
	}
	
}