import java.util.Scanner;

public class RevDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		int rev = 0;
		while (num > 0) {
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		System.out.println("Reversed Number : " + rev);
	}
}
