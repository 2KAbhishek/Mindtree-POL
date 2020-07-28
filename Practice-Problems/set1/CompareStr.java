package set1;

import java.util.Scanner;

public class CompareStr {
	char[] value = null;

	CompareStr(char[] value) {
		this.value = value;
	}

	public int compareTo(CompareStr anotherString) {
		int len1 = value.length;
		int len2 = anotherString.value.length;
		int lim = Math.min(len1, len2);
		char v1[] = value;
		char v2[] = anotherString.value;
		int k = 0;
		while (k < lim) {
			char c1 = v1[k];
			char c2 = v2[k];
			if (c1 != c2) {
				return c1 - c2;
			}
			k++;
		}
		return len1 - len2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1 = scan.nextLine();
		System.out.println("Enter String2:");
		String s2 = scan.nextLine();
		char[] value = new char[s1.length()];
		char[] value1 = new char[s2.length()];

		for (int i = 0; i < s1.length(); i++)
			value[i] = s1.charAt(i);

		for (int i = 0; i < s2.length(); i++)
			value1[i] = s2.charAt(i);

		CompareStr str = new CompareStr(value);
		CompareStr str1 = new CompareStr(value1);
		System.out.println("Strings differ by : " + str.compareTo(str1));
		scan.close();
	}
}