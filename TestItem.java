/**
 * Tester for Item Class
 * @author birkhoff
 * @version 0.0.1
 */
public class TestItem {
	
	public static void printInventory(Item[] list) {
		System.out.println("ItemID\tItemName\tInStore\tPrice");
		for (Item item : list) {
			System.out.println(item);
		}
	}
	
	public static void sortID(Item[] list) {
		int j, n = list.length;
		Item temp;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			temp = list[i];
			while (j >= 0 && list[j].getItemID().compareTo(temp.getItemID()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void sortName(Item[] list) {
		int j, n = list.length;
		Item temp;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			temp = list[i];
			while (j >= 0 && list[j].getItemName().compareTo(temp.getItemName()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void sortInStore(Item[] list) {
		int k;
		Item temp;
		for ( int i = list.length - 1 ; i >= 0 ; i-- ) {
			int maxIndex = 0;
			for ( k = 0 ; k <= i ; k++ ) {
				if (list[k].getInStore() > list[maxIndex].getInStore())
					maxIndex = k;
			}
			temp = list[i];
			list[i] = list[maxIndex];
			list[maxIndex] = temp;
		}
	}
	
	public static void sortPrice(Item[] array) {
		Item[] temp = new Item[array.length];
		sortPrice(array, temp, 0, array.length - 1);
	}
	
	public static void sortPrice(Item[] list, Item[] temp, int leftStart, int rightEnd) {
		if ( leftStart >= rightEnd )
			return;
		
		int middle = (leftStart + rightEnd) / 2;
		sortPrice(list, temp, leftStart, middle);
		sortPrice(list, temp, middle + 1, rightEnd);
		mergePrice(list, temp, leftStart, rightEnd);
	}
	
	public static void mergePrice(Item[] list, Item[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left <= leftEnd && right <= rightEnd) {
			if (list[left].getPrice() <= list[right].getPrice()) {
				temp[index] = list[left];
				left++;
			}
			else {
				temp[index] = list[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(list, left, temp, index, leftEnd - left + 1);
		System.arraycopy(list, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, list, leftStart, size);
	}
	
	public static void main(String[] args) {
		
		Item[] hardware = new Item[6];
		hardware[0] = new Item("1011", "Air Filters", 200, 10.5);
		hardware[1] = new Item("1034", "Door Knobs", 60, 21.5);
		hardware[2] = new Item("1101", "Hammers\t", 90, 9.99);
		hardware[3] = new Item("1600", "Levels\t", 80, 19.99);
		hardware[4] = new Item("1500", "Ceiling Fans", 100, 59);
		hardware[5] = new Item("1201", "Wrench Sets", 55, 80);
		
		System.out.println("Original array:\n");
		printInventory(hardware);
		
		sortID(hardware);
		System.out.println("\nSorted by ID:\n");
		printInventory(hardware);
		
		sortName(hardware);
		System.out.println("\nSorted by Name:\n");
		printInventory(hardware);
		
		sortInStore(hardware);
		System.out.println("\nSorted by InStore\n");
		printInventory(hardware);
		
		sortPrice(hardware);
		System.out.println("\nSorted by Price:\n");
		printInventory(hardware);
		
	}
	
}
/*
 * PMR:
 * I noticed there weren't any request for the order by which the array is sorted.
 * So I used all ascending order.
 * And as I previously mentioned, changing the order usually just involves changing a single character.
 * When I was doing a drone simulation, I once made a bubble sort program in MATLAB.
 * This reminds me of that.
 * And I've previously seen different sorting algorithms on YouTube, like QuickSort.
 * I will probably learn that after the AP test in my spare time.
 */