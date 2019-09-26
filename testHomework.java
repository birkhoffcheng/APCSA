/**
 * @author birkhoff
 * @version 03/04/2018
 */
import java.util.ArrayList;
public class testHomework {

	public static void main(String[] args) {
		
		ArrayList<Homework> homework = new ArrayList<Homework>();
		
		homework.add( new MyMath() );
		homework.add( new MyScience() );
		homework.add( new MyEnglish() );
		homework.add( new MyJava() );
		
		homework.get(0).createAssignment(4);
		homework.get(1).createAssignment(6);
		homework.get(2).createAssignment(10);
		homework.get(3).createAssignment(5);
		
		System.out.println( homework.get(0) );
		System.out.println( homework.get(1) );
		System.out.println( homework.get(2) );
		System.out.println( homework.get(3) );
	}
}
/*
 * PMR:
 * The class created here is pretty good.
 * I suddenly realized I forgot to categorize my project folders.
 * I am going to do it now.
 * Recently tried out Atom text editor. It is pretty good.
 */