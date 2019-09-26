/**
 * Student Data Structure
 * @author birkhoff
 * @version 03/17/2018
 */
public class Student {
	
	private String name = "";
	private int qz1, qz2, qz3, qz4, qz5;
	
	public Student(String name, int q1, int q2, int q3, int q4, int q5) {
		this.name = name;
		this.qz1 = q1;
		this.qz2 = q2;
		this.qz3 = q3;
		this.qz4 = q4;
		this.qz5 = q5;
	}
	
	public int getQuiz(int quizIndex) {
		if ( quizIndex == 1 )
			return this.qz1;
		else if ( quizIndex == 2 )
			return this.qz2;
		else if ( quizIndex == 3 )
			return this.qz3;
		else if ( quizIndex == 4 )
			return this.qz4;
		else if ( quizIndex == 5 )
			return this.qz5;
		else
			return -1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQuiz(int quizIndex, int quizScore) {
		if ( quizIndex == 1 )
			this.qz1 = quizScore;
		else if ( quizIndex == 2 )
			this.qz2 = quizScore;
		else if ( quizIndex == 3 )
			this.qz3 = quizScore;
		else if ( quizIndex == 4 )
			this.qz4 = quizScore;
		else if ( quizIndex == 5 )
			this.qz5 = quizScore;
	}
	
	public String toString() {
		return this.name + "\t" + this.qz1 + "\t" + this.qz2 + "\t" + this.qz3 + "\t" + this.qz4 + "\t" + this.qz5;
	}
	
}