/**
 * Movie Structure
 * @author birkhoff
 * @version 03/20/2018
 */
public class Movie {
	
	private String title = "";
	private int year;
	private String studio = "";
	
	public Movie(String title, int year, String studio) {
		this.title = title;
		this.year = year;
		this.studio = studio;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getStudio() {
		return this.studio;
	}
	
	public String toString() {
		return this.title + ", " + this.year + ", " + this.studio;
	}
	
}
