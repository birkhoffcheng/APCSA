/**
 * Tester for Student structure
 * @author birkhoff
 * @version 03/17/2018
 */
import java.util.ArrayList;
public class TestStudent {
	
	public static void printBook(ArrayList<Student> students) {
		
		System.out.println("Student name\tQ1\tQ2\tQ3\tQ4\tQ5");
		System.out.println("======================================================");
		
		for ( int i = 0; i < students.size(); i++ ) {
			System.out.println( students.get(i) );
		}
	}
	
	public static int find(ArrayList<Student> students, String nameToFind) {
		int index = 0;
		for ( int i = 0; i < students.size(); i++ )
			if ( students.get(i).getName().equalsIgnoreCase(nameToFind) ) {
				index = i;
				break;
			}
		return index;
	}
	
	public static void replaceName(ArrayList<Student> students, String nameToFind, String replacement) {
		int index = find(students, nameToFind);
		students.get(index).setName(replacement);
	}
	
	public static void replaceQuiz(ArrayList<Student> students, String nameToFind, int quizIndex, int quizScore) {
		int index = find(students, nameToFind);
		students.get(index).setQuiz(quizIndex, quizScore);
	}
	
	public static void replaceStudent(ArrayList<Student> students, String nameToFind, String replacement, int q1, int q2, int q3, int q4, int q5) {
		int index = find(students, nameToFind);
		students.get(index).setName(replacement);
		students.get(index).setQuiz(1, q1);
		students.get(index).setQuiz(2, q2);
		students.get(index).setQuiz(3, q3);
		students.get(index).setQuiz(4, q4);
		students.get(index).setQuiz(5, q5);
	}
	
	public static void insertStudent(ArrayList<Student> students, String nameToFind, String nameToInsert, int q1, int q2, int q3, int q4, int q5) {
		int index = find(students, nameToFind);
		students.add( index, new Student(nameToInsert, q1, q2, q3, q4, q5) );
	}
	
	public static void deleteStudent(ArrayList<Student> students, String nameToFind) {
		int index = find(students, nameToFind);
		students.remove(index);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> myClass = new ArrayList<Student>();
		
		myClass.add( new Student( "Mark Kennedy", 70, 80, 90, 100, 90 ) );
		myClass.add( new Student( "Max Gerard", 80, 85, 90, 85, 80 ) );
		myClass.add( new Student( "Jean Smith", 50, 79, 89, 99, 100 ) );
		myClass.add( new Student( "Betty Farm", 85, 80, 85, 88, 89 ) );
		myClass.add( new Student( "Dilbert Gamma", 70, 70, 90, 70, 80 ) );
		
		System.out.println("Starting Gradebook:\n");
		printBook(myClass);
		
		System.out.println("\nChanging Betty's name to Betty Boop:\n");
		replaceName(myClass, "Betty Farm", "Betty Boop");
		printBook(myClass);
		
		System.out.println("\nChanging Jean's quiz 1 score to 80:\n");
		replaceQuiz(myClass, "Jean Smith", 1, 80);
		printBook(myClass);
		
		System.out.println("\nReplacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:\n");
		replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
		printBook(myClass);
		
		System.out.println("\nInserting Lily Mu: 85, 95, 70, 0, 100 before Betty:\n");
		insertStudent(myClass, "Betty Boop", "Lily Mu\t", 85, 95, 70, 0, 100);
		printBook(myClass);
		
		System.out.println("\nDeleting Max Gerard:\n");
		deleteStudent(myClass, "Max Gerard");
		printBook(myClass);
	}
	
}
/*
 * PMR:
 * I found out that the find by name function is used frequently.
 * So I isolated it into an independent function to find by name and return index.
 * When dealing with dynamic arrays, ArrayList is apparently a better option.
 * I remember in C, there is a way to setup dynamic arrays with built-in functionality.
 * But in Java, we apparently have to use an object to do so.
 */