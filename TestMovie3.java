/**
 * Tester for Movie class
 * @author birkhoff
 * @version 03/21/2018
 */
public class TestMovie3 {
	
	public static void printMovies(Movie[] list) {
		for ( Movie movie : list )
			System.out.println(movie);
	}
	
	public static void sortYears(Movie[] source, int order) {
		
		Movie temp;
		int i, k;
		
		// Ascending
		if ( order == 1 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int maxIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getYear() > source[maxIndex].getYear() )
						maxIndex = k;
				}
				temp = source[i];
				source[i] = source[maxIndex];
				source[maxIndex] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int minIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getYear() < source[minIndex].getYear() )
						minIndex = k;
				}
				temp = source[i];
				source[i] = source[minIndex];
				source[minIndex] = temp;
			}
		}
	}
	
	public static void sortTitles(Movie[] source, int order) {
		
		Movie temp;
		int i, k;
		
		// Ascending
		if ( order == 1 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int maxIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getTitle().compareTo( source[maxIndex].getTitle() ) > 0 )
						maxIndex = k;
				}
				temp = source[i];
				source[i] = source[maxIndex];
				source[maxIndex] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int minIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getTitle().compareTo( source[minIndex].getTitle() ) < 0 )
						minIndex = k;
				}
				temp = source[i];
				source[i] = source[minIndex];
				source[minIndex] = temp;
			}
		}
	}
	
	public static void sortStudios(Movie[] source, int order) {
		
		Movie temp;
		int i, k;
	
		// Ascending
		if ( order == 1 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int maxIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getStudio().compareTo( source[maxIndex].getStudio() ) > 0 )
						maxIndex = k;
				}
				temp = source[i];
				source[i] = source[maxIndex];
				source[maxIndex] = temp;
			}
		}
		
		// Descending
		else if ( order == 2 ) {
			for ( i = source.length - 1 ; i >= 0 ; i-- ) {
				int minIndex = 0;
				for ( k = 0 ; k <= i ; k++ ) {
					if ( source[k].getStudio().compareTo( source[minIndex].getStudio() ) > 0 )
						minIndex = k;
				}
				temp = source[i];
				source[i] = source[minIndex];
				source[minIndex] = temp;
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
This time it is a lot easier. Basically I just copied and pasted the initial setup and function names.
I found out that the process of changing ascending to descending usually just involves changing one logic comparison, and the rest are all the same.
*/