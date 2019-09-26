/**
 * Student
 * @author birkhoff
 * @version 04.04
 */
public class StudentData {
	
	private String firstName, lastName;
	private double[] testScores;
	private char grade;
	
	public StudentData(String firstname, String lastname, double[] gradeList) throws IllegalArgumentException {
		if (firstname == null || firstname.length() == 0)
			throw new IllegalArgumentException("Empty first name");
		else
			this.firstName = firstname;
		if (lastname == null || lastname.length() == 0)
			throw new IllegalArgumentException("Empty last name");
		else
			this.lastName = lastname;
		courseGrade(gradeList);
	}
	
	public double calcAverage(double[] list) {
		double total = 0;
		for (double number : list)
			total += number;
		return total / (double)list.length;
	}
	
	public void courseGrade(double[] list) throws IllegalArgumentException {
		if (list == null || list.length == 0)
			throw new IllegalArgumentException("Empty grade list");
		testScores = list;
		double average = calcAverage(testScores);
		if (average >= 90)
			grade = 'A';
		else if (average >= 80)
			grade = 'B';
		else if (average >= 70)
			grade = 'C';
		else if (average >= 60)
			grade = 'D';
		else
			grade = 'F';
	}
	
	public String toString() {
		String str = firstName + "\t" + lastName;
		for (double number : testScores)
			str += "\t" + number;
		str += "\t" + grade;
		return str;
	}
	
}
/*
 * PMR:
 * Through error checking and handling, I remember I used exit codes in C and bash script to determine if there is an error.
 * In C, if I have an error, I use exit(someErrorCode); and then the IDE will show the program ended with what exit code.
 * In bash scripting, it is "exit 1" and the /bin/bash will show the exit code, in this case, 1.
 * However, in Java, you can use a whole string to show an error if it occurs.
 */