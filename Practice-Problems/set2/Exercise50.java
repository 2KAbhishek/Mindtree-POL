package set2;

public class Exercise50 {
	public static void main(String[] args) {
		Helper h = new Helper();
		boolean cont = true;
		do {
			System.out.println(
					"Enter your choice : \n1) Check number palindrome\n2) Check string palindrome\n" + "3) Exit");
			int ip = h.getPosIntZero();
			switch (ip) {
			case 1:
				System.out.println("Checking number");
				System.out.print("Enter the number : ");
				int num = h.getInt();
				checkPalindrome("" + num);
				break;
			case 2:
				System.out.println("Checking string");
				System.out.print("Enter the string : ");
				String s = h.scan.next();
				checkPalindrome(s);
				break;
			case 3:
				System.out.println("Bye!");
				cont = false;
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		} while (cont);
	}

	private static void checkPalindrome(String s) {
		String rev = "";
		if (s.charAt(0) == '-') {
			s = subStr(1, s.length() - 1, s);
		}
		for (int i = s.length() - 1; i >= 0; i--)
			rev += s.charAt(i);
		if (s.equals(rev))
			System.out.println("Palindrome.");
		else
			System.out.println("Not Palindrome.");
	}

	private static String subStr(int begin, int end, String str) {
		String out = "";
		for (int i = begin; i <= end; i++) {
			out += str.charAt(i);
		}
		return out;
	}

}
