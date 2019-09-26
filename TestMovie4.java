/**
 * Tester for Movie class
 * @author birkhoff
 * @version 03/22/2018
 */
public class TestMovie4 {
	
	public static void printMovies(Movie[] list) {
		for ( Movie movie : list )
			System.out.println(movie);
	}
	
	public static void sortYears(Movie[] array) {
		Movie[] temp = new Movie[array.length];
		sortYears(array, temp, 0, array.length - 1);
	}
	
	public static void sortYears(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		if ( leftStart >= rightEnd )
			return;
		
		int middle = (leftStart + rightEnd) / 2;
		sortYears(array, temp, leftStart, middle);
		sortYears(array, temp, middle + 1, rightEnd);
		mergeYears(array, temp, leftStart, rightEnd);
	}
	
	public static void mergeYears(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left <= leftEnd && right <= rightEnd) {
			if (array[left].getYear() >= array[right].getYear()) {
				temp[index] = array[left];
				left++;
			}
			else {
				temp[index] = array[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}
	
	
	public static void sortTitles(Movie[] array) {
		Movie[] temp = new Movie[array.length];
		sortTitles(array, temp, 0, array.length - 1);
	}
	
	public static void sortTitles(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		if ( leftStart >= rightEnd )
			return;
		
		int middle = (leftStart + rightEnd) / 2;
		sortTitles(array, temp, leftStart, middle);
		sortTitles(array, temp, middle + 1, rightEnd);
		mergeTitles(array, temp, leftStart, rightEnd);
	}
	
	public static void mergeTitles(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left <= leftEnd && right <= rightEnd) {
			if (array[left].getTitle().compareTo(array[right].getTitle()) <= 0) {
				temp[index] = array[left];
				left++;
			}
			else {
				temp[index] = array[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}
	
	public static void sortStudios(Movie[] array) {
		Movie[] temp = new Movie[array.length];
		sortStudios(array, temp, 0, array.length - 1);
	}
	
	public static void sortStudios(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		if ( leftStart >= rightEnd )
			return;
		
		int middle = (leftStart + rightEnd) / 2;
		sortStudios(array, temp, leftStart, middle);
		sortStudios(array, temp, middle + 1, rightEnd);
		mergeStudios(array, temp, leftStart, rightEnd);
	}
	
	public static void mergeStudios(Movie[] array, Movie[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left <= leftEnd && right <= rightEnd) {
			if (array[left].getStudio().compareTo(array[right].getStudio()) <= 0) {
				temp[index] = array[left];
				left++;
			}
			else {
				temp[index] = array[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
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
		sortTitles(myMovies);
		printMovies(myMovies);
		
		System.out.println("\nSorted by Year - descending:");
		sortYears(myMovies);
		printMovies(myMovies);
		
		System.out.println("\nSorted by studio - ascending:");
		sortStudios(myMovies);
		printMovies(myMovies);

	}
}
/*
PMR:
I watched a YouTube video and learned a much simpler merging function.
And because of the slow nature of JVM, I used one temporary array instead of one in each call to the merge function, which saves memory.
Although the virtual machine I run my IDE on has 8GB of RAM, a lot of Java machines (such as low-end Android phones) don't have a lot of memory.
So saving memory is important.
*/