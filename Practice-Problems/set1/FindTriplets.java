package set1;

public class FindTriplets {

	public static void main(String[] args) {
		System.out.print("Enter the size of array : ");
		int[] arr = new int[Helper.getPosInt()];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Helper.getInt();
		}
		printTriplets(arr);
	}

	private static void printTriplets(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key1 = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int key2 = arr[j];
				int sum = key1 + key2;
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[k] == sum)
						System.out.println("<" + key1 + "," + key2 + "," + sum + ">");
				}
			}
		}
	}

}
