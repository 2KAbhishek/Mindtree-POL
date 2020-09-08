package set2;

public class FibRecurse {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.print("Enter number to find fibonacci of : ");
		int n = h.getPosInt();
		System.out.println("Fibonacci of " + n + " : " + fib(n));
	}

	static int fib(int n) {
		if (n < 2) {
			return 1;
		}
		else return fib(n-2) + fib(n-1);
	}

}
