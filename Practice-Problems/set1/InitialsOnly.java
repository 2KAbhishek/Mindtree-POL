import java.util.Scanner;

public class InitialsOnly {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full name : ");
		String name = scan.nextLine();
		System.out.print("Enter age : ");
		int age = scan.nextInt();
		scan.close();
		String initials = "";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) initials += c;
		}
		String password = initials + String.valueOf(age);
		while (password.length() < 8) {
			password += String.valueOf(age) + initials;
		}
		System.out.println("Password : " + password);
	}

}
