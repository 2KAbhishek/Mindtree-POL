package set1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		boolean next = true;
		do {
			System.out.print("Which type of elements? \n 1)Integer \n 2)String \n 3)Exit : ");
			int which = Helper.getPosInt();

			switch (which) {

			case 1:
				System.out.print("Enter array size : ");
				int size = Helper.getPosInt();
				int[] arr = new int[size];
				System.out.println("Enter the elments: ");
				for (int i = 0; i < size; i++) {
					arr[i] = Helper.getInt();
				}

				arr = Helper.bubbleSort(arr);
				System.out.print("Enter element to search : ");
				int search = Helper.getInt();
				boolean found = findElement(arr, search);

				if (found)
					System.out.println(search + " found.");
				else
					System.out.println(search + " not found");
				break;

			case 2:
				System.out.println("Enter array size : ");
				int sizeStr = Helper.getPosInt();
				Scanner scan = new Scanner(System.in);
				String[] strArr = new String[sizeStr];

				System.out.println("Enter the elements : ");
				for (int i = 0; i < sizeStr; i++) {
					strArr[i] = scan.nextLine();
				}

				strArr = Helper.bubbleSortStr(strArr);

				System.out.print("Enter element to search : ");
				String searchStr = scan.nextLine();
				scan.close();
				boolean strFound = findString(strArr, searchStr);

				if (strFound)
					System.out.println(searchStr + " found.");
				else
					System.out.println(searchStr + " not found");
				break;
			case 3:
				System.out.println("Bye!");
				next = false;
				break;
			default:
				System.out.println("Invalid Input");
				continue;
			}
		} while (next);

	}

	private static boolean findString(String[] arr, String name) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (name.compareTo(arr[mid]) == 0) {
				return true;
			} else if (name.compareTo(arr[mid]) > 0) {
				start = mid + 1;
			} else
				end = mid - 1;
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
			} else
				end = mid - 1;
		}
		return false;
	}

}
