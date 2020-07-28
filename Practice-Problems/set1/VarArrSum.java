import java.util.Scanner;

public class VarArrSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements for 1st Array: ");
		int size = scan.nextInt();
		double [] arr = new double[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("Enter no. of elements for 2nd Array: ");
		int size2 = scan.nextInt();
		double [] arr2 = new double[size2];
		for (int i = 0; i < size2; i++) {
			arr2[i] = scan.nextInt();
		}
		scan.close();
		
		double[] result = new double[size>size2? size:size2];
		
		for (int i = 0; i < arr.length || i < arr2.length; i++) {
			if (i < arr.length && i < arr2.length) result[i] = arr[i] + arr2[i];
			if (i > arr.length - 1) result[i] = arr2[i];
			if (i > arr2.length - 1) result[i] = arr[i];
		}
		
		System.out.println("Summed array : ");
		for (double n : result) {
			System.out.print(n + " ");
		}
		
	}

}
