/**
 * @author birkhoff
 * @version 02.07
 * Determine if a string is palindrome
 */
public class RecursivePalindrome {

	public RecursivePalindrome() {
	}
	
	public boolean isPalindrome(String inString) {
		
		inString = convert(inString);
		
		if( inString.length() == 0 || inString.length() == 1 )
			return true;
        if( inString.charAt(0) == inString.charAt( inString.length()-1 ) )
            return isPalindrome( inString.substring( 1, inString.length()-1 ) );
        
        return false;
    }
	
	public String convert(String string) {
		string = string.replaceAll("[^A-Za-z0-9]", "");
		string = string.toLowerCase();
		return string;
	}
}