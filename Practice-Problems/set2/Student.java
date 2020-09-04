package set2;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	private boolean secondChance = false;

	public Student(int studentId, String studentName, String bool) {
		this.studentId = studentId;
		this.studentName = studentName;
		if (bool.equals("true") || bool.equals("True") || bool.equals("TRUE"))
			this.secondChance = true;
		else
			this.secondChance = false;
	}

	public void identifyMarks(float firstMarks) {
		this.marks = firstMarks;
	}

	public void identifyMarks(float firstMarks, float secondMarks) {
		this.marks = firstMarks > secondMarks ? firstMarks : secondMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public float getMarks() {
		return marks;
	}

	public boolean getSecondChance() {
		return secondChance;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks
				+ ", secondChance=" + secondChance + "]";
	}

}
