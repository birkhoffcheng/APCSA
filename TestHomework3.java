/**
 * Tester for Homework
 * @author birkhoff
 * @version 03/06/2018
 */
import java.util.ArrayList;
import java.util.List;
public class TestHomework3 {

	public static void main(String[] args) {
		
		List<Homework3> homework = new ArrayList<Homework3>();
		
		homework.add( new MyMath3() );
		homework.add( new MyScience3() );
		homework.add( new MyEnglish3() );
		homework.add( new MyJava3() );
		
		homework.get(0).createAssignment(4);
		homework.get(1).createAssignment(6);
		homework.get(2).createAssignment(4);
		homework.get(3).createAssignment(5);
		
		System.out.println( homework.get(0) );
		System.out.println( homework.get(1) );
		System.out.println( homework.get(2) );
		System.out.println( homework.get(3) );
		
		if ( homework.get(0).compareTo( homework.get(2) ) == 0 )
			System.out.println("The homework for math and English are the same number of pages.");
		else if ( homework.get(0).compareTo( homework.get(2) ) == -1 )
			System.out.println("The homework for math has less pages than English.");
		else
			System.out.println("The homework for math has more pages than English.");
	}
	
}
/* 
 * PMR:
 * With the advanced real-time compiling of Eclipse. I make no error when writing code at all.
 * I considered making a function to compare homework pages
 * but didn't want to figure out how to get the subject name into the function.
 * But the assignment instruction is so messed up that I barely figured out what to do.
 * I don't think there is a requirement to create the "equals" function.
 */