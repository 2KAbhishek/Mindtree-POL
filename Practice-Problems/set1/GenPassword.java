package set1;

import java.util.Scanner;

public class GenPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full name : ");
		String name = scan.nextLine();
		System.out.print("Enter age : ");
		int age = Helper.getPosInt();
		scan.close();
		String initials = "";

		for (int i = 0; i < name.length(); i++) {
			if (Helper.isUpperCase(name.charAt(i))) 
				initials += name.charAt(i);
		}

		String password = initials + age;

		while (password.length() < 8) {
			password += age + initials;
		}
		System.out.println("Password : " + password);
	}
}
