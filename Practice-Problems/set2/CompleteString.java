package set2;

public class CompleteString {
	static Helper h = new Helper();

	public static void main(String[] args) {
		System.out.println("Enter the string to check: ");
		String str = h.scan.nextLine();
		if (isComplete(str)) {
			System.out.println("Complete String.");
		} else {
			System.out.println("Incomplete String.");
		}
	}

	static boolean isComplete(String str) {
		str = h.lowerCase(str);
		for (int i = 97; i < 123; i++) {
			char c = (char) i;
			if (!h.found(str, c))
				return false;
		}
		return true;
	}

}
