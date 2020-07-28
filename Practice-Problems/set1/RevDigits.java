package set1;

import java.util.Scanner;

public class RevDigits {
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		String ops = scan.nextLine();
		scan.close();
		String pos = "";
		String neg = "-";
		
		/*
		 * int rev = 0; while (num > 0) { rev *= 10; rev += num % 10; num /= 10;
		 */

		if (ops.charAt(0) == '-') {
			neg += reverse(subStr(1, ops.length() - 1, ops));
			System.out.println("Reversed Number : " + neg);
		} else {
			pos = reverse(ops);
			System.out.println(pos);
			System.out.println("Reversed Number : " + pos);
		}
	}

	private static String reverse(String str) {
		String out = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			out += str.charAt(i);
		}

		return out;
	}

	private static String subStr(int begin, int end, String str) {
		String out = "";
		for (int i = begin; i <= end; i++) {
			out += str.charAt(i);
		}
		return out;
	}
}
