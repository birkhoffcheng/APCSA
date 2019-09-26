/**
 * Tester for Movies2 class
 * @author birkhoff
 * @version 03/20/2018
 */
public class TestMovie2 {
	
	public static void printMovies(Movie[] list) {
		for ( Movie movie : list )
			System.out.println(movie);
	}
	
	public static void sortYears(Movie[] source, int order) {
		
		Movie temp;
		int i, j;
		int n = source.length;
		
		// Ascending
		if ( order == 1 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getYear() > temp.getYear() ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getYear() < temp.getYear() ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
	}
	
	public static void sortTitles(Movie[] source, int order) {
		
		Movie temp;
		int i, j;
		int n = source.length;
		
		// Ascending
		if ( order == 1 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getTitle().compareTo( temp.getTitle() ) > 0 ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getTitle().compareTo( temp.getTitle() ) < 0 ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
	}
	
	public static void sortStudios(Movie[] source, int order) {
		
		Movie temp;
		int i, j;
		int n = source.length;
		
		// Ascending
		if ( order == 1 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getStudio().compareTo( temp.getStudio() ) > 0 ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = 1; i < n; i++ ) {
				j = i - 1;
				temp = source[i];
				while ( j >= 0 && source[j].getStudio().compareTo( temp.getStudio() ) < 0 ) {
					source[j+1] = source[j];
					j--;
				}
				source[j+1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Movie[] myMovies = new Movie[10];
		myMovies[0] = new Movie("The Muppets Take Manhattan", 2001, "Columbia Tristar");
		myMovies[1] = new Movie("Mulan Special Edition", 2004, "Disney");
		myMovies[2] = new Movie("Shrek 2", 2004, "Dreamworks");
		myMovies[3] = new Movie("The Incredibles", 2004, "Pixar");
		myMovies[4] = new Movie("Nanny McPhee", 2006, "Universal");
		myMovies[5] = new Movie("The Curse of the Were‐Rabbit", 2006, "Aardman");
		myMovies[6] = new Movie("Ice Age", 2002, "20th Century Fox");
		myMovies[7] = new Movie("Lilo & Stitch", 2002, "Disney");
		myMovies[8] = new Movie("Robots", 2005, "20th Century Fox");
		myMovies[9] = new Movie("Monsters Inc.", 2001, "Pixar");
		
		System.out.println("Before sorting:");
		printMovies(myMovies);
		
		System.out.println("\nSorted by Title - ascending:");
		sortTitles(myMovies, 1);
		printMovies(myMovies);
		
		System.out.println("\nSorted by Year - descending:");
		sortYears(myMovies, 2);
		printMovies(myMovies);
		
		System.out.println("\nSorted by studio - ascending:");
		sortStudios(myMovies, 1);
		printMovies(myMovies);
	}
}
/*
PMR:
Today I wasted almost an hour of time because I forgot to set the 9th value in the array, leaving a null element.
So every time it traverses through the last element, a null pointer exception pops up.
I thought it is the sorting algorithm's fault and spent about an hour checking for bug until I realized I didn't initialize myMovies[9].
Have to be more careful next time and don't waste time stuck on one aspect of a problem.
*/
