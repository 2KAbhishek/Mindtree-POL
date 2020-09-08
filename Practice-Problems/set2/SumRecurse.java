package set2;

public class SumRecurse {
	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.print("Enter no. of elements : ");
		int[] arr = new int[h.getPosInt()];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = h.getInt();
		}
		System.out.println("Sum of elements : " + sum(arr, arr.length));
	}

	static int sum(int[] arr, int n) {
		if (n < 1)
			return 0;
		else
			return (sum(arr, n - 1) + arr[n - 1]);
	}

}
