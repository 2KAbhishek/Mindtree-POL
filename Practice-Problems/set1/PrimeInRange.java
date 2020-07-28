package set1;

public class PrimeInRange {

	public static void main(String[] args) {
		System.out.println("Enter range to check : ");
		int low = Helper.getInt();
		int high = Helper.getInt();
		
		if (low > high) {
			System.out.println("(empty list)");
		}
		
		int[] primes = primeList(low, high);
		for (int prime : primes)
			System.out.print(prime + ", ");
	}

	public static int[] primeList(int low, int high) {
		int[] temp = new int[100];
		int count = 0;
		for (int num = low > 2 ? low : 2; num <= high; num++) {
			if (isPrime(num)) {
				temp[count++] = num;
			}
		}
		int[] out = new int[count];

		for (int i = 0; i < out.length; i++) {
			out[i] = temp[i];
		}
		return out;
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
