package set2;

public class Exercise36 {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("Enter the size of 1st array : ");
		int size = h.getPosInt();
		int[] array1 = new int[size];
		System.out.println("Enter " + size + " elements : ");
		for (int i = 0; i < size; i++) {
			array1[i] = h.getPosInt();
		}

		System.out.println("Enter the size of 2nd array : ");
		size = h.getPosInt();
		int[] array2 = new int[size];
		System.out.println("Enter " + size + " elements : ");
		for (int i = 0; i < size; i++) {
			array2[i] = h.getPosInt();
		}

		int[] arr = uniqElements(array1, array2);

		for (int i : arr)
			System.out.print(i + ",");
	}

	public static int[] uniqElements(int array1[], int array2[]) {
		Helper h = new Helper();
		int[] allElems = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++)
			allElems[i] = array1[i];
		for (int i = 0; i < array2.length; i++)
			allElems[i + array2.length - 1] = array2[i];

		int uniq = 0;
		int[] uniqAll = new int[allElems.length];

		for (int elem : allElems) {
			if (h.found(array1, elem) ^ h.found(array2, elem)) {
				uniqAll[uniq] = elem;
				uniq += 1;
			}
		}

		int[] result = new int[uniq];
		for (int i = 0; i < uniq; i++)
			result[i] = uniqAll[i];

		return result;
	}

}
