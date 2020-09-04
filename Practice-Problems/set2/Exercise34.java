package set2;

public class Exercise34 {
	static Helper h = new Helper();

	public static void main(String[] args) {
		StudentRecord[] record = null;
		boolean cont = true;

		do {
			System.out.println("Enter your choice : \n1) Create new record\n"
					+ "2) Display sorted records based on branch\n" + "3) Display sorted Student ID\n0) Exit");
			int ip = h.getPosIntZero();
			switch (ip) {
			case 0:
				cont = false;
				break;
			case 1:
				System.out.println("Creating record");
				record = createRecord(record);
				break;
			case 2:
				if (record != null) {
					System.out.println("Displaying names sorted by branch");
					record = sortBranch(record);
					displayRecord(record);
				} else {
					System.out.println("Create record first.");
				}
				break;
			case 3:
				if (record != null) {
					System.out.println("Displaying sorted student ids");
					record = sortId(record);
					displayRecord(record);
				} else {
					System.out.println("Create record first.");
				}
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		} while (cont);

	}

	private static StudentRecord[] createRecord(StudentRecord[] record) {
		System.out.println("Enter number of records : ");
		int size = h.getPosInt();
		record = new StudentRecord[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter student id: ");
			int id = h.getPosInt();
			System.out.println("Enter student name: ");
			String name = h.scan.next();
			System.out.println("Enter student branch: ");
			String branch = h.scan.next();
			StudentRecord rec = new StudentRecord(id, name, branch);
			record[i] = rec;
		}
		return record;
	}

	public static void displayRecord(StudentRecord[] record) {
		for (StudentRecord rec : record)
			System.out.println(rec.toString());
	}

	private static StudentRecord[] sortId(StudentRecord[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n - 1; i++) {
			swapHappened = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].getId() > arr[j + 1].getId()) {
					StudentRecord temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened)
				break;
		}
		return arr;
	}

	public static StudentRecord[] sortBranch(StudentRecord[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n - 1; i++) {
			swapHappened = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].getBranch().compareTo(arr[j + 1].getBranch()) > 0) {
					StudentRecord temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened)
				break;
		}
		arr = sortName(arr);
		return arr;
	}

	public static StudentRecord[] sortName(StudentRecord[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n - 1; i++) {
			swapHappened = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
					StudentRecord temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened)
				break;
		}
		return arr;
	}

}
