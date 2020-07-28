package set1;

public class ArraySum {

	public static void main(String[] args) {
		System.out.print("Enter no. of elements : ");
		int size = Helper.getPosInt();
		int[] arr = new int[size];
		int result = 0;

		System.out.println("Enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = Helper.getInt();
		}

		System.out.println("Entered array : ");
		for (int n : arr) {
			System.out.print(n + " ");
			result += n;
		}
		System.out.println();
		System.out.println("Sum of elements : " + result);
	}

}
