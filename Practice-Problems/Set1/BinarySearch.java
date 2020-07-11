import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = scan.nextInt();
		scan.nextLine();
		System.out.print("Which type of elements? [String/Integer] : ");
		String which = scan.nextLine();
		
		if (which.equalsIgnoreCase("Integer")) {
			int[] arr = new int[size];
			System.out.println("Enter the elments in sorted order : ");
			for (int i = 0; i < size; i++) {
				arr[i] = scan.nextInt();
			}
			
			System.out.print("Enter element to search : ");
			int search = scan.nextInt();
			scan.close();
			boolean found = findElement(arr, search);
			
			if (found) System.out.println(search + " found.");
			else System.out.println(search + " not found");
		}
		
		if (which.equalsIgnoreCase("String")) {
			String[] arr = new String[size];
			System.out.println("Enter the elements in a lexographically sorted order : ");
			for (int i = 0; i < size; i++) {
				arr[i] = scan.nextLine();
			}
			System.out.print("Enter element to search : ");
			String search = scan.nextLine();
			scan.close();
			boolean found = findString(arr, search);
			
			if (found) System.out.println(search + " found.");
			else System.out.println(search + " not found");
		}

	}

	private static boolean findString(String[] arr, String name) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (name.compareTo(arr[mid]) == 0) {
				return true;
			} else if (name.compareTo(arr[mid]) > 0) {
				start = mid + 1;
			} else end = mid - 1;
		}
		return false;
	}

	private static boolean findElement(int[] arr, int key) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == (arr[mid])) {
				return true;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else end = mid - 1;
		}
		return false;
	}

}
