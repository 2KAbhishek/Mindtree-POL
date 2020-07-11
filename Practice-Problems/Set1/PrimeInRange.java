import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range to check : ");
		int low = scan.nextInt();
		int high = scan.nextInt();
		scan.close();
		List<Integer> primes = primeList(low, high);
		for (int prime : primes) System.out.print(prime + ", ");
	}

	public static List<Integer> primeList(int low, int high) {
		List<Integer> primes = new LinkedList<>();
		for (int num = low > 2 ? low : 2; num <= high; num++) {
			if (isPrime(num)) {
				primes.add(num);
			}
		}
		return primes;
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
