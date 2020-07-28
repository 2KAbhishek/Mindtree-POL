package set1;

public class VarArrSum {

	public static void main(String[] args) {
		System.out.print("Enter no. of elements for 1st Array: ");
		int size = Helper.getPosInt();
		double[] arr = new double[size];
		System.out.println("Enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = Helper.getDouble();
		}

		System.out.print("Enter no. of elements for 2nd Array: ");
		int size2 = Helper.getPosInt();

		System.out.println("Enter " + size2 + " elements :");
		double[] arr2 = new double[size2];
		for (int i = 0; i < size2; i++) {
			arr2[i] = Helper.getDouble();
		}

		int[] result = new int[size > size2 ? size : size2];

		for (int i = 0; i < arr.length || i < arr2.length; i++) {
			if (i < arr.length && i < arr2.length)
				result[i] = (int) (arr[i] + arr2[i]);
			if (i > arr.length - 1)
				result[i] = (int) arr2[i];
			if (i > arr2.length - 1)
				result[i] = (int) arr[i];
		}

		System.out.println("Summed array : ");
		for (int n : result) {
			System.out.print(n + " ");
		}

	}

}
