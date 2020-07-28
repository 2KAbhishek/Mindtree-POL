package set1;

public class Prime {

	public static void main(String[] args) {
		System.out.print("Enter number to check: ");
		long num = Helper.getPosLong();
		if (isPrime(num)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean isPrime(long num) {
		boolean isPrime = true;
		for (long i = 2; i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
