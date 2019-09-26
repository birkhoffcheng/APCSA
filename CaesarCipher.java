/**
 * Caesar Cipher
 * @author birkhoff
 * @version 02/21/2018
 */
public class CaesarCipher {
	
	public CaesarCipher(){}
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static String encrypt(String cleartext, int key) {
		String ciphertext = "";
		cleartext = cleartext.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int i, charIndex;
		for ( i = 0; i < cleartext.length(); i++ ) {
			charIndex = ALPHABET.indexOf(cleartext.charAt(i));
			ciphertext += ALPHABET.charAt(( charIndex + key ) % 26 );
		}
		return ciphertext;
	}
	
	public static String decrypt(String ciphertext, int key) {
		String cleartext = "";
		int i, charIndex;
		for ( i = 0; i < ciphertext.length(); i++ ) {
			charIndex = ALPHABET.indexOf(ciphertext.charAt(i));
			cleartext += ALPHABET.charAt(( charIndex + 26 - key ) % 26 );
		}
		return cleartext;
	}
}