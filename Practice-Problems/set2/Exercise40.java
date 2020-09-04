package set2;

public class Exercise40 {
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

		boolean magic = isMagic(mat);
		System.out.println("Magic? : " + magic);
	}

	static boolean isMagic(int mat[][]) {
		int N = mat.length;
		if (N != mat[0].length) {
			return false;
		}

		// Diagonal
		int sum = 0, diagSum = 0;
		for (int i = 0; i < N; i++)
			sum += mat[i][i];
		for (int i = 0; i < N; i++)
			diagSum += mat[i][N - 1 - i];

		if (sum != diagSum)
			return false;

		// Rows
		for (int i = 0; i < N; i++) {
			int rowSum = 0;
			for (int j = 0; j < N; j++)
				rowSum += mat[i][j];

			if (rowSum != sum)
				return false;
		}

		// Columns
		for (int i = 0; i < N; i++) {
			int colSum = 0;
			for (int j = 0; j < N; j++)
				colSum += mat[j][i];

			if (sum != colSum)
				return false;
		}

		return true;
	}

}
