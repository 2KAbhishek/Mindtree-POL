package set2;

public class Exercise38 {

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.print("Enter matrix row length : ");
		int n = h.getPosInt();

		int[][] m1 = new int[n][n];
		int[][] m2 = new int[n][n];

		System.out.println("Enter 1st matrix's elements : ");
		for (int row = 0; row < n; row++)
			for (int col = 0; col < n; col++)
				m1[row][col] = h.getInt();

		System.out.println("Enter 2nd matrix's elements : ");
		for (int row = 0; row < n; row++)
			for (int col = 0; col < n; col++)
				m2[row][col] = h.getInt();

		int[][] res = sumMatrices(m1, m2);

		System.out.println("Resultant matrix : ");
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++)
				System.out.print(res[row][col] + "\t");
			System.out.println();
		}
	}

	private static int[][] sumMatrices(int[][] m1, int[][] m2) {
		int n = m1.length;
		int[][] res = new int[n][n];

		for (int row = 0; row < n; row++)
			for (int col = 0; col < n; col++)
				res[row][col] = m1[row][col] + m2[row][col];

		return res;
	}

}
