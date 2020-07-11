import java.util.Scanner;

public class GetMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entere three numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int max = getMax(a,b,c);
		System.out.println("Biggest : " + max);
	}

	public static int getMax(int a, int b, int c) {
		int res = a > b ? a : b;
		return res > c ? res : c;
	}
}
