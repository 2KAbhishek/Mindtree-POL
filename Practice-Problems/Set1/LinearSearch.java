import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elments : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter element to search : ");
		int search = scan.nextInt();
		scan.close();
		boolean found = linearSearch(search, arr);
		
		if (found) System.out.println(search + " found.");
		else System.out.println(search + " not found");
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
