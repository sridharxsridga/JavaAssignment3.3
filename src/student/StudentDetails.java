package student;
/*
 * This class holds Student Details and his Results.
 * 
 */

public class StudentDetails {
	private String studentRollNumber;
	private String StudentName;
	private int subject1Marks;
	private int subject2Marks;
	private int subject3Marks;
	private int totalMarks;
	private float percentage;
	private String result;

	StudentDetails(String studentRollNumber, String StudentName, int subject1Marks, int subject2Marks,
			int subject3Marks) {
		this.studentRollNumber = studentRollNumber;
		this.StudentName = StudentName;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;

	}

	//method to calculate total marsk scored 
	public int calculateTotalMarks() {
		return this.totalMarks = this.subject1Marks + this.subject2Marks + this.subject3Marks;

	}

	//method to calculate percentage 
	public float clacluatePercentage() {

		return percentage = (totalMarks * 100) / 300;

	}

	public int getTotalMarks() {   
		return calculateTotalMarks();
	}

	public float getPercentage() {

		return clacluatePercentage();
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getSubject1Marks() {
		return subject1Marks;
	}

	public void setSubject1Marks(int subject1Marks) {
		this.subject1Marks = subject1Marks;
	}

	public int getSubject2Marks() {
		return subject2Marks;
	}

	public void setSubject2Marks(int subject2Marks) {
		this.subject2Marks = subject2Marks;
	}

	public int getSubject3Marks() {
		return subject3Marks;
	}

	public void setSubject3Marks(int subject3Marks) {
		this.subject3Marks = subject3Marks;
	}

	
	//Method to calculate pass or fail based on percentage.
	public String getResult() {
		if (getPercentage() < 35)
			return "Fail";
		else
			return "Pass";
	}

	// ToString() method to print student's Result
	@Override
	public String toString() {

		return " RollNumber:" + getStudentRollNumber() + " Name :" + getStudentName() + "  \n Subject1 Marks :"
				+ getSubject1Marks() + "\n Subject2 Marks :" + getSubject2Marks() + "\n Subject3 Marks :"
				+ getSubject3Marks() + "\n Total Marks :" + getTotalMarks() + " \n Percentage :" + getPercentage() + "%"
				+ " Result:" + getResult();
	}



}
