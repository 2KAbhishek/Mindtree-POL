package set1;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.print("Enter array size : ");
		int[] arr = new int[Helper.getPosInt()];
		System.out.println("Enter the elments : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Helper.getInt();
		}
		arr = Helper.bubbleSort(arr);
		System.out.print("Enter element to search : ");
		int search = Helper.getInt();
		boolean found = linearSearch(search, arr);

		if (found)
			System.out.println(search + " found.");
		else
			System.out.println(search + " not found");
	}

	private static boolean linearSearch(int search, int[] arr) {
		boolean exists = false;
		for (int x : arr) {
			if (search == x) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
}
