package set2;

public class Exercise27 {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("Enter Employee ID ");
		int empID = h.getPosInt();
		System.out.println("Enter Employee Name ");
		String empName = h.scan.nextLine();
		System.out.println("Enter Employee Designation ");
		String empDesg = h.scan.nextLine();
		System.out.println("Enter Employee Department ");
		String empDept = h.scan.nextLine();
		Employee emp = new Employee(empID, empName, empDesg, empDept);
		emp.setEmpName("");
		emp.setEmpDept("DevOps");
		emp.setEmpDesg("lead");
		System.out.println(emp.toString());
	}

}
