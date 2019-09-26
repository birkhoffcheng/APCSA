/**
 * Tester for Music Class
 * @author birkhoff
 * @version 03.29
 */
public class TestMusic2 {
	
	public static void printMusic(Music[] musics) {
		System.out.println("Music library:");
		for (Music music : musics)
			System.out.println(music);
	}
	
	public static void sortYears(Music[] list) {
		for (int i = 1; i < list.length; i++) {
			int j = i - 1;
			Music temp = list[i];
			while (j >= 0 && list[j].year() > temp.year()) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void searchYear(Music[] list, int year) {
		System.out.println("Search - Year - " + year);
		int high = list.length;
		int low = -1;
		int probe;
		
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (list[probe].year() > year)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (list[low].year() == year))
			System.out.println("Found: " + list[low]);
		else
			System.out.println("Not found.");
	}
	
	public static void sortTitles(Music[] list) {
		for (int i = 1; i < list.length; i++) {
			int j = i - 1;
			Music temp = list[i];
			while (j >= 0 && list[j].title().compareTo(temp.title()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void searchTitle(Music[] list, String title) {
		System.out.println("Search - Title - " + title);
		int high = list.length;
		int low = -1;
		int probe;
		
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (list[probe].title().compareTo(title) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (list[low].title().equals(title)))
			System.out.println("Found: " + list[low]);
		else
			System.out.println("Not found.");
	}
	
	public static void sortSingers(Music[] list) {
		for (int i = 1; i < list.length; i++) {
			int j = i - 1;
			Music temp = list[i];
			while (j >= 0 && list[j].singer().compareTo(temp.singer()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void searchSinger(Music[] list, String singer) {
		System.out.println("Search - Singer - " + singer);
		int high = list.length;
		int low = -1;
		int probe;
		
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (list[probe].singer().compareTo(singer) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (list[low].singer().equals(singer)))
			System.out.println("Found: " + list[low]);
		else
			System.out.println("Not found.");
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
		
		sortTitles(myMusic);
		searchTitle(myMusic, "Misunderstood");
		System.out.println();
		searchTitle(myMusic, "Under Paid");
		System.out.println();
		
		sortYears(myMusic);
		searchYear(myMusic, 2005);
		System.out.println();
		searchYear(myMusic, 2006);
		System.out.println();
		
		sortSingers(myMusic);
		searchSinger(myMusic, "Darth Maul");
		System.out.println();
		searchSinger(myMusic, "Dido");
	}
	
}
/*
 * PMR:
 * At first, I planned to call the sorting function inside the searching function.
 * But then it takes more time because it sorts the array each time we search for something.
 * So I decided to sort it in the main function before searching.
 */