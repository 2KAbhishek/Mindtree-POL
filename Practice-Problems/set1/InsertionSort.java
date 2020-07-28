package set1;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.print("Enter array size : ");
		int[] arr = new int[Helper.getPosInt()];
		System.out.println("Enter the elments : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Helper.getInt();
		}
		arr = insertionSort(arr);
		System.out.println("After sorting : ");
		for (int x : arr)
			System.out.print(x + ", ");
	}

	private static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int curr = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > curr) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = curr;
		}
		return arr;
	}

}
