import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size : ");
		String[] arr = new String[scan.nextInt()];
		scan.nextLine();
		System.out.println("Enter the elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextLine();
		}
		System.out.println("Which sort? [Insertion/Bubble] : ");
		String which = scan.nextLine();
		scan.close();
		
		if (which.equalsIgnoreCase("Bubble")) {
			arr = bubbleSort(arr);
		} else {
			arr = insertionSort(arr);			
		}
		System.out.println("After sorting : ");
		for (String x: arr) System.out.print(x + ", ");
	}

	private static String[] bubbleSort(String[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n-1; i++) {
			swapHappened = false;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened) break;
		}
		return arr;
	}

	private static String[] insertionSort(String[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String curr = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(curr) > 0) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = curr;
		}
		return arr;
	}

}
