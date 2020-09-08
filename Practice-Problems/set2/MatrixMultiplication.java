package set2;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.println("Enter 1st matrix row and columns : ");
		int m1 = h.getPosInt();
		int n1 = h.getPosInt();
		System.out.println("Enter 2nd matrix row and columns : ");
		int m2 = h.getPosInt();
		int n2 = h.getPosInt();
		if (n1 != m2) {
			System.out.println("Multiplication not possible.");
			System.exit(1);
		}

		int[][] mat1 = new int[m1][n1];
		int[][] mat2 = new int[m2][n2];

		System.out.println("Enter 1st matrix's elements : ");
		for (int row = 0; row < m1; row++)
			for (int col = 0; col < n1; col++)
				mat1[row][col] = h.getInt();

		System.out.println("Enter 2nd matrix's elements : ");
		for (int row = 0; row < m2; row++)
			for (int col = 0; col < n2; col++)
				mat2[row][col] = h.getInt();

		int[][] res = mulMatrices(mat1, mat2);

		System.out.println("Resultant matrix : ");
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[0].length; col++)
				System.out.print(res[row][col] + "\t");
			System.out.println();
		}
	}

	private static int[][] mulMatrices(int[][] mat1, int[][] mat2) {
		int m1 = mat1.length, n1 = mat1[0].length, n2 = mat2[0].length;
		int[][] res = new int[m1][n2];
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n2; j++) {
				for (int k = 0; k < n1; k++) {
					res[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return res;
	}

}
