package set2;

public class Employee {
	private int empID;
	private String empName, empDesg, empDept;

	public Employee() {
		super();
	}

	public Employee(int empID, String empName, String empDesg, String empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empDept = empDept;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		try {
			if (empName.length() > 0)
				this.empName = empName;
			else
				System.out.println("Name can't be empty.");
		} catch (NullPointerException e) {
			System.out.println("Name can't be null." + e.getMessage());
		}
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		String[] allowed = { "developer", "tester", "lead", "manager" };
		boolean found = false;

		for (String str : allowed) {
			if (str == empDesg)
				found = true;
		}

		if (found)
			this.empDesg = empDesg;
		else
			System.out.println("Invalid designation.");
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		String[] allowed = { "TTH", "RCM", "Digital", "DevOps" };
		boolean found = false;

		for (String str : allowed) {
			if (str == empDept)
				found = true;
		}

		if (found)
			this.empDept = empDept;
		else
			System.out.println("Invalid department.");
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empDesg=" + empDesg + ", empDept=" + empDept
				+ "]";
	}

}
