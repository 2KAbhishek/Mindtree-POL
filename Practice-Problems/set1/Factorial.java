import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		long result = 1;
		while (num > 0) {
			result *= num--;
		}
		System.out.println("Factorial is : " + result);
	}

}
