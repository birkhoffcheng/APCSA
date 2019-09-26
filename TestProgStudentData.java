/**
 * Tester for Student class
 * @author birkhoff
 * @version 04.04
 */
public class TestProgStudentData {
	
	public static void main(String[] args) throws IllegalArgumentException {
//		double[] emptyGrades = {};
		double[] shawGrades = {88.5, 22.3, 99.9, 33.3};
		StudentData shaw = new StudentData("Shaw", "Sameen", shawGrades);
		System.out.println(shaw);
		
		double[] annGrades = {100, 98.4, 100, 100};
		StudentData ann = new StudentData("Ann", "Lee", annGrades);
		System.out.println(ann);
	}
	
}