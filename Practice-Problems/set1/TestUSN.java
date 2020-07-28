package set1;

import java.util.Scanner;

public class TestUSN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter University Serial Number : ");
		String usn = scan.nextLine();
		scan.close();
		if (validUSN(usn))
			System.out.println("Success");
		else
			System.out.println("Failure");
	}

	private static boolean validUSN(String usn) {
		String temp = usn.substring(5, 7);
		if (usn.length() != 10)
			return false;
		if (usn.charAt(0) != '1' && usn.charAt(0) != '2')
			return false;
		if (!Character.isUpperCase(usn.charAt(1)) && !Character.isUpperCase(usn.charAt(2)))
			return false;
		if (!Character.isDigit(usn.charAt(3)) && !Character.isDigit(usn.charAt(4)))
			return false;
		if (!(temp.equals("CS") || temp.equals("IS") || temp.equals("EC") || temp.equals("ME")))
			return false;
		if (!Character.isDigit(usn.charAt(7)) && !Character.isDigit(usn.charAt(8)) && !Character.isDigit(usn.charAt(9)))
			return false;
		return true;
	}

}
