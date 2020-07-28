package set1;

public class Factorial {

	public static void main(String[] args) {
		int num = Helper.getPosIntZero();
		System.out.println("Factorial is : " + factorial(num));
	}

	private static long factorial(int num) {
		long result = 1;
		while (num > 0) {
			result *= num--;
		}
		return result;
	}

}
