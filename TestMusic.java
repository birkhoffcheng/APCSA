/**
 * Tester for Music Class
 * @author birkhoff
 * @version 03.28
 */
public class TestMusic {
	
	public static void printMusic(Music[] musics) {
		System.out.println("Music library:");
		for (Music music : musics)
			System.out.println(music);
	}
	
	public static void searchTitle(Music[] musics, String title) {
		System.out.println("Search - Title - " + title);
		int counter = 0;
		for (Music music : musics)
			if (music.title().equalsIgnoreCase(title)) {
				System.out.println("We found " + title + " in the library:\n" + music);
				counter++;
			}
		if (counter == 0) {
			System.out.println(title + " is not in the library.");
		}
	}
	
	public static void searchYear(Music[] musics, int year) {
		System.out.println("Search - Year - " + year + "\nFind results:");
		int counter = 0;
		for (Music music : musics)
			if (music.year() == year) {
				System.out.println(music);
				counter++;
			}
		if (counter == 0)
			System.out.println("There is no listing for " + year);
		else if (counter == 1)
			System.out.println("There is 1 listing for " + year);
		else
			System.out.println("There are " + counter + " listings for " + year);
	}
	
	public static void searchSinger(Music[] musics, String singer) {
		System.out.println("Search - Singer - " + singer + "\nFind results:");
		int counter = 0;
		for (Music music : musics)
			if (music.singer().equalsIgnoreCase(singer)) {
				System.out.println(music);
				counter++;
			}
		if (counter == 0)
			System.out.println("There is no listing for " + singer);
		else if (counter == 1)
			System.out.println("There is 1 listing for " + singer);
		else
			System.out.println("There are " + counter + " listings for " + singer);
	}
	
	public static void main(String[] args) {
		Music[] myMusic = new Music[10];
		myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
		myMusic[2] = new Music("What If It’s You", 1995, "Reba McEntire");
		myMusic[3] = new Music("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music("White Flag", 2004, "Dido");
		printMusic(myMusic);
		System.out.println();
		searchTitle(myMusic, "Let Go");
		System.out.println();
		searchTitle(myMusic, "Some Day");
		System.out.println();
		searchYear(myMusic, 2001);
		System.out.println();
		searchYear(myMusic, 2003);
		System.out.println();
		searchSinger(myMusic, "Avril Lavigne");
		System.out.println();
		searchSinger(myMusic, "Tony Curtis");
	}
	
}
/*
 * PMR:
 * This is indeed a primitive searching algorithm.
 * It works fine with this array of length 10.
 * But it will be slow for other databases.
 */