/**
 * CaesarCipher tester class
 * @author birkhoff
 * @version 02/21/2018
 */
import java.util.Scanner;
public class CaesarCipherTester {

	public static boolean containsDigit(String s) {
		boolean containsDigit = false;
		if (s != null && !s.isEmpty()) {
			for (char c : s.toCharArray()) {
				if (!Character.isDigit(c)) {
					containsDigit = false;
					break;
				}
				else {
					containsDigit = true;
				}
			}
		}
		return containsDigit;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cleartext = "";
		String ciphertext = "";
		String choice = "";
		int key = 0;
		String keyStr = "";
		boolean quit = false;
		while ( !quit ) {
			System.out.print("Press Any Key And Enter To Continue...");
			in.next();
			System.out.println("Caesar Shift Encryption\n");
			System.out.println("[E]ncrypt");
			System.out.println("[D]ecrypt");
			System.out.println("[Q]uit");
			System.out.print("\nEnter Your Choice: ");
			choice = in.next();
			if ( choice.equalsIgnoreCase("e") ) {
				System.out.println("Please enter your message: (in one line, no numbers)");
				cleartext = in.next();
				cleartext += in.nextLine();
				System.out.print("Please enter your key: (0~25) ");
				keyStr = in.next();
				if ( containsDigit(keyStr) && Integer.parseInt(keyStr) >= 0 && Integer.parseInt(keyStr) <= 25 ) {
					key = Integer.parseInt(keyStr);
					ciphertext = CaesarCipher.encrypt(cleartext, key);
					System.out.println(ciphertext);
					System.out.println();
				}
				else {
					System.out.println("Key must be an integer between 0 and 25.");
				}
			}
			else if ( choice.equalsIgnoreCase("d") ) {
				System.out.println("Please enter your message:");
				ciphertext = in.next();
				System.out.print("Please enter your key: (0~25) ");
				keyStr = in.next();
				if ( containsDigit(keyStr) && Integer.parseInt(keyStr) >= 0 && Integer.parseInt(keyStr) <= 25 ) {
					key = Integer.parseInt(keyStr);
					cleartext = CaesarCipher.decrypt(ciphertext, key);
					System.out.println(cleartext);
					System.out.println();
				}
				else {
					System.out.println("Key must be an integer between 0 and 25.");
				}
			}
			else if ( choice.equalsIgnoreCase("q") ) {
				quit = true;
			}
			else {
				System.out.println("Invalid Choice!");
			}
		}
		in.close();
	}
}
