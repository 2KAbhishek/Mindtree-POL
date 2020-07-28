package set1;

import java.util.Scanner;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence : ");
		String sen = scan.nextLine();
		scan.close();
		char ch = ' ';
		String result = " ";

		for (int i = 0; i < sen.length(); i++) {
			if (sen.charAt(i) >= 'a' && sen.charAt(i) <= 'z')
				ch = (char) (sen.charAt(i) - 32);
			else
				ch = sen.charAt(i);
			result += ch;
		}

		String[] com = new String[result.length()];
		int index = 0;

		for (int i = 0; i < result.length() - 1; i++) {
			int first = (int) result.charAt(i);
			int second = (int) result.charAt(i + 1);

			if (second - first == 1) {
				String test = sub(i, result);
				if (!partOf(test, com)) {
					com[index] = test;
					index++;
					int count = 0;

					for (int j = 0; j < result.length() - 1; j++) {
						if (test.compareTo(sub(j, result)) == 0)
							count++;
					}

					if (count > 0)
						System.out.println(test + " " + count);
				}
			}
		}

	}

	public static String sub(int i, String str) {
		String s = "" + str.charAt(i) + str.charAt(i + 1);
		return s;
	}

	public static boolean partOf(String str, String[] strArr) {
		boolean flag = false;
		try {
			for (int i = 0; i < strArr.length; i++) {
				if (str.compareTo(strArr[i]) == 0)
					flag = true;
			}
		} catch (Exception e) {
		}

		return flag;
	}
}
