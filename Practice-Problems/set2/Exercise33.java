package set2;

public class Exercise33 {
	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.println("Enter Student ID : ");
		int studentId = h.getPosInt();
		System.out.println("Enter Student name : ");
		String studentName = h.scan.next();
		System.out.println("Second chance? True/False : ");
		String bool = h.scan.next();
		Student stu = new Student(studentId, studentName, bool);

		if (stu.getSecondChance()) {
			System.out.println("Enter marks for both tests : ");
			stu.identifyMarks(h.getPosFloat(), h.getPosFloat());
		} else {
			System.out.println("Enter marks for test: ");
			stu.identifyMarks(h.getPosFloat());
		}
//		System.out.println(stu.toString());
	}
}
