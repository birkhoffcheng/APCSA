
/**
 * This program uses String objects to print an ASCII art message...APCS ROCKS!
 *
 * @author B. Jordan 
 * @version 03/05/07
 *
 * Modified by Birkhoff Cheng
 * Date: 09/13/2017
 * Purpose: Print out a surprise happy birthday message with characters on the screen.
 *
 * PMR:
 * In this program, I first used vim to create the plaintext version of the ASCII art.
 * After that I copied it row by row to the Java program. The syntax of Java escape characters are basically the same with C.
 * And vim on Ubuntu also marks "\" red so I can notice them and change them to double backslash.
 * But if I am using an editor like Notepad on Windows, this would be much harder and I have to be more careful.
 */
public class ArtWork
{
    public static void main(String [ ] args)
    {
        //local variables
        String row1 = "         /-/      /-/   /--\\          _____       _____        \\-\\          /-/\n";
        String row2 = "        / /      / /   / /\\ \\        |  ___ \\    |  ___ \\       \\ \\        / /\n";
        String row3 = "       / /      / /   / /  \\ \\       | /   \\ \\   | /   \\ \\       \\ \\      / /\n";
        String row4 = "      / /      / /   / /    \\ \\      | |   | |   | |   | |        \\ \\    / /\n";
        String row5 = "     / /______/ /   / /      \\ \\     | \\   / /   | \\   / /         \\ \\  / /\n";
	String row6 = "    / _______  /   / /________\\ \\    | _____/    | _____/           \\ \\/ /\n";
	String row7 = "   / /      / /   / ____________ \\   | |         | |                 \\  /\n";
	String row8 = "  / /      / /   / /            \\ \\  | |         | |                 |  |\n";
	String row9 = " / /      / /   / /              \\ \\ | |         | |                 |  |\n";
	String row10 = "/_/      /_/   /_/                \\_\\|_|         |_|                 |__|\n";
	String row11 = " ____    ______  ____   ____________ |-|     |-|  ____         /-\\  \\-\\        /-/\n";
	String row12 = "| __ \\   |_  _| | __ \\  |____  ____| | |     | | | __ \\       /   \\  \\ \\      / /\n";
	String row13 = "| | \\ \\    ||   | | \\ \\     |  |     | |     | | | | \\ \\     / /-\\ \\  \\ \\    / /\n";
	String row14 = "| |__| |   ||   | |__| |    |  |     | |_____| | | |  | |   / /___\\ \\  \\ \\  / /\n";
	String row15 = "| ____ /   ||   | ____ /    |  |     |  _____  | | |  | |  / ______\\ \\  \\ \\/ /\n";
	String row16 = "| |   \\ \\  ||   | |   \\\\    |  |     | |     | | | |  / / / /       \\ \\  \\  /\n";
	String row17 = "| |   | |  ||   | |    \\\\   |  |     | |     | | | |_/ / / /         \\ \\  ||\n";
	String row18 = "| |__/ /  _||_  | |     \\\\  |  |     | |     | | |____/ /_/           \\_\\ ||\n";
	String row19 = "|_____/  |____| |_|      \\\\ |__|     |_|     |_|                          ||\n";
	String name = "Birkhoff Cheng\n";
        
        //print ASCII art
        System.out.print(row1);
        System.out.print(row2);
        System.out.print(row3);
        System.out.print(row4);
        System.out.print(row5);
	System.out.print(row6);
	System.out.print(row7);
	System.out.print(row8);
	System.out.print(row9);
	System.out.print(row10);
	System.out.print(row11);
	System.out.print(row12);
	System.out.print(row13);
	System.out.print(row14);
	System.out.print(row15);
	System.out.print(row16);
	System.out.print(row17);
	System.out.print(row18);
	System.out.print(row19);
	System.out.print(name);
    }
} 
