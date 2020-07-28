package set1;

import java.util.Scanner;

public class InitialsOnly {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full name : ");
		String name = scan.nextLine();
		String initials = "";

		scan.close();
		for (int i = 0; i < name.length(); i++) {
			if (Helper.isUpperCase(name.charAt(i))) initials += name.charAt(i);
		}

		System.out.println("Initals : " + initials);
	}

}
