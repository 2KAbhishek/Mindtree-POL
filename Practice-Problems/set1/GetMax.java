package set1;

public class GetMax {

	public static void main(String[] args) {
		System.out.print("Entere three numbers : ");
		int a = Helper.getInt();
		int b = Helper.getInt();
		int c = Helper.getInt();
		int max = getMax(a, b, c);
		System.out.println("Biggest : " + max);
	}

	public static int getMax(int a, int b, int c) {
		int res = a > b ? a : b;
		return res > c ? res : c;
	}

}
