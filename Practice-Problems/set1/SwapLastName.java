package set1;

import java.util.Scanner;

public class SwapLastName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two names : ");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		scan.close();
		String firstName1 = "", firstName2 = "", lastName1 = "", lastName2 = "";

		for (int i = 0; i < name1.length(); i++) {
			char c = name1.charAt(i);
			if (c == ' ') {
				firstName1 = subStr(0, i, name1);
				lastName1 = subStr(i + 1, name1.length() - 1, name1);
			}
		}

		for (int i = 0; i < name2.length(); i++) {
			char c = name2.charAt(i);
			if (c == ' ') {
				firstName2 = subStr(0, i, name2);
				lastName2 = subStr(i + 1, name2.length() - 1, name2);
			}
		}

		String newName1 = firstName1 + lastName2;
		String newName2 = firstName2 + lastName1;
		System.out.println("After swapping : " + newName1 + " " + newName2);
	}

	private static String subStr(int begin, int end, String str) {
		String out = "";
		for (int i = begin; i <= end; i++) {
			out += str.charAt(i);
		}
		return out;
	}

}
