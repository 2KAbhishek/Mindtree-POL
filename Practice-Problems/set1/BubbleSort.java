import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		arr = bubbleSort(arr);
		System.out.println("Sorted array : ");
		for (int x: arr) System.out.print(x + ", ");
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapHappened;
		System.out.println("Intermediate Steps:");
		for (int i = 0; i < n-1; i++) {
			swapHappened = false;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapHappened = true;
				}
				for (int x : arr ) System.out.print(x + ", ");
				System.out.println();
			}
			if (!swapHappened) break;
		}
		return arr;
	}

}
