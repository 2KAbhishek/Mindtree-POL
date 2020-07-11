import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to check: ");
		long num = scan.nextLong();
		scan.close();
		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

	private static boolean isPrime(long num) {
		boolean isPrime = true;
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
