package set2;

public class Exercise51 {
	static Helper h = new Helper();
	public static void main(String[] args) {
		System.out.print("Emter size of array : ");
		int n = h.getPosInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++)
			arr[i] = h.getPosInt();
		int[] res = distinctDups(arr);
		
		System.out.println("Unique Duplicates:");
		for (int dup: res) {
			System.out.print(dup + ",");
		}
	}

	private static int[] distinctDups(int[] arr) {
		arr = h.bubbleSort(arr);
		int[] out = new int[arr.length/2];
		int outSize = 0;
		for (int n : arr) {
			int count = count(n,arr);
			if ((count > 1) && (!h.found(out, n))){
				out[outSize] = n;
				outSize++;
			}
		}
		if (outSize == 0) return new int[] {-1};
		int[] dups = new int[outSize];
		for (int i = 0; i < outSize; i++) {
			dups[i] = out[i];
		}
		return dups;
	}

	private static int count(int n, int[] arr) {
		int count = 0;
		for (int x: arr) {
			if (n == x) count++;
		}
		return count;
	}
	
}
