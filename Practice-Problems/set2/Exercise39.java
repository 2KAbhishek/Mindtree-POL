package set2;

public class Exercise39 {

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.print("Enter matrix row length : ");
		int m = h.getPosInt();

		System.out.print("Enter matrix col length : ");
		int n = h.getPosInt();

		int[][] mat = new int[m][n];

		System.out.println("Enter matrix's elements : ");
		for (int row = 0; row < m; row++)
			for (int col = 0; col < n; col++)
				mat[row][col] = h.getInt();

		boolean rowMagic = isRowMagic(mat);
		System.out.println("isRowMagic? : " + rowMagic);

	}

	private static boolean isRowMagic(int[][] mat) {
		boolean rowMagic = true;
		int m = mat.length, n = mat[0].length;
		int prevSum = 0;
		for (int row = 0; row < m; row++) {
			int rowSum = 0;
			for (int col = 0; col < n; col++) {
				rowSum += mat[row][col];
			}
			if (row == 0)
				prevSum = rowSum;
			else if (rowSum != prevSum) {
				rowMagic = false;
				break;
			}
		}
		return rowMagic;
	}

}
