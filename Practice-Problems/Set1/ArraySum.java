import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements : ");
		int size = scan.nextInt();
		int [] arr = new int[size];
		int result = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Entered array : ");
		for (int n : arr) {
			System.out.print(n + " ");
			result += n;
		}
		System.out.println();
		System.out.println("Sum of elements : " + result);
	}

}
