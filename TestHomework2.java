/**
 * @author birkhoff
 * @version 03/05/2018
 */
import java.util.ArrayList;
import java.util.List;
public class TestHomework2 {

	public static void main(String[] args) {
		
		List<Homework2> homework = new ArrayList<Homework2>();
		
		homework.add( new MyMath2() );
		homework.add( new MyScience2() );
		homework.add( new MyEnglish2() );
		homework.add( new MyJava2() );
		
		homework.get(0).createAssignment(4);
		homework.get(1).createAssignment(6);
		homework.get(2).createAssignment(10);
		homework.get(3).createAssignment(5);
		
		System.out.println("Before reading:");
		System.out.println( homework.get(0) );
		homework.get(0).doReading();
		System.out.println("After reading:");
		System.out.println( homework.get(0) );
		System.out.println();
		
		System.out.println("Before reading:");
		System.out.println( homework.get(1) );
		homework.get(1).doReading();
		System.out.println("After reading:");
		System.out.println( homework.get(1) );
		System.out.println();
		
		System.out.println("Before reading:");
		System.out.println( homework.get(2) );
		homework.get(2).doReading();
		System.out.println("After reading:");
		System.out.println( homework.get(2) );
		System.out.println();
		
		System.out.println("Before reading:");
		System.out.println( homework.get(3) );
		homework.get(3).doReading();
		System.out.println("After reading:");
		System.out.println( homework.get(3) );
		System.out.println();
	}
}
/*
 * PMR:
 * Haven't thought Java has so many flexible functions!
 * I just learned one more thing on OOP.
 * Interface.
 * When I saw the title, I thought it was something like GUI.
 * But it is still fun to learn.
 */