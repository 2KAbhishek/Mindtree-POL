package set2;

public class TransposeMatrix {

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.print("Enter number of rows : ");
		int m = h.getPosInt();
		System.out.print("Enter number of columns : ");
		int n = h.getPosInt();

		int[][] mat = new int[m][n];

		System.out.println("Enter 1st matrix's elements : ");
		for (int row = 0; row < m; row++)
			for (int col = 0; col < n; col++)
				mat[row][col] = h.getInt();

		System.out.println("Entered matrix : ");
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++)
				System.out.print(mat[row][col] + "\t");
			System.out.println();
		}
		int[][] res = transposeMatrix(mat);

		System.out.println("Transposed matrix : ");
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++)
				System.out.print(res[row][col] + "\t");
			System.out.println();
		}
	}

	private static int[][] transposeMatrix(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[][] res = new int[n][m];
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++)
				res[col][row] = mat[row][col];
		}
		return res;
	}

}
