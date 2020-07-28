package set1;

import java.util.Scanner;

public class Helper {
	static Scanner scan = new Scanner(System.in);

	public static int getInt() {
		while (!scan.hasNextInt()) {
			System.out.print("Only integers allowed.\nEnter an integer : ");
			scan.next();
		}
		int num = scan.nextInt();
		return num;
	}

	public static int getPosInt() {
		while (!scan.hasNextInt()) {
			System.out.print("Only integers allowed.\nEnter a positive integer : ");
			scan.next();
		}
		int num = scan.nextInt();
		if (num <= 0) {
			System.out.print("Please enter a positive integer only : ");
			num = getPosInt();
		}
		return num;
	}

	public static int getPosIntZero() {
		while (!scan.hasNextInt()) {
			System.out.print("Only integers allowed.\nEnter a positive integer : ");
			scan.next();
		}
		int num = scan.nextInt();
		if (num < 0) {
			System.out.print("Please enter a positive integer only : ");
			num = getPosIntZero();
		}
		scan.close();
		return num;
	}

	public static double getDouble() {
		while (!scan.hasNextDouble()) {
			System.out.print("Only double values allowed.\nEnter a number : ");
			scan.next();
		}
		double num = scan.nextDouble();
		return num;
	}

	public static double getPosDouble() {
		while (!scan.hasNextDouble()) {
			System.out.print("Only double values allowed.\nEnter a positive number : ");
			scan.next();
		}
		double num = scan.nextDouble();
		if (num <= 0) {
			System.out.print("Please enter a positive number only : ");
			num = getPosDouble();
		}
		return num;
	}

	public static float getPosFloat() {
		while (!scan.hasNextFloat()) {
			System.out.print("Only double values allowed.\nEnter a positive number : ");
			scan.next();
		}
		float num = scan.nextFloat();
		if (num <= 0) {
			System.out.print("Please enter a positive number only : ");
			num = getPosFloat();
		}
		return num;
	}

	public static long getPosLong() {
		while (!scan.hasNextLong()) {
			System.out.print("Only long values allowed.\nEnter a positive number : ");
			scan.next();
		}
		long num = scan.nextLong();
		if (num <= 0) {
			System.out.print("Please enter a positive number only : ");
			num = getPosLong();
		}
		return num;
	}

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n - 1; i++) {
			swapHappened = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened)
				break;
		}
		return arr;
	}

	public static String[] bubbleSortStr(String[] arr) {
		int n = arr.length;
		boolean swapHappened;
		for (int i = 0; i < n - 1; i++) {
			swapHappened = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapHappened = true;
				}
			}
			if (!swapHappened)
				break;
		}
		return arr;
	}

	public static boolean isUpperCase(char c) {
		if ((c >= 'A') && (c <= 'Z'))
			return true;
		return false;
	}

	public static boolean isLowerCase(char c) {
		if ((c >= 'a') && (c <= 'z'))
			return true;
		return false;
	}

	public static boolean isAlphabet(char c) {
		if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))
			return true;
		return false;
	}

}
