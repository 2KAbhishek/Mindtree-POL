package set1;

import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String sen = scan.nextLine();
		scan.close();
		String lowSen = "";
		for (int i = 0; i < sen.length(); i++) {
			lowSen += (char) (Helper.isLowerCase(sen.charAt(i)) ? sen.charAt(i) : sen.charAt(i) + 32);
		}

		String cmpSen = compress(lowSen);
		if (sen.length() < cmpSen.length())
			System.out.println("Cannot be compressed.");
		else
			System.out.println(cmpSen);
	}

	private static String compress(String str) {
		int length = str.length();
		String cstr = "";

		int count = 1;

		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				cstr += str.charAt(i) + "" + count;
				break;
			}

			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				cstr += str.charAt(i) + "" + count;
				count = 1;
			}
		}
		return cstr;
	}

}
