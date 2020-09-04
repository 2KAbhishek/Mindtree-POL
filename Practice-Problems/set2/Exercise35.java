package set2;

public class Exercise35 {

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.println("Enter no. of students : ");
		int n = h.getPosInt();
		StudentScore[] stus = new StudentScore[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter student id : ");
			int id = h.getPosInt();
			System.out.println("Enter student name : ");
			String name = h.scan.next();
			System.out.println("Enter student branch : ");
			String branch = h.scan.next();
			System.out.println("Enter student score : ");
			float score = h.getPosFloat();

			StudentScore stu = new StudentScore(id, name, branch, score);
			stus[i] = stu;
//			System.out.println(stu.toString());
		}
		System.out.println("Student with highest score : " + getHighScorer(stus).toString());
	}

	public static StudentScore getHighScorer(StudentScore[] stus) {
		StudentScore highScorer = new StudentScore();
		float highScore = 0;

		for (StudentScore stu : stus) {
			if (stu.getScore() > highScore) {
				highScorer = stu;
				highScore = stu.getScore();
			}
		}
		return highScorer;
	}
}
